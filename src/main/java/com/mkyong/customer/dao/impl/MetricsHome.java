package com.mkyong.customer.dao.impl;

// default package
// Generated 10/Out/2014 16:22:13 by Hibernate Tools 3.6.0

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mkyong.customer.dao.MetricsHomeInt;
import com.mkyong.customer.model.Metrics;

/**
 * Home object for domain model class Metrics.
 * 
 * @see .Metrics
 * @author Hibernate Tools
 */
public class MetricsHome extends HibernateDaoSupport implements MetricsHomeInt {

	private static final Log log = LogFactory.getLog(MetricsHome.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mkyong.customer.dao.MetricsHomeInt#persist(com.mkyong.customer.dao
	 * .Metrics)
	 */
	@Override
	public void persist(Metrics transientInstance) {
		log.debug("persisting Metrics instance");
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
	 * com.mkyong.customer.dao.MetricsHomeInt#attachDirty(com.mkyong.customer
	 * .dao.Metrics)
	 */
	@Override
	public void attachDirty(Metrics instance) {
		log.debug("attaching dirty Metrics instance");
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
	 * com.mkyong.customer.dao.MetricsHomeInt#attachClean(com.mkyong.customer
	 * .dao.Metrics)
	 */
	@Override
	public void attachClean(Metrics instance) {
		log.debug("attaching clean Metrics instance");
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
	 * com.mkyong.customer.dao.MetricsHomeInt#delete(com.mkyong.customer.dao
	 * .Metrics)
	 */
	@Override
	public void delete(Metrics persistentInstance) {
		log.debug("deleting Metrics instance");
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
	 * com.mkyong.customer.dao.MetricsHomeInt#merge(com.mkyong.customer.dao.
	 * Metrics)
	 */
	@Override
	public Metrics merge(Metrics detachedInstance) {
		log.debug("merging Metrics instance");
		try {
			Metrics result = (Metrics) getHibernateTemplate().merge(
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
	 * @see com.mkyong.customer.dao.MetricsHomeInt#findById(java.lang.Integer)
	 */
	@Override
	public Metrics findById(java.lang.Integer id) {
		log.debug("getting Metrics instance with id: " + id);
		try {
			Metrics instance = (Metrics) getHibernateTemplate().get("Metrics",
					id);
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
	 * com.mkyong.customer.dao.MetricsHomeInt#findByExample(com.mkyong.customer
	 * .dao.Metrics)
	 */
	@Override
	public List<Metrics> findByExample(Metrics instance) {
		log.debug("finding Metrics instance by example");
		try {
			List<Metrics> results = (List<Metrics>) getHibernateTemplate()
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
	public List<Metrics> getAll() {
		log.debug("finding all Metrics");
		try {
			List<Metrics> results = (List<Metrics>) getHibernateTemplate()
					.find("From Metrics");
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

			List<Metrics> results = (List<Metrics>) getHibernateTemplate()
					.find("From Metrics");
			log.debug("find by example successful, result size: " + results);

			return results.size();
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
