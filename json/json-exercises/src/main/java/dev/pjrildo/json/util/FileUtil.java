package dev.pjrildo.json.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

import dev.pjrildo.json.entities.Professor;

public class FileUtil {
	
	public static boolean writeJson(String json, String path) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			
			bw.write(json);
			
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
			return false;
		}
		
		return true;
	}
	
	//generalizar para qualquer tipo de json/classe?
	public static Professor readJson(String path) {
		Gson gson = new Gson();
		Professor professor;
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			professor = (Professor) gson.fromJson(br, Professor.class);
			
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
			return null;
		}
		
		return professor;
	}

}
