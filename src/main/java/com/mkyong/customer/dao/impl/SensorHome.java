package com.mkyong.customer.dao.impl;

// default package
// Generated 10/Out/2014 16:22:13 by Hibernate Tools 3.6.0

import static org.hibernate.criterion.Example.create;

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.mkyong.customer.dao.SensorHomeInt;
import com.mkyong.customer.model.Sensor;

/**
 * Home object for domain model class Sensor.
 * 
 * @see .Sensor
 * @author Hibernate Tools
 */
public class SensorHome implements SensorHomeInt {

	private static final Log log = LogFactory.getLog(SensorHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext()
					.lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mkyong.customer.dao.SensorHomeInt#persist(com.mkyong.customer.dao
	 * .Sensor)
	 */
	@Override
	public void persist(Sensor transientInstance) {
		log.debug("persisting Sensor instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mkyong.customer.dao.SensorHomeInt#attachDirty(com.mkyong.customer
	 * .dao.Sensor)
	 */
	@Override
	public void attachDirty(Sensor instance) {
		log.debug("attaching dirty Sensor instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mkyong.customer.dao.SensorHomeInt#attachClean(com.mkyong.customer
	 * .dao.Sensor)
	 */
	@Override
	public void attachClean(Sensor instance) {
		log.debug("attaching clean Sensor instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mkyong.customer.dao.SensorHomeInt#delete(com.mkyong.customer.dao.
	 * Sensor)
	 */
	@Override
	public void delete(Sensor persistentInstance) {
		log.debug("deleting Sensor instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mkyong.customer.dao.SensorHomeInt#merge(com.mkyong.customer.dao.Sensor
	 * )
	 */
	@Override
	public Sensor merge(Sensor detachedInstance) {
		log.debug("merging Sensor instance");
		try {
			Sensor result = (Sensor) sessionFactory.getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mkyong.customer.dao.SensorHomeInt#findById(java.lang.Integer)
	 */
	@Override
	public Sensor findById(java.lang.Integer id) {
		log.debug("getting Sensor instance with id: " + id);
		try {
			Sensor instance = (Sensor) sessionFactory.getCurrentSession().get(
					"Sensor", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mkyong.customer.dao.SensorHomeInt#findByExample(com.mkyong.customer
	 * .dao.Sensor)
	 */
	@Override
	public List<Sensor> findByExample(Sensor instance) {
		log.debug("finding Sensor instance by example");
		try {
			List<Sensor> results = (List<Sensor>) sessionFactory
					.getCurrentSession().createCriteria("Sensor")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
