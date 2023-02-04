package in.rameshit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "PlanSectionApp")
public class PlanSection {

	@Id
	@GeneratedValue
	private int planId;
	private String caseNumber;
	private String planeName;

}
