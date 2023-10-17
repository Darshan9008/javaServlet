package com.xworkz.form;

public class MatchDTO {

	private String tname;
	private String country;
	private String date;
	private String teamOne;
	private String teamTwo;
	private String captainOne;
	private String captainTwo;
	private String umpire;
	private String stadium;
	private String thirdUmpire;
	private String capacity;

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTeamOne() {
		return teamOne;
	}

	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}

	public String getTeamTwo() {
		return teamTwo;
	}

	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}

	public String getCaptainOne() {
		return captainOne;
	}

	public void setCaptainOne(String captainOne) {
		this.captainOne = captainOne;
	}

	public String getCaptainTwo() {
		return captainTwo;
	}

	public void setCaptainTwo(String captainTwo) {
		this.captainTwo = captainTwo;
	}

	public String getUmpire() {
		return umpire;
	}

	public void setUmpire(String umpire) {
		this.umpire = umpire;
	}

	public String getStadium() {
		return stadium;
	}

	public void setStadium(String stadium) {
		this.stadium = stadium;
	}

	public String getThirdUmpire() {
		return thirdUmpire;
	}

	public void setThirdUmpire(String thirdUmpire) {
		this.thirdUmpire = thirdUmpire;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public MatchDTO(String tname, String country, String date, String teamOne, String teamTwo, String captainOne,
			String captainTwo, String umpire, String stadium, String thirdUmpire, String capacity) {
		super();
		this.tname = tname;
		this.country = country;
		this.date = date;
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
		this.captainOne = captainOne;
		this.captainTwo = captainTwo;
		this.umpire = umpire;
		this.stadium = stadium;
		this.thirdUmpire = thirdUmpire;
		this.capacity = capacity;
	}

}
