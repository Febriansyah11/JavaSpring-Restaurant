package com.wmb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wmb.model.Tabless;
import com.wmb.service.TableServices;

@RestController
@RequestMapping("/tables")
@CrossOrigin(origins = "*", maxAge = 3600)
public class TableCtrl {
	
	@Autowired
	TableServices tableServices;
	
	@GetMapping("")
	public List<Tabless> findAll() {
		return tableServices.findAll();
	}
	
	@GetMapping("/{id}")
	public Tabless findById(@PathVariable Integer id) throws Exception {
		return tableServices.findById(id);
	}
	
	@PostMapping("")
	public Tabless create(@RequestBody Tabless tables) {
		return tableServices.save(tables);
	}
	
	@PutMapping("/{id}")
	public Tabless update(@RequestBody @PathVariable Tabless tables, Integer id) {
		return tableServices.save(tables);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		tableServices.delete(id);
	}
	
}
