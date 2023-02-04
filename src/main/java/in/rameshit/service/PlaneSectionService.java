package in.rameshit.service;

import in.rameshit.binding.IncomeDetailsResponse;
import in.rameshit.binding.PlanSectionResponse;


public interface PlaneSectionService {
public String savePlaneSection(PlanSectionResponse resp);
public String incomeDetailsSave(IncomeDetailsResponse incmDetails);
}
