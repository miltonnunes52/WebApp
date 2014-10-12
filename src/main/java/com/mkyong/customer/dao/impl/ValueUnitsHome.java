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

import com.mkyong.customer.dao.ValueUnitsHomeInt;
import com.mkyong.customer.model.ValueUnits;

/**
 * Home object for domain model class ValueUnits.
 * 
 * @see .ValueUnits
 * @author Hibernate Tools
 */
public class ValueUnitsHome implements ValueUnitsHomeInt {

	private static final Log log = LogFactory.getLog(ValueUnitsHome.class);

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
	 * com.mkyong.customer.dao.ValueUnitsHomeInt#persist(com.mkyong.customer
	 * .dao.ValueUnits)
	 */
	@Override
	public void persist(ValueUnits transientInstance) {
		log.debug("persisting ValueUnits instance");
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
	 * com.mkyong.customer.dao.ValueUnitsHomeInt#attachDirty(com.mkyong.customer
	 * .dao.ValueUnits)
	 */
	@Override
	public void attachDirty(ValueUnits instance) {
		log.debug("attaching dirty ValueUnits instance");
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
	 * com.mkyong.customer.dao.ValueUnitsHomeInt#attachClean(com.mkyong.customer
	 * .dao.ValueUnits)
	 */
	@Override
	public void attachClean(ValueUnits instance) {
		log.debug("attaching clean ValueUnits instance");
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
	 * com.mkyong.customer.dao.ValueUnitsHomeInt#delete(com.mkyong.customer.
	 * dao.ValueUnits)
	 */
	@Override
	public void delete(ValueUnits persistentInstance) {
		log.debug("deleting ValueUnits instance");
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
	 * com.mkyong.customer.dao.ValueUnitsHomeInt#merge(com.mkyong.customer.dao
	 * .ValueUnits)
	 */
	@Override
	public ValueUnits merge(ValueUnits detachedInstance) {
		log.debug("merging ValueUnits instance");
		try {
			ValueUnits result = (ValueUnits) sessionFactory.getCurrentSession()
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
	 * com.mkyong.customer.dao.ValueUnitsHomeInt#findById(java.lang.Integer)
	 */
	@Override
	public ValueUnits findById(java.lang.Integer id) {
		log.debug("getting ValueUnits instance with id: " + id);
		try {
			ValueUnits instance = (ValueUnits) sessionFactory
					.getCurrentSession().get("ValueUnits", id);
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
	 * com.mkyong.customer.dao.ValueUnitsHomeInt#findByExample(com.mkyong.customer
	 * .dao.ValueUnits)
	 */
	@Override
	public List<ValueUnits> findByExample(ValueUnits instance) {
		log.debug("finding ValueUnits instance by example");
		try {
			List<ValueUnits> results = (List<ValueUnits>) sessionFactory
					.getCurrentSession().createCriteria("ValueUnits")
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
