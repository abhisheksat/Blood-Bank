package edu.uncc.databasesystems.hgroup10.bloodbank.bloodbank;

public class RequestDetailsForSampleKeeper {

	private int request_id;
	private String blood_group;
	private int quantity;
	private String requester_name;
	private String healthcare_institution_name;
	private String phone_number;

	public RequestDetailsForSampleKeeper() {
		super();
	}

	public RequestDetailsForSampleKeeper(int request_id, String blood_group, int quantity, String requester_name,
			String healthcare_institution_name, String phone_number) {
		super();
		this.request_id = request_id;
		this.blood_group = blood_group;
		this.quantity = quantity;
		this.requester_name = requester_name;
		this.healthcare_institution_name = healthcare_institution_name;
		this.phone_number = phone_number;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RequestDetailsForSampleKeeper other = (RequestDetailsForSampleKeeper) obj;
		if (blood_group == null) {
			if (other.blood_group != null)
				return false;
		} else if (!blood_group.equals(other.blood_group))
			return false;
		if (healthcare_institution_name == null) {
			if (other.healthcare_institution_name != null)
				return false;
		} else if (!healthcare_institution_name.equals(other.healthcare_institution_name))
			return false;
		if (phone_number == null) {
			if (other.phone_number != null)
				return false;
		} else if (!phone_number.equals(other.phone_number))
			return false;
		if (quantity != other.quantity)
			return false;
		if (request_id != other.request_id)
			return false;
		if (requester_name == null) {
			if (other.requester_name != null)
				return false;
		} else if (!requester_name.equals(other.requester_name))
			return false;
		return true;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public String getHealthcare_institution_name() {
		return healthcare_institution_name;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getRequest_id() {
		return request_id;
	}

	public String getRequester_name() {
		return requester_name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((blood_group == null) ? 0 : blood_group.hashCode());
		result = prime * result + ((healthcare_institution_name == null) ? 0 : healthcare_institution_name.hashCode());
		result = prime * result + ((phone_number == null) ? 0 : phone_number.hashCode());
		result = prime * result + quantity;
		result = prime * result + request_id;
		result = prime * result + ((requester_name == null) ? 0 : requester_name.hashCode());
		return result;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	public void setHealthcare_institution_name(String healthcare_institution_name) {
		this.healthcare_institution_name = healthcare_institution_name;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setRequest_id(int request_id) {
		this.request_id = request_id;
	}

	public void setRequester_name(String requester_name) {
		this.requester_name = requester_name;
	}

	@Override
	public String toString() {
		return "RequestDetailsForSampleKeeper [request_id=" + request_id + ", blood_group=" + blood_group
				+ ", quantity=" + quantity + ", requester_name=" + requester_name + ", healthcare_institution_name="
				+ healthcare_institution_name + ", phone_number=" + phone_number + "]";
	}

}
