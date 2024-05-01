package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.Plan;


@Repository
public interface PlanRepository  extends JpaRepository<Plan, Integer>{

	
	

	
}
