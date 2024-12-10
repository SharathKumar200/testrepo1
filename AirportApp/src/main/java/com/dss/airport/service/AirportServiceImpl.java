package com.dss.airport.service;

import java.util.Objects;

import org.springframework.stereotype.Component;

import com.dss.airport.entity.AirportEntity;

@Component
public class AirportServiceImpl implements AirportService {

	public AirportServiceImpl() {
		System.out.println(getClass().getSimpleName() + "created..");
	}

	@Override
	public boolean validateAirportEntity(AirportEntity entity) {
		boolean flag = false;

		if (entity == null) {
			throw new IllegalArgumentException("Airport entity can not be null...");
		}
		if (Objects.nonNull(entity.getAirport_name()) && entity.getAirport_name().isEmpty()
				&& entity.getAirport_name().isBlank()) {
			System.out.println("Airport_name is valid....");
			flag = true;
		}
		if (entity.getAirport_location() != null && entity.getAirport_location().isEmpty()
				&& entity.getAirport_location().isBlank()) {
			flag = true;
		}
		if (entity.getAirport_location() != null && entity.getAirport_location().isEmpty()
				&& entity.getAirport_location().isBlank()) {
			System.out.println("Airport_location is valid....");
			flag = true;
		}

		if (entity.getNo_of_planes() != 0) {

			flag = true;
		}
		if (entity.getNo_of_runways() != 0) {
			flag = true;
		}
		return flag;

	}

	@Override
	public boolean validateLocation(String location) {

		return location != null ? true : false;
	}

	@Override
	public boolean validateId(int id) {

		return id > 0 ? true : false;
	}
}
