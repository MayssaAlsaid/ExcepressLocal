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

import models.Passenger;
import services.PassengerService;

@Controller
@RequestMapping("/api/passenger") 
public class PassengerController {
	
    @Autowired
private PassengerService passengerService ;
	
	
	
	@GetMapping("/")
	public List<Passenger> getAllPassenger(){
		return passengerService.listAllpassenger();
	}
	
	
	@PostMapping("/") 
    public Passenger addPassenger(@RequestBody Passenger passenger) { 
        return passengerService.savePassenger(passenger); 
    } 
	
	 @PutMapping("/{id}") 
	    public ResponseEntity<Passenger> updatePlan(@PathVariable Integer id, @RequestBody Passenger passenger) { 
		 passenger.setId(id); 
	        return ResponseEntity.ok(passengerService.savePassenger(passenger)); 
	    } 
	 @DeleteMapping("/{id}") 
	    public ResponseEntity<Boolean> getAllPassengers(@PathVariable Integer id) { 
		 passengerService.deletePassenger(id); 
	        return ResponseEntity.ok(true); 
	    } 
}
