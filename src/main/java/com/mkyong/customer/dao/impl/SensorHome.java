package com.mkyong.customer.dao.impl;

// default package
// Generated 10/Out/2014 16:22:13 by Hibernate Tools 3.6.0

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mkyong.customer.dao.SensorHomeInt;
import com.mkyong.customer.model.Sensor;

/**
 * Home object for domain model class Sensor.
 * 
 * @see .Sensor
 * @author Hibernate Tools
 */
public class SensorHome extends HibernateDaoSupport implements SensorHomeInt {

	private static final Log log = LogFactory.getLog(SensorHome.class);

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
			getHibernateTemplate().persist(transientInstance);
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
			getHibernateTemplate().saveOrUpdate(instance);
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
			getHibernateTemplate().lock(instance, LockMode.NONE);
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
			getHibernateTemplate().delete(persistentInstance);
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
			Sensor result = (Sensor) getHibernateTemplate().merge(
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
		log.debug("finding credentials");
		try {

			List<Sensor> results = (List<Sensor>) getHibernateTemplate().find(
					"From Sensor where id=?", id);
			log.debug("find by example successful, result size: " + results);
			if (results.size() == 0)
				return null;
			else
				return results.get(0);
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
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
			List<Sensor> results = (List<Sensor>) getHibernateTemplate()
					.findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	@Override
	public List<Sensor> getAll() {
		log.debug("finding Sensor instance by example");
		try {
			List<Sensor> results = (List<Sensor>) getHibernateTemplate().find(
					"From Sensor");
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	@Override
	public int count() {
		log.debug("count");
		try {

			List<Sensor> results = (List<Sensor>) getHibernateTemplate().find(
					"From Sensor");
			log.debug("find by example successful, result size: " + results);

			return results.size();
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	@Override
	public List<Sensor> getSensorbyUser(Integer user) {
		log.debug("count");
		try {

			List<Sensor> results = (List<Sensor>) getHibernateTemplate()
					.find("Select distinct s From Sensor s, SensingData sd where s.idSensor = sd.id.sensorNodeIdSensorNode and sd.userProfileIdUserProfile=?",
							user);

			log.debug("find by example successful, result size: " + results);

			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	@Override
	public int countByUser(Integer user, Integer sensor) {
		log.debug("count");
		try {
			Object[] params = { user, sensor };
			List<Sensor> results = (List<Sensor>) getHibernateTemplate()
					.find("Select sd From SensingData sd, SensorNode sn where sd.userProfileIdUserProfile = ? and sd.id.sensorNodeIdSensorNode = sn.idSensorNode and sn.sensorIdSensor = ?",
							params);
			log.debug("find by example successful, result size: " + results);

			return results.size();
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	@Override
	public int countSensorsByUser(Integer user) {
		log.debug("count");
		try {

			List<Sensor> results = (List<Sensor>) getHibernateTemplate()
					.find("Select distinct sn.sensorIdSensor From SensingData sd, SensorNode sn where sd.userProfileIdUserProfile = ? and sd.id.sensorNodeIdSensorNode = sn.idSensorNode",
							user);
			log.debug("find by example successful, result size: " + results);

			return results.size();
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	@Override
	public int countTypesByUser(Integer user) {
		log.debug("count");
		try {

			List<Sensor> results = (List<Sensor>) getHibernateTemplate()
					.find("Select distinct s.type From SensingData sd, SensorNode sn, Sensor s where sd.userProfileIdUserProfile = ? and sd.id.sensorNodeIdSensorNode = sn.idSensorNode and sn.sensorIdSensor = s.idSensor",
							user);
			log.debug("find by example successful, result size: " + results);

			return results.size();
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
