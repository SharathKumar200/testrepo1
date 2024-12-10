package com.dss.airport;

//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dss.airport.dao.AirportDAO;
//import com.dss.airport.entity.AirportEntity;
//
//import oracle.jdbc.clio.annotations.Trace;
import com.dss.airport.entity.AirportEntity;
import com.dss.airport.service.AirportService;

public class AirportTester {

	public static void main(String args[]) {
		String configLocation = "beanconfig.xml";
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		System.out.println(context);
		AirportDAO airportDAO = context.getBean(AirportDAO.class);
		AirportEntity entity = new AirportEntity("kempgowda4", "Mysore", 5, 5);

		AirportService service = context.getBean(AirportService.class);

		boolean isValid = service.validateAirportEntity(entity);
		if (isValid) {
			airportDAO.saveAirportEntity(entity);
		} else {
			System.out.println("try again....data is not valid....");
		}
// Airport airport = context.getBean(Airport.class);
//
//		System.out.println(airport.AirportLocation);
//		System.out.println(airport.AirportName);
//		System.out.println(airport.isAirportInternationl);
//		System.out.println(airport.noOfRunways);
//		System.out.println(airport.runway);
//		SessionFactory sessionFactory = context.getBean(SessionFactory.class);
		context.close();
		System.out.println("End of Spring Application............");

	}

}
