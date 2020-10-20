package dev.pjrildo.json.entities;

import java.util.ArrayList;
import java.util.List;

public class Member {
	
	private String name;
	private Integer age;
	private String secretIdentity;
	
	private List<String> powers = new ArrayList<>();
	
	public Member() {
		
	}

	public Member(String name, Integer age, String secretIdentity, List<String> powers) {
		this.name = name;
		this.age = age;
		this.secretIdentity = secretIdentity;
		this.powers = powers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSecretIdentity() {
		return secretIdentity;
	}

	public void setSecretIdentity(String secretIdentity) {
		this.secretIdentity = secretIdentity;
	}

	public List<String> getPowers() {
		return powers;
	}

}
