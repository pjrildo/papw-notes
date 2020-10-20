package dev.pjrildo.json.entities;

import java.util.ArrayList;
import java.util.List;

public class Squad {
	
	private String name;
	private String homeTown;
	private Integer formed;
	private String secretBase;
	private Boolean active;
	
	private List<Member> members = new ArrayList<>();
	
	public Squad() {
		
	}

	public Squad(String name, String homeTown, Integer formed, String secretBase, Boolean active,
			List<Member> members) {
		this.name = name;
		this.homeTown = homeTown;
		this.formed = formed;
		this.secretBase = secretBase;
		this.active = active;
		this.members = members;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHomeTown() {
		return homeTown;
	}

	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}

	public Integer getFormed() {
		return formed;
	}

	public void setFormed(Integer formed) {
		this.formed = formed;
	}

	public String getSecretBase() {
		return secretBase;
	}

	public void setSecretBase(String secretBase) {
		this.secretBase = secretBase;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public List<Member> getMembers() {
		return members;
	}
	
	
}
