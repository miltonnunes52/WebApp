package com.mkyong.customer.dao.impl;

// default package
// Generated 10/Out/2014 16:22:13 by Hibernate Tools 3.6.0

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mkyong.customer.dao.UserProfileHomeInt;
import com.mkyong.customer.model.UserProfile;

/**
 * Home object for domain model class UserProfile.
 * 
 * @see .UserProfile
 * @author Hibernate Tools
 */
public class UserProfileHome extends HibernateDaoSupport implements
		UserProfileHomeInt {

	private static final Log log = LogFactory.getLog(UserProfileHome.class);

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
	 * com.mkyong.customer.dao.UserProfileHomeInt#attachDirty(com.mkyong.customer
	 * .dao.UserProfile)
	 */
	@Override
	public void attachDirty(UserProfile instance) {
		log.debug("attaching dirty UserProfile instance");
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
	 * com.mkyong.customer.dao.UserProfileHomeInt#attachClean(com.mkyong.customer
	 * .dao.UserProfile)
	 */
	@Override
	public void attachClean(UserProfile instance) {
		log.debug("attaching clean UserProfile instance");
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
	 * com.mkyong.customer.dao.UserProfileHomeInt#delete(com.mkyong.customer
	 * .dao.UserProfile)
	 */
	@Override
	public void delete(UserProfile persistentInstance) {
		log.debug("deleting UserProfile instance");
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
	 * com.mkyong.customer.dao.UserProfileHomeInt#merge(com.mkyong.customer.
	 * dao.UserProfile)
	 */
	@Override
	public UserProfile merge(UserProfile detachedInstance) {
		log.debug("merging UserProfile instance");
		try {
			UserProfile result = (UserProfile) getHibernateTemplate().merge(
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
	 * com.mkyong.customer.dao.UserProfileHomeInt#findById(java.lang.Integer)
	 */
	@Override
	public UserProfile findById(java.lang.Integer id) {
		log.debug("finding credentials");
		try {

			List<UserProfile> results = (List<UserProfile>) getHibernateTemplate()
					.find("From UserProfile where id=?", id);
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
	 * com.mkyong.customer.dao.UserProfileHomeInt#findByExample(com.mkyong.customer
	 * .dao.UserProfile)
	 */
	@Override
	public List<UserProfile> findByExample(UserProfile instance) {
		log.debug("finding UserProfile instance by example");
		try {
			List<UserProfile> results = (List<UserProfile>) getHibernateTemplate()
					.find("From UserProfile");
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	@Override
	public List<UserProfile> getAll() {
		log.debug("finding all Metrics");
		try {
			List<UserProfile> results = (List<UserProfile>) getHibernateTemplate()
					.find("From UserProfile");
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	@Override
	public UserProfile getCredentials(String username, String password) {
		log.debug("finding credentials");
		try {
			Object[] params = { username, password };
			List<UserProfile> results = (List<UserProfile>) getHibernateTemplate()
					.find("From UserProfile where username=? and password=?",
							params);
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

	@Override
	public int count() {
		log.debug("count");
		try {

			List<UserProfile> results = (List<UserProfile>) getHibernateTemplate()
					.find("From UserProfile");
			log.debug("find by example successful, result size: " + results);

			return results.size();
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
