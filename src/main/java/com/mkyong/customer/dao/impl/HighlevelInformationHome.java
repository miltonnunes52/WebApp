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

import com.mkyong.customer.dao.HighlevelInformationHomeInt;
import com.mkyong.customer.model.HighlevelInformation;

/**
 * Home object for domain model class HighlevelInformation.
 * 
 * @see .HighlevelInformation
 * @author Hibernate Tools
 */
public class HighlevelInformationHome implements HighlevelInformationHomeInt {

	private static final Log log = LogFactory
			.getLog(HighlevelInformationHome.class);

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
	 * com.mkyong.customer.dao.HighlevelInformationInt#persist(com.mkyong.customer
	 * .dao.HighlevelInformation)
	 */
	@Override
	public void persist(HighlevelInformation transientInstance) {
		log.debug("persisting HighlevelInformation instance");
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
	 * com.mkyong.customer.dao.HighlevelInformationInt#attachDirty(com.mkyong
	 * .customer.dao.HighlevelInformation)
	 */
	@Override
	public void attachDirty(HighlevelInformation instance) {
		log.debug("attaching dirty HighlevelInformation instance");
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
	 * com.mkyong.customer.dao.HighlevelInformationInt#attachClean(com.mkyong
	 * .customer.dao.HighlevelInformation)
	 */
	@Override
	public void attachClean(HighlevelInformation instance) {
		log.debug("attaching clean HighlevelInformation instance");
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
	 * com.mkyong.customer.dao.HighlevelInformationInt#delete(com.mkyong.customer
	 * .dao.HighlevelInformation)
	 */
	@Override
	public void delete(HighlevelInformation persistentInstance) {
		log.debug("deleting HighlevelInformation instance");
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
	 * com.mkyong.customer.dao.HighlevelInformationInt#merge(com.mkyong.customer
	 * .dao.HighlevelInformation)
	 */
	@Override
	public HighlevelInformation merge(HighlevelInformation detachedInstance) {
		log.debug("merging HighlevelInformation instance");
		try {
			HighlevelInformation result = (HighlevelInformation) sessionFactory
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
	 * com.mkyong.customer.dao.HighlevelInformationInt#findById(java.lang.Integer
	 * )
	 */
	@Override
	public HighlevelInformation findById(java.lang.Integer id) {
		log.debug("getting HighlevelInformation instance with id: " + id);
		try {
			HighlevelInformation instance = (HighlevelInformation) sessionFactory
					.getCurrentSession().get("HighlevelInformation", id);
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
	 * com.mkyong.customer.dao.HighlevelInformationInt#findByExample(com.mkyong
	 * .customer.dao.HighlevelInformation)
	 */
	@Override
	public List<HighlevelInformation> findByExample(
			HighlevelInformation instance) {
		log.debug("finding HighlevelInformation instance by example");
		try {
			List<HighlevelInformation> results = (List<HighlevelInformation>) sessionFactory
					.getCurrentSession().createCriteria("HighlevelInformation")
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
