package com.wmb.service;

import java.util.List;
import com.wmb.model.Tabless;

public interface TableServices {
	List<Tabless> findAll();
	Tabless findById(Integer id) throws Exception;	
	Tabless save(Tabless table);
	void delete(Integer id);
}
