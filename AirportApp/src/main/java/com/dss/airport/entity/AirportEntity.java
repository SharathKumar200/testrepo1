package com.dss.airport.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "airport_table")
public class AirportEntity implements java.io.Serializable {
	@Column(name = "AIRPORT_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long airport_id;
	@Column(name = "AIRPORT_NAME")
	private String airport_name;
	@Column(name = "AIRPORT_LOCATION")
	private String airport_location;
	@Column(name = "NO_OF_PLANES")
	private int no_of_planes;
	@Column(name = "NO_OF_RUNWAYS")
	private int no_of_runways;

	public Long getAirport_id() {
		return airport_id;
	}

	public AirportEntity() {

	}

	public AirportEntity(String airport_name, String airport_location, int no_of_planes, int no_of_runways) {
		super();

		this.airport_name = airport_name;
		this.airport_location = airport_location;
		this.no_of_planes = no_of_planes;
		this.no_of_runways = no_of_runways;
	}

	public void setAirport_id(Long airport_id) {
		this.airport_id = airport_id;
	}

	public String getAirport_name() {
		return airport_name;
	}

	public void setAirport_name(String airport_name) {
		this.airport_name = airport_name;
	}

	public String getAirport_location() {
		return airport_location;
	}

	public void setAirport_location(String airport_location) {
		this.airport_location = airport_location;
	}

	public int getNo_of_planes() {
		return no_of_planes;
	}

	public void setNo_of_planes(int no_of_planes) {
		this.no_of_planes = no_of_planes;
	}

	public int getNo_of_runways() {
		return no_of_runways;
	}

	public void setNo_of_runways(int no_of_runways) {
		this.no_of_runways = no_of_runways;
	}

	@Override
	public String toString() {
		return "AirportEntity [airport_id=" + airport_id + ", airport_name=" + airport_name + ", airport_location="
				+ airport_location + ", no_of_planes=" + no_of_planes + ", no_of_runways=" + no_of_runways + "]";
	}

}
