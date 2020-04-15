package com.wmb.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wmb.model.Tabless;
import com.wmb.repository.TableRepo;
import com.wmb.service.TableServices;

@Service
public class TableImpl implements TableServices {
	
	@Autowired
	TableRepo tableRepo;
	
	public List<Tabless> findAll() {
		return tableRepo.findAll();
	}

	public Tabless findById(Integer id) throws Exception {
		if (findAll().isEmpty()) {
			throw new Exception("404 List Not Found");
		} else {
			for (int i = 0; i < findAll().size(); i++) {
				Tabless index = findAll().get(i);
				if (index.getId() == id) {
					return index;
				}
			}
		}
		throw new Exception("Eror 404 Id Not Found");
	}
	public Tabless save(Tabless table) {
		return tableRepo.save(table);
	}
	public void delete(Integer id) {
		tableRepo.deleteById(id);
	}

}
