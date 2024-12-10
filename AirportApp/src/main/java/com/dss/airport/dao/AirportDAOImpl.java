package com.dss.airport.dao;

import java.util.List;
import java.util.Objects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dss.airport.entity.AirportEntity;

@Component
public class AirportDAOImpl implements AirportDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public AirportDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
		System.out.println("SessionFactory is injected by IOC Conatainer");
	}

	@Override
	public void saveAirportEntity(AirportEntity entity) {
		System.out.println("invoked saveAirportEntity");
		Session session = null;
		Transaction transaction = null;
		try

		{
//		Configuration configuration = new Configuration();
//		  configuration.configure("hibernate.cfg.xml");

//		 sessionFactory = configuration.buildSessionFactory();
			session = this.sessionFactory.openSession();
			transaction = session.beginTransaction();

//			AirportEntity entity = new AirportEntity("3", "kempgowda2", "Mysore", 5, 5);
			session.save(entity);
			session.getTransaction().commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session closed.........");
			}
//			if (sessionFactory != null) {
//				sessionFactory.close();
//			}
		}
	}

	@Override
	public AirportEntity getAirportEntityByID(int id) {
		System.out.println("Invoked  getAirportEntity...");
		Session session = null;
		AirportEntity entity = null;
		try

		{

			session = this.sessionFactory.openSession();
			entity = session.get(AirportEntity.class, id);
			if (Objects.nonNull(entity)) {
				return entity;
			} else {
				System.out.println("AirportEntity not found ...please provide valid Id");
			}

		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session closed.........");
			}
		}
		return entity;
	}

	@Override
	public AirportEntity updateAirportEntityByName(String name) {

		return null;
	}

	@Override
	public AirportEntity updateAirportEntityByID(int id) {

		return null;
	}

	@Override
	public AirportEntity updateAirportEntityByLocation(String Location) {

		return null;
	}

	@Override
	public AirportEntity deleteAirportEntityByID(int id) {

		return null;
	}

	@Override
	public List<AirportEntity> getAllAirportEntity() {

		return null;
	}

	@Override
	public int getCountofRunWays() {

		return 0;
	}

	@Override
	public int getAvailablePlanes() {

		return 0;
	}

}
