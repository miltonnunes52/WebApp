package com.mkyong.customer.dao.impl;

// default package
// Generated 10/Out/2014 16:22:13 by Hibernate Tools 3.6.0

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mkyong.customer.dao.SensingDataHomeInt;
import com.mkyong.customer.model.SensingData;
import com.mkyong.customer.model.SensingDataId;

/**
 * Home object for domain model class SensingData.
 * 
 * @see .SensingData
 * @author Hibernate Tools
 */
public class SensingDataHome extends HibernateDaoSupport implements
		SensingDataHomeInt {

	private static final Log log = LogFactory.getLog(SensingDataHome.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mkyong.customer.dao.SensingDataHomeInt#persist(com.mkyong.customer
	 * .dao.SensingData)
	 */
	@Override
	public void persist(SensingData transientInstance) {
		log.debug("persisting SensingData instance");
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
	 * com.mkyong.customer.dao.SensingDataHomeInt#attachDirty(com.mkyong.customer
	 * .dao.SensingData)
	 */
	@Override
	public void attachDirty(SensingData instance) {
		log.debug("attaching dirty SensingData instance");
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
	 * com.mkyong.customer.dao.SensingDataHomeInt#attachClean(com.mkyong.customer
	 * .dao.SensingData)
	 */
	@Override
	public void attachClean(SensingData instance) {
		log.debug("attaching clean SensingData instance");
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
	 * com.mkyong.customer.dao.SensingDataHomeInt#delete(com.mkyong.customer
	 * .dao.SensingData)
	 */
	@Override
	public void delete(SensingData persistentInstance) {
		log.debug("deleting SensingData instance");
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
	 * com.mkyong.customer.dao.SensingDataHomeInt#merge(com.mkyong.customer.
	 * dao.SensingData)
	 */
	@Override
	public SensingData merge(SensingData detachedInstance) {
		log.debug("merging SensingData instance");
		try {
			SensingData result = (SensingData) getHibernateTemplate().merge(
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
	 * @see
	 * com.mkyong.customer.dao.SensingDataHomeInt#findById(com.mkyong.customer
	 * .dao.SensingDataId)
	 */
	@Override
	public SensingData findById(SensingDataId id) {
		log.debug("getting SensingData instance with id: " + id);
		Object[] params = { id.getIdSensing(), id.getSensorNodeIdSensorNode() };
		try {
			List<SensingData> results = (List<SensingData>) getHibernateTemplate()
					.find("Select sd From SensingData sd where sd.id.idSensing = ? and sd.id.sensorNodeIdSensorNode = ?",
							params);

			log.debug("find by example successful, result size: "
					+ results.size());
			return results.get(0);
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mkyong.customer.dao.SensingDataHomeInt#findByExample(com.mkyong.customer
	 * .dao.SensingData)
	 */
	@Override
	public List<SensingData> findByExample(SensingData instance) {
		log.debug("finding SensingData instance by example");
		try {
			List<SensingData> results = (List<SensingData>) getHibernateTemplate()
					.findByExample(instance);
			;
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

			List<SensingData> results = (List<SensingData>) getHibernateTemplate()
					.find("From SensingData");
			log.debug("find by example successful, result size: " + results);

			return results.size();
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	@Override
	public List<SensingData> findActiveSensing() {
		log.debug("finding SensingData instance by example");
		try {
			List<SensingData> results = (List<SensingData>) getHibernateTemplate()
					.find("From SensingData where timeEnd = null");
			;
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	@Override
	public int countByUser(Integer user) {
		log.debug("count");
		try {

			List<SensingData> results = (List<SensingData>) getHibernateTemplate()
					.find("From SensingData where userProfileIdUserProfile =?",
							user);
			log.debug("find by example successful, result size: " + results);

			return results.size();
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	@Override
	public int countBySensor(Integer sensor) {
		log.debug("count");
		try {

			List<SensingData> results = (List<SensingData>) getHibernateTemplate()
					.find("From SensingData where id.sensorNodeIdSensorNode =?",
							sensor);
			log.debug("find by example successful, result size: " + results);

			return results.size();
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	@Override
	public List<SensingData> getSensingDataByUserAndMetric(Integer user,
			String type) {
		log.debug("finding SensingData instance by example");
		try {
			Object[] params = { user, type };
			List<SensingData> results = (List<SensingData>) getHibernateTemplate()
					.find("Select sd From SensingData sd, SensorNode sn, Sensor s where sd.userProfileIdUserProfile = ? and sd.id.sensorNodeIdSensorNode = sn.idSensorNode and sn.sensorIdSensor = s.idSensor and s.type = ?",
							params);

			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	@Override
	public int countByTypeAndData(String type, String data) {
		log.debug("finding SensingData instance by example");
		try {
			Object[] params = { "%" + data + "%", type };
			List<SensingData> results = (List<SensingData>) getHibernateTemplate()
					.find("Select sd From SensingData sd, SensorNode sn, Sensor s where sd.timeCreation like ? and sd.id.sensorNodeIdSensorNode = sn.idSensorNode and sn.sensorIdSensor = s.idSensor and s.type = ?",
							params);

			log.debug("find by example successful, result size: "
					+ results.size());
			return results.size();
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	@Override
	public int countByTypeAndDataAndUser(String type, String data, Integer user) {
		log.debug("finding SensingData instance by example");
		try {
			Object[] params = { "%" + data + "%", user, type };
			List<SensingData> results = (List<SensingData>) getHibernateTemplate()
					.find("Select sd From SensingData sd, SensorNode sn, Sensor s where sd.timeCreation like ? and sd.userProfileIdUserProfile = ? and sd.id.sensorNodeIdSensorNode = sn.idSensorNode and sn.sensorIdSensor = s.idSensor and s.type = ?",
							params);

			log.debug("find by example successful, result size: "
					+ results.size());
			return results.size();
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

}
