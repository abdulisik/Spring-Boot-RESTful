package com.abdulisik.springbootrestful;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectsService {
	@Autowired
	private SubjectsRepository subjectsRepository;
	
	@GetMapping("/subjects") //getting all subjects records
	public List<Subjects> getAllSubjects() {
		List<Subjects> subjects = new ArrayList<>();
		subjectsRepository.findAll().forEach(subjects::add);
		return subjects;
	}
	
	@GetMapping("/subjects/{id}")//getting a specific record
	public Subjects getSubjectsById(@PathVariable int id) {
		return subjectsRepository.findById(id).orElseGet(null);
	}
	
	@PostMapping("/subjects")
	public void saveOrUpdate(Subjects subjects) {
		subjectsRepository.save(subjects);
	}
	
	@DeleteMapping("/subjects/{id}")//deleting a specific record
	public void delete(@PathVariable int id) {
		subjectsRepository.deleteById(id);
	}
}

