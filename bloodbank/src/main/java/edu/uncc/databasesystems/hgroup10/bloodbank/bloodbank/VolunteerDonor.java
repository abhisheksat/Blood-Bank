package edu.uncc.databasesystems.hgroup10.bloodbank.bloodbank;

public class VolunteerDonor {

	private int donor_id;
	private String name;
	private String gender;
	private String phone_number;
	private String city;
	private String state;

	public VolunteerDonor() {
		super();
	}

	public VolunteerDonor(int donor_id, String name, String gender, String phone_number, String city, String state) {
		super();
		this.donor_id = donor_id;
		this.name = name;
		this.gender = gender;
		this.phone_number = phone_number;
		this.city = city;
		this.state = state;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VolunteerDonor other = (VolunteerDonor) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (donor_id != other.donor_id)
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone_number == null) {
			if (other.phone_number != null)
				return false;
		} else if (!phone_number.equals(other.phone_number))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		return true;
	}

	public String getCity() {
		return city;
	}

	public int getDonor_id() {
		return donor_id;
	}

	public String getGender() {
		return gender;
	}

	public String getName() {
		return name;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public String getState() {
		return state;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + donor_id;
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone_number == null) ? 0 : phone_number.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		return result;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setDonor_id(int donor_id) {
		this.donor_id = donor_id;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "VolunteerDonor [donor_id=" + donor_id + ", name=" + name + ", gender=" + gender + ", phone_number="
				+ phone_number + ", city=" + city + ", state=" + state + "]";
	}

}