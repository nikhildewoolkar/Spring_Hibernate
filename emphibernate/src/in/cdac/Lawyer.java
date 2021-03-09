package in.cdac;

public class Lawyer {
	private int id;
	private String name;
	private int casesWon;
	private int casesLost;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCasesWon() {
		return casesWon;
	}

	public void setCasesWon(int casesWon) {
		this.casesWon = casesWon;
	}

	public int getCasesLost() {
		return casesLost;
	}

	public void setCasesLost(int casesLost) {
		this.casesLost = casesLost;
	}

}
