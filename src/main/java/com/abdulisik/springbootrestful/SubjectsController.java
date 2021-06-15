package com.abdulisik.springbootrestful;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//creating RestController
@RestController
public class SubjectsController {
	//autowired the SubjectsService class
	@Autowired
	private SubjectsService subjectsService;
	
	@Autowired
	private SubjectsRepository subjectsRepository;
	
	@GetMapping("/subjects") //getting all subjects records
	public List<Subject> getAllSubjects() {
		return subjectsService.findAll();
	}
	
	@GetMapping("/subjects/{id}") //getting a specific record
	public Subject getSubjectsById(@PathVariable int id) {
		return subjectsRepository.findById(id).orElseGet(null);
	}
	
	@PostMapping("/subjects") // updating a subject's detail
	public int saveOrUpdate(@RequestBody Subject subject) {
		subject.setId((int) (subjectsRepository.count() + 1));
		return subjectsRepository.save(subject).getId();
	}
	
	@DeleteMapping("/subjects/{id}") //deleting a specific record
	public void delete(@PathVariable int id) {
		subjectsRepository.deleteById(id);
	}
	
}

