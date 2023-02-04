package in.rameshit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.rameshit.entity.PlanSection;

public interface PlaneSectionRepo extends JpaRepository<PlanSection,Serializable> {

}
