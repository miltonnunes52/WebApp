package com.mkyong.customer.dao.impl;

// default package
// Generated 10/Out/2014 16:22:13 by Hibernate Tools 3.6.0

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mkyong.customer.dao.SensorNodeHomeInt;
import com.mkyong.customer.model.SensorNode;

/**
 * Home object for domain model class SensorNode.
 * 
 * @see .SensorNode
 * @author Hibernate Tools
 */
public class SensorNodeHome extends HibernateDaoSupport implements
		SensorNodeHomeInt {

	private static final Log log = LogFactory.getLog(SensorNodeHome.class);

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
	 * com.mkyong.customer.dao.SensorNodeHomeInt#attachDirty(com.mkyong.customer
	 * .dao.SensorNode)
	 */
	@Override
	public void attachDirty(SensorNode instance) {
		log.debug("attaching dirty SensorNode instance");
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
	 * com.mkyong.customer.dao.SensorNodeHomeInt#attachClean(com.mkyong.customer
	 * .dao.SensorNode)
	 */
	@Override
	public void attachClean(SensorNode instance) {
		log.debug("attaching clean SensorNode instance");
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
	 * com.mkyong.customer.dao.SensorNodeHomeInt#delete(com.mkyong.customer.
	 * dao.SensorNode)
	 */
	@Override
	public void delete(SensorNode persistentInstance) {
		log.debug("deleting SensorNode instance");
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
	 * com.mkyong.customer.dao.SensorNodeHomeInt#merge(com.mkyong.customer.dao
	 * .SensorNode)
	 */
	@Override
	public SensorNode merge(SensorNode detachedInstance) {
		log.debug("merging SensorNode instance");
		try {
			SensorNode result = (SensorNode) getHibernateTemplate().merge(
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
	 * @see
	 * com.mkyong.customer.dao.SensorNodeHomeInt#findById(java.lang.Integer)
	 */

	@Override
	public SensorNode findById(java.lang.Integer id) {
		log.debug("finding credentials");
		try {

			List<SensorNode> results = (List<SensorNode>) getHibernateTemplate()
					.find("From SensorNode where id=?", id);
			log.debug("find by example successful, result size: " + results);
			if (results.size() == 0)
				return null;
			else
				return results.get(0);
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
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
			List<SensorNode> results = (List<SensorNode>) getHibernateTemplate()
					.find("From SensorNode");
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
