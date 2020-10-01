package edu.uncc.databasesystems.hgroup10.bloodbank.bloodbank;

public class DriveParticipantsRecords {

	private int zip_code;
	private String location;
	private int total_donors;
	
	public DriveParticipantsRecords() {
		super();
	}

	public DriveParticipantsRecords(int zip_code, String location, int total_donors) {
		super();
		this.zip_code = zip_code;
		this.location = location;
		this.total_donors = total_donors;
	}

	public int getZip_code() {
		return zip_code;
	}

	public void setZip_code(int zip_code) {
		this.zip_code = zip_code;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getTotal_donors() {
		return total_donors;
	}

	public void setTotal_donors(int total_donors) {
		this.total_donors = total_donors;
	}

	@Override
	public String toString() {
		return "DriveParticipantsRecords [zip_code=" + zip_code + ", location=" + location + ", total_donors="
				+ total_donors + "]";
	}

}