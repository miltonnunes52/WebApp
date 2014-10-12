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

import com.mkyong.customer.dao.SensorNodeHomeInt;
import com.mkyong.customer.model.SensorNode;

/**
 * Home object for domain model class SensorNode.
 * 
 * @see .SensorNode
 * @author Hibernate Tools
 */
public class SensorNodeHome implements SensorNodeHomeInt {

	private static final Log log = LogFactory.getLog(SensorNodeHome.class);

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
	 * com.mkyong.customer.dao.SensorNodeHomeInt#persist(com.mkyong.customer
	 * .dao.SensorNode)
	 */
	@Override
	public void persist(SensorNode transientInstance) {
		log.debug("persisting SensorNode instance");
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
	 * com.mkyong.customer.dao.SensorNodeHomeInt#attachDirty(com.mkyong.customer
	 * .dao.SensorNode)
	 */
	@Override
	public void attachDirty(SensorNode instance) {
		log.debug("attaching dirty SensorNode instance");
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
	 * com.mkyong.customer.dao.SensorNodeHomeInt#attachClean(com.mkyong.customer
	 * .dao.SensorNode)
	 */
	@Override
	public void attachClean(SensorNode instance) {
		log.debug("attaching clean SensorNode instance");
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
	 * com.mkyong.customer.dao.SensorNodeHomeInt#delete(com.mkyong.customer.
	 * dao.SensorNode)
	 */
	@Override
	public void delete(SensorNode persistentInstance) {
		log.debug("deleting SensorNode instance");
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
	 * com.mkyong.customer.dao.SensorNodeHomeInt#merge(com.mkyong.customer.dao
	 * .SensorNode)
	 */
	@Override
	public SensorNode merge(SensorNode detachedInstance) {
		log.debug("merging SensorNode instance");
		try {
			SensorNode result = (SensorNode) sessionFactory.getCurrentSession()
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
	 * com.mkyong.customer.dao.SensorNodeHomeInt#findById(java.lang.Integer)
	 */
	@Override
	public SensorNode findById(java.lang.Integer id) {
		log.debug("getting SensorNode instance with id: " + id);
		try {
			SensorNode instance = (SensorNode) sessionFactory
					.getCurrentSession().get("SensorNode", id);
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
	 * com.mkyong.customer.dao.SensorNodeHomeInt#findByExample(com.mkyong.customer
	 * .dao.SensorNode)
	 */
	@Override
	public List<SensorNode> findByExample(SensorNode instance) {
		log.debug("finding SensorNode instance by example");
		try {
			List<SensorNode> results = (List<SensorNode>) sessionFactory
					.getCurrentSession().createCriteria("SensorNode")
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
