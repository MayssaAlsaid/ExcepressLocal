package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import models.Plan;
import services.PlanService;


@Controller
@RequestMapping("/api/plans") 
public class PlanController {
	
    @Autowired
private PlanService planService ;
	
	
	
	@GetMapping("/")
	public List<Plan> getAllPlans(){
		return planService.listAllplans();
	}
	
	@PostMapping("/") 
    public Plan  addPlan(@RequestBody Plan plan) { 
        return planService.savePlan(plan); 
    } 
	
	 @PutMapping("/{id}") 
	    public ResponseEntity<Plan> updatePlan(@PathVariable Integer id, @RequestBody Plan plan) { 
	        plan.setId(id); 
	        return ResponseEntity.ok(planService.savePlan(plan)); 
	    } 
	 @DeleteMapping("/{id}") 
	    public ResponseEntity<Boolean> getAllPlans(@PathVariable Integer id) { 
	        planService.deletePlan(id); 
	        return ResponseEntity.ok(true); 
	    } 
}
