package edu.uncc.databasesystems.hgroup10.bloodbank.bloodbank;

import java.util.Date;

public class DonorRecords {

	private int noted_sample_id;
	private Date collection_date;
	private String blood_group;
	private String status;
	private String collected_at;

	public DonorRecords() {
		super();
	}

	public DonorRecords(int noted_sample_id, Date collection_date, String blood_group, String status,
			String collected_at) {
		super();
		this.noted_sample_id = noted_sample_id;
		this.collection_date = collection_date;
		this.blood_group = blood_group;
		this.status = status;
		this.collected_at = collected_at;
	}

	public int getNoted_sample_id() {
		return noted_sample_id;
	}

	public void setNoted_sample_id(int noted_sample_id) {
		this.noted_sample_id = noted_sample_id;
	}

	public Date getCollection_date() {
		return collection_date;
	}

	public void setCollection_date(Date collection_date) {
		this.collection_date = collection_date;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCollected_at() {
		return collected_at;
	}

	public void setCollected_at(String collected_at) {
		this.collected_at = collected_at;
	}

	@Override
	public String toString() {
		return "DonorRecords [noted_sample_id=" + noted_sample_id + ", collection_date=" + collection_date
				+ ", blood_group=" + blood_group + ", status=" + status + ", collected_at=" + collected_at + "]";
	}

}