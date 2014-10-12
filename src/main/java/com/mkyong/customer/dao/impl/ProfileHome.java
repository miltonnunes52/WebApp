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

import com.mkyong.customer.dao.ProfileHomeInt;
import com.mkyong.customer.model.Profile;

/**
 * Home object for domain model class Profile.
 * 
 * @see .Profile
 * @author Hibernate Tools
 */
public class ProfileHome implements ProfileHomeInt {

	private static final Log log = LogFactory.getLog(ProfileHome.class);

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
	 * com.mkyong.customer.dao.ProfileHomeInt#persist(com.mkyong.customer.dao
	 * .Profile)
	 */
	@Override
	public void persist(Profile transientInstance) {
		log.debug("persisting Profile instance");
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
	 * com.mkyong.customer.dao.ProfileHomeInt#attachDirty(com.mkyong.customer
	 * .dao.Profile)
	 */
	@Override
	public void attachDirty(Profile instance) {
		log.debug("attaching dirty Profile instance");
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
	 * com.mkyong.customer.dao.ProfileHomeInt#attachClean(com.mkyong.customer
	 * .dao.Profile)
	 */
	@Override
	public void attachClean(Profile instance) {
		log.debug("attaching clean Profile instance");
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
	 * com.mkyong.customer.dao.ProfileHomeInt#delete(com.mkyong.customer.dao
	 * .Profile)
	 */
	@Override
	public void delete(Profile persistentInstance) {
		log.debug("deleting Profile instance");
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
	 * com.mkyong.customer.dao.ProfileHomeInt#merge(com.mkyong.customer.dao.
	 * Profile)
	 */
	@Override
	public Profile merge(Profile detachedInstance) {
		log.debug("merging Profile instance");
		try {
			Profile result = (Profile) sessionFactory.getCurrentSession()
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
	 * @see com.mkyong.customer.dao.ProfileHomeInt#findById(java.lang.Integer)
	 */
	@Override
	public Profile findById(java.lang.Integer id) {
		log.debug("getting Profile instance with id: " + id);
		try {
			Profile instance = (Profile) sessionFactory.getCurrentSession()
					.get("Profile", id);
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
	 * com.mkyong.customer.dao.ProfileHomeInt#findByExample(com.mkyong.customer
	 * .dao.Profile)
	 */
	@Override
	public List<Profile> findByExample(Profile instance) {
		log.debug("finding Profile instance by example");
		try {
			List<Profile> results = (List<Profile>) sessionFactory
					.getCurrentSession().createCriteria("Profile")
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
