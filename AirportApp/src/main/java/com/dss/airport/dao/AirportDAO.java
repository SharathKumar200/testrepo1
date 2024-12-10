package com.dss.airport.dao;

import java.util.List;

import com.dss.airport.entity.AirportEntity;

public interface AirportDAO {

	void saveAirportEntity(AirportEntity entity);

	AirportEntity getAirportEntityByID(int id);

	int getCountofRunWays();

	int getAvailablePlanes();

	AirportEntity updateAirportEntityByName(String name);

	AirportEntity updateAirportEntityByID(int id);

	AirportEntity updateAirportEntityByLocation(String Location);

	AirportEntity deleteAirportEntityByID(int id);

	List<AirportEntity> getAllAirportEntity();
}
