package org.send.java.main;

class UserData {
	String NAME;
	String EMAIL;
	String PW;

	public UserData(String NAME, String PW, String EMAIL) {
		this.NAME = NAME;
		this.EMAIL = EMAIL;
		this.PW = PW;
	}
	public void setNAME(String NAME) {
		this.NAME = NAME;
	}
	public void setEMAIL(String EMAIL) {
		this.EMAIL = EMAIL;
	}
	public void setPW(String PW) {
		this.PW = PW;
	}
	public String getNAME() {
		return NAME;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public String getPW() {
		return PW;
	}

}
