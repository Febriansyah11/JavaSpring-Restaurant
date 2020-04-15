package com.wmb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wmb.model.Tabless;


public interface TableRepo extends JpaRepository<Tabless, Integer>  {}

