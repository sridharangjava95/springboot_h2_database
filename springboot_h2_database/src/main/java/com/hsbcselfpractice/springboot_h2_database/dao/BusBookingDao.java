package com.hsbcselfpractice.springboot_h2_database.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hsbcselfpractice.springboot_h2_database.model.Bus;

public interface BusBookingDao extends JpaRepository<Bus, Integer> {

}
