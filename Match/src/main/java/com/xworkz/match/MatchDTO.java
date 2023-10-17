package com.xworkz.match;

public class MatchDTO {

	private String tournamentName;
	private String hostingCountry;
	private String matchDate;
	private String team1;
	private String team2;
	private String team1CaptainName;
	private String team2CaptainName;
	private String umpireName;
	private String stadiumName;
	private String thirdUmpireName;
	private String stadiumCapcity;
	
	public MatchDTO() {
		// TODO Auto-generated constructor stub
	}

	public MatchDTO(String tournamentName, String hostingCountry, String matchDate, String team1, String team2,
			String team1CaptainName, String team2CaptainName, String umpireName, String stadiumName,
			String thirdUmpireName, String stadiumCapcity) {
		super();
		this.tournamentName = tournamentName;
		this.hostingCountry = hostingCountry;
		this.matchDate = matchDate;
		this.team1 = team1;
		this.team2 = team2;
		this.team1CaptainName = team1CaptainName;
		this.team2CaptainName = team2CaptainName;
		this.umpireName = umpireName;
		this.stadiumName = stadiumName;
		this.thirdUmpireName = thirdUmpireName;
		this.stadiumCapcity = stadiumCapcity;
	}

	public String getTournamentName() {
		return tournamentName;
	}

	public void setTournamentName(String tournamentName) {
		this.tournamentName = tournamentName;
	}

	public String getHostingCountry() {
		return hostingCountry;
	}

	public void setHostingCountry(String hostingCountry) {
		this.hostingCountry = hostingCountry;
	}

	public String getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(String matchDate) {
		this.matchDate = matchDate;
	}

	public String getTeam1() {
		return team1;
	}

	public void setTeam1(String team1) {
		this.team1 = team1;
	}

	public String getTeam2() {
		return team2;
	}

	public void setTeam2(String team2) {
		this.team2 = team2;
	}

	public String getTeam1CaptainName() {
		return team1CaptainName;
	}

	public void setTeam1CaptainName(String team1CaptainName) {
		this.team1CaptainName = team1CaptainName;
	}

	public String getTeam2CaptainName() {
		return team2CaptainName;
	}

	public void setTeam2CaptainName(String team2CaptainName) {
		this.team2CaptainName = team2CaptainName;
	}

	public String getUmpireName() {
		return umpireName;
	}

	public void setUmpireName(String umpireName) {
		this.umpireName = umpireName;
	}

	public String getStadiumName() {
		return stadiumName;
	}

	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}

	public String getThirdUmpireName() {
		return thirdUmpireName;
	}

	public void setThirdUmpireName(String thirdUmpireName) {
		this.thirdUmpireName = thirdUmpireName;
	}

	public String getStadiumCapcity() {
		return stadiumCapcity;
	}

	public void setStadiumCapcity(String stadiumCapcity) {
		this.stadiumCapcity = stadiumCapcity;
	}

	
	
}
	

