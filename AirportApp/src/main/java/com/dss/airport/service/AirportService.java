package com.dss.airport.service;

import com.dss.airport.entity.AirportEntity;

public interface AirportService {

	boolean validateAirportEntity(AirportEntity entity);

	boolean validateLocation(String location);

	boolean validateId(int id);
}
