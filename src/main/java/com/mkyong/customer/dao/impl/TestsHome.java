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

import com.mkyong.customer.dao.TestsHomeInt;
import com.mkyong.customer.model.Tests;

/**
 * Home object for domain model class Tests.
 * 
 * @see .Tests
 * @author Hibernate Tools
 */
public class TestsHome implements TestsHomeInt {

	private static final Log log = LogFactory.getLog(TestsHome.class);

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
	 * com.mkyong.customer.dao.TestsHomeInt#persist(com.mkyong.customer.dao.
	 * Tests)
	 */
	@Override
	public void persist(Tests transientInstance) {
		log.debug("persisting Tests instance");
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
	 * com.mkyong.customer.dao.TestsHomeInt#attachDirty(com.mkyong.customer.
	 * dao.Tests)
	 */
	@Override
	public void attachDirty(Tests instance) {
		log.debug("attaching dirty Tests instance");
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
	 * com.mkyong.customer.dao.TestsHomeInt#attachClean(com.mkyong.customer.
	 * dao.Tests)
	 */
	@Override
	public void attachClean(Tests instance) {
		log.debug("attaching clean Tests instance");
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
	 * com.mkyong.customer.dao.TestsHomeInt#delete(com.mkyong.customer.dao.Tests
	 * )
	 */
	@Override
	public void delete(Tests persistentInstance) {
		log.debug("deleting Tests instance");
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
	 * com.mkyong.customer.dao.TestsHomeInt#merge(com.mkyong.customer.dao.Tests)
	 */
	@Override
	public Tests merge(Tests detachedInstance) {
		log.debug("merging Tests instance");
		try {
			Tests result = (Tests) sessionFactory.getCurrentSession().merge(
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
	 * @see com.mkyong.customer.dao.TestsHomeInt#findById(java.lang.Integer)
	 */
	@Override
	public Tests findById(java.lang.Integer id) {
		log.debug("getting Tests instance with id: " + id);
		try {
			Tests instance = (Tests) sessionFactory.getCurrentSession().get(
					"Tests", id);
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
	 * com.mkyong.customer.dao.TestsHomeInt#findByExample(com.mkyong.customer
	 * .dao.Tests)
	 */
	@Override
	public List<Tests> findByExample(Tests instance) {
		log.debug("finding Tests instance by example");
		try {
			List<Tests> results = (List<Tests>) sessionFactory
					.getCurrentSession().createCriteria("Tests")
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
