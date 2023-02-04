package in.rameshit.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "IncomeDetailsApp")
public class IncomeDetails {
	
	private int incomeId;
	private double monthlySalaryIncome;
	private double rentIncome;
	private double propertyIncome;
	
}
