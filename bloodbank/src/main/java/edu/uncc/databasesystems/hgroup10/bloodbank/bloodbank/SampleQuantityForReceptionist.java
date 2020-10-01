package edu.uncc.databasesystems.hgroup10.bloodbank.bloodbank;

public class SampleQuantityForReceptionist {

	private String bloodGroup;
	private int quantity;

	public SampleQuantityForReceptionist() {
		super();
	}

	public SampleQuantityForReceptionist(String bloodGroup, int quantity) {
		super();
		this.bloodGroup = bloodGroup;
		this.quantity = quantity;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "SampleQuantityForReceptionist [bloodGroup=" + bloodGroup + ", quantity=" + quantity + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bloodGroup == null) ? 0 : bloodGroup.hashCode());
		result = prime * result + quantity;
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
		SampleQuantityForReceptionist other = (SampleQuantityForReceptionist) obj;
		if (bloodGroup == null) {
			if (other.bloodGroup != null)
				return false;
		} else if (!bloodGroup.equals(other.bloodGroup))
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}

}