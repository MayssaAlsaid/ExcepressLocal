package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.Plan;
import repositories.PlanRepository;



@Service
public class PlanService {

	
	 @Autowired
	    private PlanRepository planRepository; 
	
	 public Plan savePlan(Plan plan) { 
	        return planRepository.save(plan); 
	    }
	 
	 public Plan findPlanById(Integer id) { 
	        return planRepository.getById(id); 
	    } 
	      
	 
	 public List<Plan> listAllplans() { 
	        return planRepository.findAll(); 
	        
	    } 
	 public void deletePlan(Integer id) { 
	        planRepository.deleteById(id); 
	    } 
	      
	    public Plan updatePlan(Plan plan) { 
	        return planRepository.save(plan); 
	    } 
	 
	 
}
