package edu.uncc.databasesystems.hgroup10.bloodbank.bloodbank;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.uncc.databasesystems.hgroup10.bloodbank.bloodbank.repository.BloodBankService;

@RestController
@RequestMapping(value = "/api/v1")
public class FetchDataController {

	@Autowired
	BloodBankService bloodBankService;

	@RequestMapping(value = "/donorDetailsForNurse", method = { RequestMethod.GET, RequestMethod.POST })
	public List<DonorDetailsForNurse> donorDetailsForNurse(HttpServletRequest request, HttpServletResponse response) {
		String driveid = request.getParameter("driveid");
		return bloodBankService.donorDetailsForNurse(driveid);
	}

	@RequestMapping(value = "/sampleDetailsByDriveForNurse", method = { RequestMethod.GET, RequestMethod.POST })
	public List<SampleDetailsByDriveForNurse> sampleDetailsByDriveForNurse(HttpServletRequest request,
			HttpServletResponse response) {
		String drive_id = request.getParameter("driveid");
		return bloodBankService.sampleDetailsByDriveForNurse(drive_id);
	}

	@RequestMapping(value = "/driveDutyForNurse", method = { RequestMethod.GET, RequestMethod.POST })
	public List<DriveDutyForNurse> driveDutyForNurse(HttpServletRequest request, HttpServletResponse response) {
		String nurse_reg_number = request.getParameter("nurseregnumber");
		return bloodBankService.driveDutyForNurse(nurse_reg_number);
	}

	@RequestMapping(value = "/latestSampleDetailsForBloodSampleKeeper", method = RequestMethod.GET)
	public List<LatestSampleDetailsForBloodSampleKeeper> latestSampleDetailsForBloodSampleKeeper() {
		return bloodBankService.latestSampleDetailsForBloodSampleKeeper();
	}

	@RequestMapping(value = "/bloodSampleCountByGroupForBloodSampleKeeperAP", method = RequestMethod.GET)
	public List<BloodSampleCountByGroupForBloodSampleKeeper> bloodSampleCountByGroupForBloodSampleKeeperAP() {
		return bloodBankService.bloodSampleCountByGroupForBloodSampleKeeperAP();
	}

	@RequestMapping(value = "/expiredSamplesFromTheStock", method = RequestMethod.GET)
	public List<ExpiredSamples> expiredSamplesFromTheStock() {
		return bloodBankService.expiredSamplesFromTheStock();
	}

	@RequestMapping(value = "/removeExpiredSample", method = RequestMethod.POST)
	public void removeExpiredSample(HttpServletRequest request) {
		bloodBankService.removeExpiredSample(Integer.parseInt(request.getParameter("sampleId")));
	}

	@RequestMapping(value = "/getSampleQuantityForReceptionist", method = RequestMethod.POST)
	public List<SampleQuantityForReceptionist> getSampleQuantityForReceptionist(HttpServletRequest request) {
		return bloodBankService.getSampleQuantityForReceptionist(request.getParameter("bloodgroup"));
	}

	@RequestMapping(value = "/getRequestDetailsForSampleKeeper", method = RequestMethod.GET)
	public List<RequestDetailsForSampleKeeper> getRequestDetailsForSampleKeeper() {
		return bloodBankService.getRequestDetailsForSampleKeeper();
	}

	@RequestMapping(value = "/listOfVolunteerDonors", method = RequestMethod.POST)
	public List<VolunteerDonor> listOfVolunteerDonors(HttpServletRequest request) {
		return bloodBankService.listOfVolunteerDonors(request.getParameter("bloodgroup"));
	}

	@RequestMapping(value = "/listOfDonorRecords", method = RequestMethod.POST)
	public List<DonorRecords> listOfDonorRecords(HttpServletRequest request) {
		return bloodBankService.listOfDonorRecords(Integer.parseInt(request.getParameter("donor_id")));
	}

	@RequestMapping(value = "/participationRecords", method = RequestMethod.GET)
	public List<DriveParticipantsRecords> participationRecords() {
		return bloodBankService.participationRecords();
	}

	@RequestMapping(value = "/listOfWinningDonors", method = RequestMethod.GET)
	public List<WinnerDonors> listOfWinnerDonors() {
		return bloodBankService.listOfWinnerDonors();
	}

}