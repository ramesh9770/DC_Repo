package in.rameshit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.rameshit.entity.IncomeDetails;



public interface IncomeDetailsRepo extends JpaRepository<IncomeDetails,Serializable> {

}
