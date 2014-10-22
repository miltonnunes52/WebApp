package com.mkyong.customer.dao.impl;

// default package
// Generated 10/Out/2014 16:22:13 by Hibernate Tools 3.6.0

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mkyong.customer.dao.MidlevelInformationHomeInt;
import com.mkyong.customer.model.MidlevelInformation;

/**
 * Home object for domain model class MidlevelInformation.
 * 
 * @see .MidlevelInformation
 * @author Hibernate Tools
 */
public class MidlevelInformationHome extends HibernateDaoSupport implements
		MidlevelInformationHomeInt {

	private static final Log log = LogFactory
			.getLog(MidlevelInformationHome.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mkyong.customer.dao.MidlevelInformationHomeInt#persist(com.mkyong
	 * .customer.dao.MidlevelInformation)
	 */
	@Override
	public void persist(MidlevelInformation transientInstance) {
		log.debug("persisting MidlevelInformation instance");
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
	 * com.mkyong.customer.dao.MidlevelInformationHomeInt#attachDirty(com.mkyong
	 * .customer.dao.MidlevelInformation)
	 */
	@Override
	public void attachDirty(MidlevelInformation instance) {
		log.debug("attaching dirty MidlevelInformation instance");
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
	 * com.mkyong.customer.dao.MidlevelInformationHomeInt#attachClean(com.mkyong
	 * .customer.dao.MidlevelInformation)
	 */
	@Override
	public void attachClean(MidlevelInformation instance) {
		log.debug("attaching clean MidlevelInformation instance");
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
	 * com.mkyong.customer.dao.MidlevelInformationHomeInt#delete(com.mkyong.
	 * customer.dao.MidlevelInformation)
	 */
	@Override
	public void delete(MidlevelInformation persistentInstance) {
		log.debug("deleting MidlevelInformation instance");
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
	 * com.mkyong.customer.dao.MidlevelInformationHomeInt#merge(com.mkyong.customer
	 * .dao.MidlevelInformation)
	 */
	@Override
	public MidlevelInformation merge(MidlevelInformation detachedInstance) {
		log.debug("merging MidlevelInformation instance");
		try {
			MidlevelInformation result = (MidlevelInformation) getHibernateTemplate()
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
	 * com.mkyong.customer.dao.MidlevelInformationHomeInt#findById(java.lang
	 * .Integer)
	 */
	@Override
	public MidlevelInformation findById(java.lang.Integer id) {
		log.debug("getting MidlevelInformation instance with id: " + id);
		try {
			MidlevelInformation instance = (MidlevelInformation) getHibernateTemplate()
					.get("MidlevelInformation", id);
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
	 * com.mkyong.customer.dao.MidlevelInformationHomeInt#findByExample(com.
	 * mkyong.customer.dao.MidlevelInformation)
	 */

	@Override
	public List<MidlevelInformation> getMidLevelByIDSensing(int idsensing,
			int idsensornode, int metrica) {
		log.debug("count");
		try {
			Object[] params = { idsensing, idsensornode, metrica };

			List<MidlevelInformation> results = (List<MidlevelInformation>) getHibernateTemplate()
					.find("Select m From MidlevelInformation m where m.sensingDataIdSensing = ? and m.sensingDataSensorNodeIdSensorNode = ? and m.metricsIdMetrics = ?",
							params);

			log.debug("find by example successful, result size: " + results);

			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	@Override
	public List<MidlevelInformation> findByExample(MidlevelInformation instance) {
		// TODO Auto-generated method stub
		return null;
	}
}
