package in.rameshit.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.rameshit.binding.IncomeDetailsResponse;
import in.rameshit.binding.PlanSectionResponse;
import in.rameshit.entity.IncomeDetails;
import in.rameshit.entity.PlanSection;
import in.rameshit.repo.IncomeDetailsRepo;
import in.rameshit.repo.PlaneSectionRepo;

@Service
public class PlanSectionServiceImpl implements PlaneSectionService {

	@Autowired
	private PlaneSectionRepo planeSectionRepo;
	@Autowired
	private IncomeDetailsRepo incomeDetailsRepo;
	
	@Override
	public String savePlaneSection(PlanSectionResponse resp) {
		PlanSection entity = new PlanSection();
		BeanUtils.copyProperties(resp, entity);
		  planeSectionRepo.save(entity);
		  return "Plan Section is saved";

	}

	@Override
	public String incomeDetailsSave(IncomeDetailsResponse incmDetails) {
		IncomeDetails entity = new IncomeDetails();
		BeanUtils.copyProperties(incmDetails, entity);
		incomeDetailsRepo.save(entity);
		  return "incmDetails is saved";
	}



}
