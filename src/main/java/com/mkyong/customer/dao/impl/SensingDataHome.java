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

import com.mkyong.customer.dao.SensingDataHomeInt;
import com.mkyong.customer.model.SensingData;
import com.mkyong.customer.model.SensingDataId;

/**
 * Home object for domain model class SensingData.
 * 
 * @see .SensingData
 * @author Hibernate Tools
 */
public class SensingDataHome implements SensingDataHomeInt {

	private static final Log log = LogFactory.getLog(SensingDataHome.class);

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
	 * com.mkyong.customer.dao.SensingDataHomeInt#persist(com.mkyong.customer
	 * .dao.SensingData)
	 */
	@Override
	public void persist(SensingData transientInstance) {
		log.debug("persisting SensingData instance");
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
	 * com.mkyong.customer.dao.SensingDataHomeInt#attachDirty(com.mkyong.customer
	 * .dao.SensingData)
	 */
	@Override
	public void attachDirty(SensingData instance) {
		log.debug("attaching dirty SensingData instance");
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
	 * com.mkyong.customer.dao.SensingDataHomeInt#attachClean(com.mkyong.customer
	 * .dao.SensingData)
	 */
	@Override
	public void attachClean(SensingData instance) {
		log.debug("attaching clean SensingData instance");
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
	 * com.mkyong.customer.dao.SensingDataHomeInt#delete(com.mkyong.customer
	 * .dao.SensingData)
	 */
	@Override
	public void delete(SensingData persistentInstance) {
		log.debug("deleting SensingData instance");
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
	 * com.mkyong.customer.dao.SensingDataHomeInt#merge(com.mkyong.customer.
	 * dao.SensingData)
	 */
	@Override
	public SensingData merge(SensingData detachedInstance) {
		log.debug("merging SensingData instance");
		try {
			SensingData result = (SensingData) sessionFactory
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
	 * com.mkyong.customer.dao.SensingDataHomeInt#findById(com.mkyong.customer
	 * .dao.SensingDataId)
	 */
	@Override
	public SensingData findById(SensingDataId id) {
		log.debug("getting SensingData instance with id: " + id);
		try {
			SensingData instance = (SensingData) sessionFactory
					.getCurrentSession().get("SensingData", (Serializable) id);
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
	 * com.mkyong.customer.dao.SensingDataHomeInt#findByExample(com.mkyong.customer
	 * .dao.SensingData)
	 */
	@Override
	public List<SensingData> findByExample(SensingData instance) {
		log.debug("finding SensingData instance by example");
		try {
			List<SensingData> results = (List<SensingData>) sessionFactory
					.getCurrentSession().createCriteria("SensingData")
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
