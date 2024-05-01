package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.Passenger;
import repositories.PassengerRepository;


@Service
public class PassengerService {
	
           @Autowired
		    private PassengerRepository passengerRepository; 
		
		 public Passenger savePassenger(Passenger passenger) { 
		        return passengerRepository.save(passenger); 
		    }
		 
		 public Passenger findPassengerById(Integer id) { 
		        return passengerRepository.getById(id); 
		    } 
		      
		 
		 public List<Passenger> listAllpassenger() { 
		        return passengerRepository.findAll(); 
		        
		    } 
		 public void deletePassenger(Integer id) { 
			 passengerRepository.deleteById(id); 
		    } 
		      
		    public Passenger updatePassenger(Passenger passenger) { 
		        return passengerRepository.save(passenger); 
		    } 
	}
