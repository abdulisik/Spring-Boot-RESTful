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
	
	//creating a get mapping that retrieves all the subjects detail from the database
	@GetMapping("/subjects")
	public List<Subjects> getAllSubjects() {
		return subjectsService.getAllSubjects();
	}
	
	//creating a get mapping that retrieves the detail of a specific subjects
	@GetMapping("/subjects/{id}")
	public Subjects getSubjects(@PathVariable("id") int id) {
		return subjectsService.getSubjectsById(id);
	}
	
	//creating delete mapping that deletes a specific subjects
	@DeleteMapping("/subjects/{id}")
	public void deleteSubjects(@PathVariable("id") int id) {
		subjectsService.delete(id);
	}
	
	//creating post mapping that post the subjects detail in the database
	@PostMapping("/subjects")
	public int saveSubjects(@RequestBody Subjects subjects) {
		subjectsService.saveOrUpdate(subjects);
		return subjects.getId();
	}
}

