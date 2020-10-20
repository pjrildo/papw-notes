package dev.pjrildo.json;

import com.google.gson.Gson;

import dev.pjrildo.json.entities.Professor;
import dev.pjrildo.json.util.FileUtil;

public class Program {
	
	public static void main(String[] args) {
		
		Professor professor = new Professor(1, "Rodrigo Fujioka", "fujioka", "fujioka@unipe.br");
		
		Gson gson = new Gson();
		String professorJson = gson.toJson(professor); //converte objeto em string formatada como JSON
		
		String inputPath = "src\\main\\resources\\professor.json";
		String outputPath = "src\\main\\resources\\object.json";
		
		boolean success = FileUtil.writeJson(professorJson, outputPath);
		
		if(success) 
			System.out.println("JSON gravado com sucesso!");
		
		Professor professorLido = FileUtil.readJson(inputPath);
		
		if(professorLido != null) {
			System.out.println(professorLido);
		}
	}

}
