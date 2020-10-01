package edu.uncc.databasesystems.hgroup10.bloodbank.bloodbank;

public class BloodSampleCountByGroupForBloodSampleKeeper {

	private String blood_group;
	private int count;

	public BloodSampleCountByGroupForBloodSampleKeeper() {
		super();
	}

	public BloodSampleCountByGroupForBloodSampleKeeper(String blood_group, int count) {
		super();
		this.blood_group = blood_group;
		this.count = count;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((blood_group == null) ? 0 : blood_group.hashCode());
		result = prime * result + count;
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
		BloodSampleCountByGroupForBloodSampleKeeper other = (BloodSampleCountByGroupForBloodSampleKeeper) obj;
		if (blood_group == null) {
			if (other.blood_group != null)
				return false;
		} else if (!blood_group.equals(other.blood_group))
			return false;
		if (count != other.count)
			return false;
		return true;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "BloodSampleCountByGroupForBloodSampleKeeper [blood_group=" + blood_group + ", count=" + count + "]";
	}
	
}