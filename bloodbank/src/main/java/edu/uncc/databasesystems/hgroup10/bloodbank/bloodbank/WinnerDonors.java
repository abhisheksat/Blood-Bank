package edu.uncc.databasesystems.hgroup10.bloodbank.bloodbank;

public class WinnerDonors {

	private String donor_name;
	private String blood_group;
	private int no_of_donations;
	private String phone_number;
	
	public WinnerDonors() {
		super();
	}

	public WinnerDonors(String donor_name, String blood_group, int no_of_donations, String phone_number) {
		super();
		this.donor_name = donor_name;
		this.blood_group = blood_group;
		this.no_of_donations = no_of_donations;
		this.phone_number = phone_number;
	}

	public String getDonor_name() {
		return donor_name;
	}

	public void setDonor_name(String donor_name) {
		this.donor_name = donor_name;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	public int getNo_of_donations() {
		return no_of_donations;
	}

	public void setNo_of_donations(int no_of_donations) {
		this.no_of_donations = no_of_donations;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	@Override
	public String toString() {
		return "WinnerDonors [donor_name=" + donor_name + ", blood_group=" + blood_group + ", no_of_donations="
				+ no_of_donations + ", phone_number=" + phone_number + "]";
	}
	
}