package in.rameshit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.rameshit.binding.IncomeDetailsResponse;
import in.rameshit.binding.PlanSectionResponse;
import in.rameshit.service.PlaneSectionService;

@RestController
public class PlanSectionController {

	
	@Autowired
	private PlaneSectionService planeSectionService;
	
	@PostMapping("/plansection")
	public ResponseEntity<String>savePlanSection(@RequestBody PlanSectionResponse resp ){
		String status=planeSectionService.savePlaneSection(resp);
		
		return new ResponseEntity<>(status,HttpStatus.CREATED);
		
	}	
	
	@PostMapping("/incomedetails")
	public ResponseEntity<String>incomeDetails(@RequestBody IncomeDetailsResponse resp ){
		String status=planeSectionService.incomeDetailsSave(resp);
		
		return new ResponseEntity<>(status,HttpStatus.CREATED);
		
	}
}
