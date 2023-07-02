package com.infosys.studs.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.studs.Entity.FeeEntity;
import com.infosys.studs.respository.StdFeeRespository;



@RestController
public class FeeController {
	
	
	@Autowired
	StdFeeRespository stdFeeRespository;
	
	@GetMapping("/GetFeeDetails/{id}")
	public Optional<FeeEntity> getIddetails(@PathVariable Long id){
		
		Optional<FeeEntity> stddetail= stdFeeRespository.findById(id);
		return stddetail;
	}
	
	@PostMapping("/GetFeeDetails/SaveStdFeedetails")
	public FeeEntity getdetails(@RequestBody   FeeEntity feeEntity){
		FeeEntity stddetails= stdFeeRespository.saveAndFlush(feeEntity);
		return stddetails;		
	}
	

	@GetMapping("/GetFeeDetails/GetFeedetails")
	public List<FeeEntity> getAlldetails(){
		List<FeeEntity>  stddetails= stdFeeRespository.findAll();
		return stddetails;		
	}
	
}
