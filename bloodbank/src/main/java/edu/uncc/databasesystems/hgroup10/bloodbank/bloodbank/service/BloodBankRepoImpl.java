package edu.uncc.databasesystems.hgroup10.bloodbank.bloodbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import edu.uncc.databasesystems.hgroup10.bloodbank.bloodbank.BloodSampleCountByGroupForBloodSampleKeeper;
import edu.uncc.databasesystems.hgroup10.bloodbank.bloodbank.DonorDetailsForNurse;
import edu.uncc.databasesystems.hgroup10.bloodbank.bloodbank.DonorRecords;
import edu.uncc.databasesystems.hgroup10.bloodbank.bloodbank.DriveDutyForNurse;
import edu.uncc.databasesystems.hgroup10.bloodbank.bloodbank.DriveParticipantsRecords;
import edu.uncc.databasesystems.hgroup10.bloodbank.bloodbank.ExpiredSamples;
import edu.uncc.databasesystems.hgroup10.bloodbank.bloodbank.LatestSampleDetailsForBloodSampleKeeper;
import edu.uncc.databasesystems.hgroup10.bloodbank.bloodbank.RequestDetailsForSampleKeeper;
import edu.uncc.databasesystems.hgroup10.bloodbank.bloodbank.SampleDetailsByDriveForNurse;
import edu.uncc.databasesystems.hgroup10.bloodbank.bloodbank.SampleQuantityForReceptionist;
import edu.uncc.databasesystems.hgroup10.bloodbank.bloodbank.VolunteerDonor;
import edu.uncc.databasesystems.hgroup10.bloodbank.bloodbank.WinnerDonors;

@Repository
public class BloodBankRepoImpl implements BloodBankRepo {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<DonorDetailsForNurse> donorDetailsForNurse(String driveid) {

		String sql = "CALL nurse_checks_list_of_donors(" + driveid + ")";

		return jdbcTemplate.query(sql,
				(rs, num) -> new DonorDetailsForNurse(rs.getInt("donor_id"), rs.getString("donor_firstname"),
						rs.getString("donor_lastname"), rs.getString("gender"), rs.getString("blood_group")));
	}

	@Override
	public List<SampleDetailsByDriveForNurse> sampleDetailsByDriveForNurse(String driveid) {

		String sql = "CALL nurse_checks_blood_sample_from_drive (" + driveid + ")";

		return jdbcTemplate.query(sql, (rs, num) -> new SampleDetailsByDriveForNurse(rs.getInt("sample_id"),
				rs.getString("blood_group"), rs.getDate("sample_taken_date"), rs.getDate("sample_expiry_date")));
	}

	@Override
	public List<DriveDutyForNurse> driveDutyForNurse(String nurse_reg_number) {

		String sql = "CALL nurse_checks_details_of_drive(" + nurse_reg_number + ")";
	
		return jdbcTemplate.query(sql,
				(rs, num) -> new DriveDutyForNurse(rs.getInt("drive_id"), rs.getDate("drive_date"),
						rs.getInt("drive_capacity"), rs.getDate("drive_start_time"), rs.getDate("drive_end_time"),
						rs.getString("address_line1"), rs.getString("address_line2"), rs.getString("city"),
						rs.getString("state")));
	}

	@Override
	public List<LatestSampleDetailsForBloodSampleKeeper> latestSampleDetailsForBloodSampleKeeper() {

		String sql = "SELECT * FROM Blood_Sample_keepr_checks_latest_added_samples";

		return jdbcTemplate.query(sql,
				(rs, num) -> new LatestSampleDetailsForBloodSampleKeeper(rs.getInt("sample_id"),
						rs.getString("blood_group"), rs.getDate("sample_taken_date"), rs.getDate("sample_expiry_date"),
						rs.getString("status")));
	}

	@Override
	public List<BloodSampleCountByGroupForBloodSampleKeeper> bloodSampleCountByGroupForBloodSampleKeeperAP() {

		String sql = "SELECT * FROM Blood_Sample_keepr_checks_number_of_blood_Samples_by_blood_group";

		return jdbcTemplate.query(sql,
				(rs, num) -> new BloodSampleCountByGroupForBloodSampleKeeper(rs.getString("blood_group"),
						rs.getInt("count(blood_group)")));
	}

	@Override
	public List<ExpiredSamples> expiredSamplesFromTheStock() {

		String sql = "select * from Blood_sample_keeper_to_expired_samples";

		List<ExpiredSamples> testList = jdbcTemplate.query(sql,
				(rs, num) -> new ExpiredSamples(rs.getInt("sample_id"), rs.getString("blood_group"),
						rs.getTimestamp("sample_taken_date"), rs.getTimestamp("sample_expiry_date")));
		for (ExpiredSamples s : testList) {
			System.out.println(s.toString());
		}

		return jdbcTemplate.query(sql,
				(rs, num) -> new ExpiredSamples(rs.getInt("sample_id"), rs.getString("blood_group"),
						rs.getTimestamp("sample_taken_date"), rs.getTimestamp("sample_expiry_date")));
	}

	@Override
	public void removeExpiredSample(int sample_id) {
		String sql = "UPDATE `blood_bank_sprint2`.`sample` SET `status` = 'EXP' WHERE (`sample_id` = '" + sample_id
				+ "');";
		jdbcTemplate.update(sql);
	}

	@Override
	public List<SampleQuantityForReceptionist> getSampleQuantityForReceptionist(String bloodGroup) {

		String sql = "CALL Receptionst_checks_Blood('" + bloodGroup + "');";

		return jdbcTemplate.query(sql,
				(rs, num) -> new SampleQuantityForReceptionist(rs.getString("blood_group"), rs.getInt("quantity")));
	}

	@Override
	public List<RequestDetailsForSampleKeeper> getRequestDetailsForSampleKeeper() {

		String sql = "SELECT * FROM Blood_sample_keeper_checks_requested__samples";

		return jdbcTemplate.query(sql,
				(rs, num) -> new RequestDetailsForSampleKeeper(rs.getInt("request_id"), rs.getString("blood_group"),
						rs.getInt("quantity"), rs.getString("requester_name"),
						rs.getString("healthcare_instution_name"), rs.getString("phone_num")));
	}

	@Override
	public List<VolunteerDonor> listOfVolunteerDonors(String bloodGroup) {
		
		String sql = "CALL Receptionist_checks_available_volunteer('" + bloodGroup + "')";
		
		return jdbcTemplate.query(sql, (rs, num) -> new VolunteerDonor(rs.getInt("donor_id"), rs.getString("name"),
				rs.getString("gender"), rs.getString("phone_number"), rs.getString("city"), rs.getString("state")));
	}

	@Override
	public List<DonorRecords> listOfDonorRecords(int donor_id) {

		String sql = "SELECT s.sample_id AS noted_sample_id, s.sample_taken_date AS collection_date, s.blood_group AS blood_group, s.status AS status, CONCAT(da.address_line1,', ',da.address_line2,', ',da.city,', ',da.state) AS collected_at FROM sample s INNER JOIN drive d USING (drive_id) INNER JOIN drive_address da USING (address_id) WHERE s.donor_id = "
				+ donor_id + " ORDER BY s.sample_taken_date DESC";
		
		return jdbcTemplate.query(sql,
				(rs, num) -> new DonorRecords(rs.getInt("noted_sample_id"), rs.getDate("collection_date"),
						rs.getString("blood_group"), rs.getString("status"), rs.getString("collected_at")));
	}

	@Override
	public List<DriveParticipantsRecords> participationRecords() {
		
		String sql = "SELECT da.zip_code, CONCAT(da.address_line1, ', ', da.address_line2, ', ', da.city, ', ', da.state, ' - ',da.zip_code) AS location, count(dd.donor_id) AS total_donors FROM donor_Drive dd INNER JOIN drive dr USING (drive_id) INNER JOIN drive_address da USING (address_id) GROUP BY dd.drive_id ORDER BY total_donors DESC;";
		
		return jdbcTemplate.query(sql, (rs, num) -> new DriveParticipantsRecords(rs.getInt("zip_code"),
				rs.getString("location"), rs.getInt("total_donors")));
	}

	@Override
	public List<WinnerDonors> listOfWinnerDonors() {
		
		String sql = "CALL Receptionist_search_for_winners()";
		
		return jdbcTemplate.query(sql, (rs, num) -> new WinnerDonors(rs.getString("Donor Name"),
				rs.getString("blood_group"), rs.getInt("Times donated blood"), rs.getString("phone_number")));
	}

}