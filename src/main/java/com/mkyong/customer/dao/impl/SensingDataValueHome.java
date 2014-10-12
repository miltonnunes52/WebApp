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

import com.mkyong.customer.dao.SensingDataValueHomeInt;
import com.mkyong.customer.model.SensingDataValue;

/**
 * Home object for domain model class SensingDataValue.
 * 
 * @see .SensingDataValue
 * @author Hibernate Tools
 */
public class SensingDataValueHome implements SensingDataValueHomeInt {

	private static final Log log = LogFactory
			.getLog(SensingDataValueHome.class);

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
	 * com.mkyong.customer.dao.SensingDataValueHomeInt#persist(com.mkyong.customer
	 * .dao.SensingDataValue)
	 */
	@Override
	public void persist(SensingDataValue transientInstance) {
		log.debug("persisting SensingDataValue instance");
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
	 * com.mkyong.customer.dao.SensingDataValueHomeInt#attachDirty(com.mkyong
	 * .customer.dao.SensingDataValue)
	 */
	@Override
	public void attachDirty(SensingDataValue instance) {
		log.debug("attaching dirty SensingDataValue instance");
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
	 * com.mkyong.customer.dao.SensingDataValueHomeInt#attachClean(com.mkyong
	 * .customer.dao.SensingDataValue)
	 */
	@Override
	public void attachClean(SensingDataValue instance) {
		log.debug("attaching clean SensingDataValue instance");
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
	 * com.mkyong.customer.dao.SensingDataValueHomeInt#delete(com.mkyong.customer
	 * .dao.SensingDataValue)
	 */
	@Override
	public void delete(SensingDataValue persistentInstance) {
		log.debug("deleting SensingDataValue instance");
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
	 * com.mkyong.customer.dao.SensingDataValueHomeInt#merge(com.mkyong.customer
	 * .dao.SensingDataValue)
	 */
	@Override
	public SensingDataValue merge(SensingDataValue detachedInstance) {
		log.debug("merging SensingDataValue instance");
		try {
			SensingDataValue result = (SensingDataValue) sessionFactory
					.getCurrentSession().merge(detachedInstance);
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
			SensingDataValue instance = (SensingDataValue) sessionFactory
					.getCurrentSession().get("SensingDataValue", id);
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
			List<SensingDataValue> results = (List<SensingDataValue>) sessionFactory
					.getCurrentSession().createCriteria("SensingDataValue")
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
