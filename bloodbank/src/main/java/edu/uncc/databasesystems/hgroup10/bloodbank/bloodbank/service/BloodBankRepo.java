package edu.uncc.databasesystems.hgroup10.bloodbank.bloodbank.service;

import java.util.List;

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

public interface BloodBankRepo {

	List<DonorDetailsForNurse> donorDetailsForNurse(String driveid);

	List<SampleDetailsByDriveForNurse> sampleDetailsByDriveForNurse(String driveid);

	List<DriveDutyForNurse> driveDutyForNurse(String nurse_reg_number);

	List<LatestSampleDetailsForBloodSampleKeeper> latestSampleDetailsForBloodSampleKeeper();

	List<BloodSampleCountByGroupForBloodSampleKeeper> bloodSampleCountByGroupForBloodSampleKeeperAP();

	List<ExpiredSamples> expiredSamplesFromTheStock();

	void removeExpiredSample(int sample_id);

	List<SampleQuantityForReceptionist> getSampleQuantityForReceptionist(String bloodGroup);

	List<RequestDetailsForSampleKeeper> getRequestDetailsForSampleKeeper();

	List<VolunteerDonor> listOfVolunteerDonors(String bloodGroup);

	List<DonorRecords> listOfDonorRecords(int donor_id);

	List<DriveParticipantsRecords> participationRecords();

	List<WinnerDonors> listOfWinnerDonors();

}