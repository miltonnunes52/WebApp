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

import com.mkyong.customer.dao.RealHomeInt;
import com.mkyong.customer.model.Real;

/**
 * Home object for domain model class Real.
 * 
 * @see .Real
 * @author Hibernate Tools
 */
public class RealHome implements RealHomeInt {

	private static final Log log = LogFactory.getLog(RealHome.class);

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
	 * com.mkyong.customer.dao.RealHomeInt#persist(com.mkyong.customer.dao.Real)
	 */
	@Override
	public void persist(Real transientInstance) {
		log.debug("persisting Real instance");
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
	 * com.mkyong.customer.dao.RealHomeInt#attachDirty(com.mkyong.customer.dao
	 * .Real)
	 */
	@Override
	public void attachDirty(Real instance) {
		log.debug("attaching dirty Real instance");
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
	 * com.mkyong.customer.dao.RealHomeInt#attachClean(com.mkyong.customer.dao
	 * .Real)
	 */
	@Override
	public void attachClean(Real instance) {
		log.debug("attaching clean Real instance");
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
	 * com.mkyong.customer.dao.RealHomeInt#delete(com.mkyong.customer.dao.Real)
	 */
	@Override
	public void delete(Real persistentInstance) {
		log.debug("deleting Real instance");
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
	 * com.mkyong.customer.dao.RealHomeInt#merge(com.mkyong.customer.dao.Real)
	 */
	@Override
	public Real merge(Real detachedInstance) {
		log.debug("merging Real instance");
		try {
			Real result = (Real) sessionFactory.getCurrentSession().merge(
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
	 * @see com.mkyong.customer.dao.RealHomeInt#findById(java.lang.Integer)
	 */
	@Override
	public Real findById(java.lang.Integer id) {
		log.debug("getting Real instance with id: " + id);
		try {
			Real instance = (Real) sessionFactory.getCurrentSession().get(
					"Real", id);
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
	 * com.mkyong.customer.dao.RealHomeInt#findByExample(com.mkyong.customer
	 * .dao.Real)
	 */
	@Override
	public List<Real> findByExample(Real instance) {
		log.debug("finding Real instance by example");
		try {
			List<Real> results = (List<Real>) sessionFactory
					.getCurrentSession().createCriteria("Real")
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
