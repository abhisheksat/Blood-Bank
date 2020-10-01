package edu.uncc.databasesystems.hgroup10.bloodbank.bloodbank;

import java.sql.Timestamp;
import java.util.Date;

public class ExpiredSamples {

	private int sample_id;
	private String blood_group;
	private Timestamp sample_taken_date;
	private Timestamp sample_expiry_date;

	public ExpiredSamples() {
		super();
	}

	public ExpiredSamples(int sample_id, String blood_group, Timestamp sample_taken_date, Timestamp sample_expiry_date) {
		super();
		this.sample_id = sample_id;
		this.blood_group = blood_group;
		this.sample_taken_date = sample_taken_date;
		this.sample_expiry_date = sample_expiry_date;
	}

	public int getSample_id() {
		return sample_id;
	}

	public void setSample_id(int sample_id) {
		this.sample_id = sample_id;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	public Date getSample_taken_date() {
		return sample_taken_date;
	}

	public void setSample_taken_date(Timestamp sample_taken_date) {
		this.sample_taken_date = sample_taken_date;
	}

	public Date getSample_expiry_date() {
		return sample_expiry_date;
	}

	public void setSample_expiry_date(Timestamp sample_expiry_date) {
		this.sample_expiry_date = sample_expiry_date;
	}

	@Override
	public String toString() {
		return "ExpiredSamples [sample_id=" + sample_id + ", blood_group=" + blood_group + ", sample_taken_date="
				+ sample_taken_date + ", sample_expiry_date=" + sample_expiry_date + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((blood_group == null) ? 0 : blood_group.hashCode());
		result = prime * result + ((sample_expiry_date == null) ? 0 : sample_expiry_date.hashCode());
		result = prime * result + sample_id;
		result = prime * result + ((sample_taken_date == null) ? 0 : sample_taken_date.hashCode());
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
		ExpiredSamples other = (ExpiredSamples) obj;
		if (blood_group == null) {
			if (other.blood_group != null)
				return false;
		} else if (!blood_group.equals(other.blood_group))
			return false;
		if (sample_expiry_date == null) {
			if (other.sample_expiry_date != null)
				return false;
		} else if (!sample_expiry_date.equals(other.sample_expiry_date))
			return false;
		if (sample_id != other.sample_id)
			return false;
		if (sample_taken_date == null) {
			if (other.sample_taken_date != null)
				return false;
		} else if (!sample_taken_date.equals(other.sample_taken_date))
			return false;
		return true;
	}

}