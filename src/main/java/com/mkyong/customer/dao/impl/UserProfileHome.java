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

import com.mkyong.customer.dao.UserProfileHomeInt;
import com.mkyong.customer.model.UserProfile;

/**
 * Home object for domain model class UserProfile.
 * 
 * @see .UserProfile
 * @author Hibernate Tools
 */
public class UserProfileHome implements UserProfileHomeInt {

	private static final Log log = LogFactory.getLog(UserProfileHome.class);

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
	 * com.mkyong.customer.dao.UserProfileHomeInt#persist(com.mkyong.customer
	 * .dao.UserProfile)
	 */
	@Override
	public void persist(UserProfile transientInstance) {
		log.debug("persisting UserProfile instance");
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
	 * com.mkyong.customer.dao.UserProfileHomeInt#attachDirty(com.mkyong.customer
	 * .dao.UserProfile)
	 */
	@Override
	public void attachDirty(UserProfile instance) {
		log.debug("attaching dirty UserProfile instance");
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
	 * com.mkyong.customer.dao.UserProfileHomeInt#attachClean(com.mkyong.customer
	 * .dao.UserProfile)
	 */
	@Override
	public void attachClean(UserProfile instance) {
		log.debug("attaching clean UserProfile instance");
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
	 * com.mkyong.customer.dao.UserProfileHomeInt#delete(com.mkyong.customer
	 * .dao.UserProfile)
	 */
	@Override
	public void delete(UserProfile persistentInstance) {
		log.debug("deleting UserProfile instance");
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
	 * com.mkyong.customer.dao.UserProfileHomeInt#merge(com.mkyong.customer.
	 * dao.UserProfile)
	 */
	@Override
	public UserProfile merge(UserProfile detachedInstance) {
		log.debug("merging UserProfile instance");
		try {
			UserProfile result = (UserProfile) sessionFactory
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
	 * com.mkyong.customer.dao.UserProfileHomeInt#findById(java.lang.Integer)
	 */
	@Override
	public UserProfile findById(java.lang.Integer id) {
		log.debug("getting UserProfile instance with id: " + id);
		try {
			UserProfile instance = (UserProfile) sessionFactory
					.getCurrentSession().get("UserProfile", id);
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
	 * com.mkyong.customer.dao.UserProfileHomeInt#findByExample(com.mkyong.customer
	 * .dao.UserProfile)
	 */
	@Override
	public List<UserProfile> findByExample(UserProfile instance) {
		log.debug("finding UserProfile instance by example");
		try {
			List<UserProfile> results = (List<UserProfile>) sessionFactory
					.getCurrentSession().createCriteria("UserProfile")
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
