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

import com.mkyong.customer.dao.ModalitiesHomeInt;
import com.mkyong.customer.model.Modalities;

/**
 * Home object for domain model class Modalities.
 * 
 * @see .Modalities
 * @author Hibernate Tools
 */
public class ModalitiesHome implements ModalitiesHomeInt {

	private static final Log log = LogFactory.getLog(ModalitiesHome.class);

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
	 * com.mkyong.customer.dao.ModalitiesHomeInt#persist(com.mkyong.customer
	 * .dao.Modalities)
	 */
	@Override
	public void persist(Modalities transientInstance) {
		log.debug("persisting Modalities instance");
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
	 * com.mkyong.customer.dao.ModalitiesHomeInt#attachDirty(com.mkyong.customer
	 * .dao.Modalities)
	 */
	@Override
	public void attachDirty(Modalities instance) {
		log.debug("attaching dirty Modalities instance");
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
	 * com.mkyong.customer.dao.ModalitiesHomeInt#attachClean(com.mkyong.customer
	 * .dao.Modalities)
	 */
	@Override
	public void attachClean(Modalities instance) {
		log.debug("attaching clean Modalities instance");
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
	 * com.mkyong.customer.dao.ModalitiesHomeInt#delete(com.mkyong.customer.
	 * dao.Modalities)
	 */
	@Override
	public void delete(Modalities persistentInstance) {
		log.debug("deleting Modalities instance");
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
	 * com.mkyong.customer.dao.ModalitiesHomeInt#merge(com.mkyong.customer.dao
	 * .Modalities)
	 */
	@Override
	public Modalities merge(Modalities detachedInstance) {
		log.debug("merging Modalities instance");
		try {
			Modalities result = (Modalities) sessionFactory.getCurrentSession()
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
	 * com.mkyong.customer.dao.ModalitiesHomeInt#findById(java.lang.Integer)
	 */
	@Override
	public Modalities findById(java.lang.Integer id) {
		log.debug("getting Modalities instance with id: " + id);
		try {
			Modalities instance = (Modalities) sessionFactory
					.getCurrentSession().get("Modalities", id);
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
	 * com.mkyong.customer.dao.ModalitiesHomeInt#findByExample(com.mkyong.customer
	 * .dao.Modalities)
	 */
	@Override
	public List<Modalities> findByExample(Modalities instance) {
		log.debug("finding Modalities instance by example");
		try {
			List<Modalities> results = (List<Modalities>) sessionFactory
					.getCurrentSession().createCriteria("Modalities")
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
