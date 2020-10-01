package edu.uncc.databasesystems.hgroup10.bloodbank.bloodbank;

import java.util.Date;

public class DriveDutyForNurse {

	private int drive_id;
	private Date drive_date;
	private int drive_capcity;
	private Date drive_start_time;
	private Date drive_end_time;
	private String address_line1;
	private String address_line2;
	private String city;
	private String state;

	public DriveDutyForNurse() {
		super();
	}

	public DriveDutyForNurse(int drive_id, Date drive_date, int drive_capcity, Date drive_start_time,
			Date drive_end_time, String address_line1, String address_line2, String city, String state) {
		super();
		this.drive_id = drive_id;
		this.drive_date = drive_date;
		this.drive_capcity = drive_capcity;
		this.drive_start_time = drive_start_time;
		this.drive_end_time = drive_end_time;
		this.address_line1 = address_line1;
		this.address_line2 = address_line2;
		this.city = city;
		this.state = state;
	}

	public int getDrive_id() {
		return drive_id;
	}

	public void setDrive_id(int drive_id) {
		this.drive_id = drive_id;
	}

	public Date getDrive_date() {
		return drive_date;
	}

	public void setDrive_date(Date drive_date) {
		this.drive_date = drive_date;
	}

	public int getDrive_capcity() {
		return drive_capcity;
	}

	public void setDrive_capcity(int drive_capcity) {
		this.drive_capcity = drive_capcity;
	}

	public Date getDrive_start_time() {
		return drive_start_time;
	}

	public void setDrive_start_time(Date drive_start_time) {
		this.drive_start_time = drive_start_time;
	}

	public Date getDrive_end_time() {
		return drive_end_time;
	}

	public void setDrive_end_time(Date drive_end_time) {
		this.drive_end_time = drive_end_time;
	}

	public String getAddress_line1() {
		return address_line1;
	}

	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}

	public String getAddress_line2() {
		return address_line2;
	}

	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address_line1 == null) ? 0 : address_line1.hashCode());
		result = prime * result + ((address_line2 == null) ? 0 : address_line2.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + drive_capcity;
		result = prime * result + ((drive_date == null) ? 0 : drive_date.hashCode());
		result = prime * result + ((drive_end_time == null) ? 0 : drive_end_time.hashCode());
		result = prime * result + drive_id;
		result = prime * result + ((drive_start_time == null) ? 0 : drive_start_time.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
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
		DriveDutyForNurse other = (DriveDutyForNurse) obj;
		if (address_line1 == null) {
			if (other.address_line1 != null)
				return false;
		} else if (!address_line1.equals(other.address_line1))
			return false;
		if (address_line2 == null) {
			if (other.address_line2 != null)
				return false;
		} else if (!address_line2.equals(other.address_line2))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (drive_capcity != other.drive_capcity)
			return false;
		if (drive_date == null) {
			if (other.drive_date != null)
				return false;
		} else if (!drive_date.equals(other.drive_date))
			return false;
		if (drive_end_time == null) {
			if (other.drive_end_time != null)
				return false;
		} else if (!drive_end_time.equals(other.drive_end_time))
			return false;
		if (drive_id != other.drive_id)
			return false;
		if (drive_start_time == null) {
			if (other.drive_start_time != null)
				return false;
		} else if (!drive_start_time.equals(other.drive_start_time))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DriveDutyForNurse [drive_id=" + drive_id + ", drive_date=" + drive_date + ", drive_capcity="
				+ drive_capcity + ", drive_start_time=" + drive_start_time + ", drive_end_time=" + drive_end_time
				+ ", address_line1=" + address_line1 + ", address_line2=" + address_line2 + ", city=" + city
				+ ", state=" + state + "]";
	}

}