package edu.uncc.databasesystems.hgroup10.bloodbank.bloodbank;

public class DonorDetailsForNurse {

	private int donor_id;
	private String donor_firstname;
	private String donor_lastname;
	private String gender;
	private String blood_group;

	public DonorDetailsForNurse() {
		super();
	}

	public DonorDetailsForNurse(int donor_id, String donor_firstname, String donor_lastname, String gender,
			String blood_group) {
		super();
		this.donor_id = donor_id;
		this.donor_firstname = donor_firstname;
		this.donor_lastname = donor_lastname;
		this.gender = gender;
		this.blood_group = blood_group;
	}

	public int getDonor_id() {
		return donor_id;
	}

	public void setDonor_id(int donor_id) {
		this.donor_id = donor_id;
	}

	public String getDonor_firstname() {
		return donor_firstname;
	}

	public void setDonor_firstname(String donor_firstname) {
		this.donor_firstname = donor_firstname;
	}

	public String getDonor_lastname() {
		return donor_lastname;
	}

	public void setDonor_lastname(String donor_lastname) {
		this.donor_lastname = donor_lastname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((blood_group == null) ? 0 : blood_group.hashCode());
		result = prime * result + ((donor_firstname == null) ? 0 : donor_firstname.hashCode());
		result = prime * result + donor_id;
		result = prime * result + ((donor_lastname == null) ? 0 : donor_lastname.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DonorDetailsForNurse other = (DonorDetailsForNurse) obj;
		if (blood_group == null) {
			if (other.blood_group != null)
				return false;
		} else if (!blood_group.equals(other.blood_group))
			return false;
		if (donor_firstname == null) {
			if (other.donor_firstname != null)
				return false;
		} else if (!donor_firstname.equals(other.donor_firstname))
			return false;
		if (donor_id != other.donor_id)
			return false;
		if (donor_lastname == null) {
			if (other.donor_lastname != null)
				return false;
		} else if (!donor_lastname.equals(other.donor_lastname))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DonorDetailsForNurse [donor_id=" + donor_id + ", donor_firstname=" + donor_firstname
				+ ", donor_lastname=" + donor_lastname + ", gender=" + gender + ", blood_group=" + blood_group + "]";
	}

}