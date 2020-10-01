package edu.uncc.databasesystems.hgroup10.bloodbank.bloodbank.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
import edu.uncc.databasesystems.hgroup10.bloodbank.bloodbank.service.BloodBankRepo;

@Service
public class BloodBankServiceImpl implements BloodBankService {

	@Autowired
	BloodBankRepo bloodBankRepo;

	@Override
	public List<DonorDetailsForNurse> donorDetailsForNurse(String driveid) {
		return bloodBankRepo.donorDetailsForNurse(driveid);
	}

	@Override
	public List<SampleDetailsByDriveForNurse> sampleDetailsByDriveForNurse(String driveid) {
		return bloodBankRepo.sampleDetailsByDriveForNurse(driveid);
	}

	@Override
	public List<DriveDutyForNurse> driveDutyForNurse(String nurse_reg_number) {
		return bloodBankRepo.driveDutyForNurse(nurse_reg_number);
	}

	@Override
	public List<LatestSampleDetailsForBloodSampleKeeper> latestSampleDetailsForBloodSampleKeeper() {
		return bloodBankRepo.latestSampleDetailsForBloodSampleKeeper();
	}

	@Override
	public List<BloodSampleCountByGroupForBloodSampleKeeper> bloodSampleCountByGroupForBloodSampleKeeperAP() {
		return bloodBankRepo.bloodSampleCountByGroupForBloodSampleKeeperAP();
	}

	@Override
	public List<ExpiredSamples> expiredSamplesFromTheStock() {
		return bloodBankRepo.expiredSamplesFromTheStock();
	}

	@Override
	public void removeExpiredSample(int sample_id) {
		bloodBankRepo.removeExpiredSample(sample_id);
	}

	@Override
	public List<SampleQuantityForReceptionist> getSampleQuantityForReceptionist(String bloodGroup) {
		return bloodBankRepo.getSampleQuantityForReceptionist(bloodGroup);
	}

	@Override
	public List<RequestDetailsForSampleKeeper> getRequestDetailsForSampleKeeper() {
		return bloodBankRepo.getRequestDetailsForSampleKeeper();
	}

	@Override
	public List<VolunteerDonor> listOfVolunteerDonors(String bloodGroup) {
		return bloodBankRepo.listOfVolunteerDonors(bloodGroup);
	}

	@Override
	public List<DonorRecords> listOfDonorRecords(int donor_id) {
		return bloodBankRepo.listOfDonorRecords(donor_id);
	}

	@Override
	public List<DriveParticipantsRecords> participationRecords() {
		return bloodBankRepo.participationRecords();
	}

	@Override
	public List<WinnerDonors> listOfWinnerDonors() {
		return bloodBankRepo.listOfWinnerDonors();
	}

}