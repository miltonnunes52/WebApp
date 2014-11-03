package com.mkyong.customer.dao.impl;

// default package
// Generated 10/Out/2014 16:22:13 by Hibernate Tools 3.6.0

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mkyong.customer.dao.SensingDataValueHomeInt;
import com.mkyong.customer.model.SensingDataValue;

/**
 * Home object for domain model class SensingDataValue.
 * 
 * @see .SensingDataValue
 * @author Hibernate Tools
 */
public class SensingDataValueHome extends HibernateDaoSupport implements
		SensingDataValueHomeInt {

	private static final Log log = LogFactory
			.getLog(SensingDataValueHome.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mkyong.customer.dao.SensingDataValueHomeInt#persist(com.mkyong.customer
	 * .dao.SensingDataValue)
	 */
	@Override
	public void persist(SensingDataValue transientInstance) {
		log.debug("persisting SensingDataValue instance");
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
	 * com.mkyong.customer.dao.SensingDataValueHomeInt#attachDirty(com.mkyong
	 * .customer.dao.SensingDataValue)
	 */
	@Override
	public void attachDirty(SensingDataValue instance) {
		log.debug("attaching dirty SensingDataValue instance");
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
	 * com.mkyong.customer.dao.SensingDataValueHomeInt#attachClean(com.mkyong
	 * .customer.dao.SensingDataValue)
	 */
	@Override
	public void attachClean(SensingDataValue instance) {
		log.debug("attaching clean SensingDataValue instance");
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
	 * com.mkyong.customer.dao.SensingDataValueHomeInt#delete(com.mkyong.customer
	 * .dao.SensingDataValue)
	 */
	@Override
	public void delete(SensingDataValue persistentInstance) {
		log.debug("deleting SensingDataValue instance");
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
	 * com.mkyong.customer.dao.SensingDataValueHomeInt#merge(com.mkyong.customer
	 * .dao.SensingDataValue)
	 */
	@Override
	public SensingDataValue merge(SensingDataValue detachedInstance) {
		log.debug("merging SensingDataValue instance");
		try {
			SensingDataValue result = (SensingDataValue) getHibernateTemplate()
					.merge(detachedInstance);
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
	 * com.mkyong.customer.dao.SensingDataValueHomeInt#findById(java.lang.Integer
	 * )
	 */
	@Override
	public SensingDataValue findById(java.lang.Integer id) {
		log.debug("getting SensingDataValue instance with id: " + id);
		try {
			SensingDataValue instance = (SensingDataValue) getHibernateTemplate()
					.get("SensingDataValue", id);
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
	 * com.mkyong.customer.dao.SensingDataValueHomeInt#findByExample(com.mkyong
	 * .customer.dao.SensingDataValue)
	 */
	@Override
	public List<SensingDataValue> findByExample(SensingDataValue instance) {
		log.debug("finding SensingDataValue instance by example");
		try {
			List<SensingDataValue> results = (List<SensingDataValue>) getHibernateTemplate()
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
	public List<SensingDataValue> getValues(Integer sensing, Integer sensorNode) {
		log.debug("finding SensingData instance by example");
		try {
			Object[] params = { sensing, sensorNode };
			List<SensingDataValue> results = (List<SensingDataValue>) getHibernateTemplate()
					.find("Select sd From SensingDataValue sd where sd.sensingIdSensing = ? and sd.sensingIdSensorNode = ?",
							params);

			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
