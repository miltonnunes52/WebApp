package com.mkyong.customer.dao.impl;

// default package
// Generated 10/Out/2014 16:22:13 by Hibernate Tools 3.6.0

import static org.hibernate.criterion.Example.create;

import java.io.Serializable;
import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.mkyong.customer.dao.ModalitiesHasSensorHomeInt;
import com.mkyong.customer.model.ModalitiesHasSensor;
import com.mkyong.customer.model.ModalitiesHasSensorId;

/**
 * Home object for domain model class ModalitiesHasSensor.
 * 
 * @see .ModalitiesHasSensor
 * @author Hibernate Tools
 */
public class ModalitiesHasSensorHome implements ModalitiesHasSensorHomeInt {

	private static final Log log = LogFactory
			.getLog(ModalitiesHasSensorHome.class);

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
	 * com.mkyong.customer.dao.ModalitiesHasSensorHomeInt#persist(com.mkyong
	 * .customer.dao.ModalitiesHasSensor)
	 */
	@Override
	public void persist(ModalitiesHasSensor transientInstance) {
		log.debug("persisting ModalitiesHasSensor instance");
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
	 * com.mkyong.customer.dao.ModalitiesHasSensorHomeInt#attachDirty(com.mkyong
	 * .customer.dao.ModalitiesHasSensor)
	 */
	@Override
	public void attachDirty(ModalitiesHasSensor instance) {
		log.debug("attaching dirty ModalitiesHasSensor instance");
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
	 * com.mkyong.customer.dao.ModalitiesHasSensorHomeInt#attachClean(com.mkyong
	 * .customer.dao.ModalitiesHasSensor)
	 */
	@Override
	public void attachClean(ModalitiesHasSensor instance) {
		log.debug("attaching clean ModalitiesHasSensor instance");
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
	 * com.mkyong.customer.dao.ModalitiesHasSensorHomeInt#delete(com.mkyong.
	 * customer.dao.ModalitiesHasSensor)
	 */
	@Override
	public void delete(ModalitiesHasSensor persistentInstance) {
		log.debug("deleting ModalitiesHasSensor instance");
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
	 * com.mkyong.customer.dao.ModalitiesHasSensorHomeInt#merge(com.mkyong.customer
	 * .dao.ModalitiesHasSensor)
	 */
	@Override
	public ModalitiesHasSensor merge(ModalitiesHasSensor detachedInstance) {
		log.debug("merging ModalitiesHasSensor instance");
		try {
			ModalitiesHasSensor result = (ModalitiesHasSensor) sessionFactory
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
	 * com.mkyong.customer.dao.ModalitiesHasSensorHomeInt#findById(com.mkyong
	 * .customer.dao.ModalitiesHasSensorId)
	 */
	@Override
	public ModalitiesHasSensor findById(ModalitiesHasSensorId id) {
		log.debug("getting ModalitiesHasSensor instance with id: " + id);
		try {
			ModalitiesHasSensor instance = (ModalitiesHasSensor) sessionFactory
					.getCurrentSession().get("ModalitiesHasSensor",
							(Serializable) id);
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
	 * com.mkyong.customer.dao.ModalitiesHasSensorHomeInt#findByExample(com.
	 * mkyong.customer.dao.ModalitiesHasSensor)
	 */
	@Override
	public List<ModalitiesHasSensor> findByExample(ModalitiesHasSensor instance) {
		log.debug("finding ModalitiesHasSensor instance by example");
		try {
			List<ModalitiesHasSensor> results = (List<ModalitiesHasSensor>) sessionFactory
					.getCurrentSession().createCriteria("ModalitiesHasSensor")
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
