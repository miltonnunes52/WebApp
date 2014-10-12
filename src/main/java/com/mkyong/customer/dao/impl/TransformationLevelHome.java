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

import com.mkyong.customer.dao.TransformationLevelHomeInt;
import com.mkyong.customer.model.TransformationLevel;

/**
 * Home object for domain model class TransformationLevel.
 * 
 * @see .TransformationLevel
 * @author Hibernate Tools
 */
public class TransformationLevelHome implements TransformationLevelHomeInt {

	private static final Log log = LogFactory
			.getLog(TransformationLevelHome.class);

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
	 * com.mkyong.customer.dao.TransformationLevelHomeInt#persist(com.mkyong
	 * .customer.dao.TransformationLevel)
	 */
	@Override
	public void persist(TransformationLevel transientInstance) {
		log.debug("persisting TransformationLevel instance");
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
	 * com.mkyong.customer.dao.TransformationLevelHomeInt#attachDirty(com.mkyong
	 * .customer.dao.TransformationLevel)
	 */
	@Override
	public void attachDirty(TransformationLevel instance) {
		log.debug("attaching dirty TransformationLevel instance");
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
	 * com.mkyong.customer.dao.TransformationLevelHomeInt#attachClean(com.mkyong
	 * .customer.dao.TransformationLevel)
	 */
	@Override
	public void attachClean(TransformationLevel instance) {
		log.debug("attaching clean TransformationLevel instance");
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
	 * com.mkyong.customer.dao.TransformationLevelHomeInt#delete(com.mkyong.
	 * customer.dao.TransformationLevel)
	 */
	@Override
	public void delete(TransformationLevel persistentInstance) {
		log.debug("deleting TransformationLevel instance");
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
	 * com.mkyong.customer.dao.TransformationLevelHomeInt#merge(com.mkyong.customer
	 * .dao.TransformationLevel)
	 */
	@Override
	public TransformationLevel merge(TransformationLevel detachedInstance) {
		log.debug("merging TransformationLevel instance");
		try {
			TransformationLevel result = (TransformationLevel) sessionFactory
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
	 * com.mkyong.customer.dao.TransformationLevelHomeInt#findById(java.lang
	 * .Integer)
	 */
	@Override
	public TransformationLevel findById(java.lang.Integer id) {
		log.debug("getting TransformationLevel instance with id: " + id);
		try {
			TransformationLevel instance = (TransformationLevel) sessionFactory
					.getCurrentSession().get("TransformationLevel", id);
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
	 * com.mkyong.customer.dao.TransformationLevelHomeInt#findByExample(com.
	 * mkyong.customer.dao.TransformationLevel)
	 */
	@Override
	public List<TransformationLevel> findByExample(TransformationLevel instance) {
		log.debug("finding TransformationLevel instance by example");
		try {
			List<TransformationLevel> results = (List<TransformationLevel>) sessionFactory
					.getCurrentSession().createCriteria("TransformationLevel")
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
