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

import com.mkyong.customer.dao.TransformationHomeInt;
import com.mkyong.customer.model.Transformation;

/**
 * Home object for domain model class Transformation.
 * 
 * @see .Transformation
 * @author Hibernate Tools
 */
public class TransformationHome implements TransformationHomeInt {

	private static final Log log = LogFactory.getLog(TransformationHome.class);

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
	 * com.DAO.TransformationHomeInt#persist(com.mkyong.customer.dao.Transformation
	 * )
	 */
	@Override
	public void persist(Transformation transientInstance) {
		log.debug("persisting Transformation instance");
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
	 * @see com.DAO.TransformationHomeInt#attachDirty(com.mkyong.customer.dao.
	 * Transformation)
	 */
	@Override
	public void attachDirty(Transformation instance) {
		log.debug("attaching dirty Transformation instance");
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
	 * @see com.DAO.TransformationHomeInt#attachClean(com.mkyong.customer.dao.
	 * Transformation)
	 */
	@Override
	public void attachClean(Transformation instance) {
		log.debug("attaching clean Transformation instance");
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
	 * com.DAO.TransformationHomeInt#delete(com.mkyong.customer.dao.Transformation
	 * )
	 */
	@Override
	public void delete(Transformation persistentInstance) {
		log.debug("deleting Transformation instance");
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
	 * com.DAO.TransformationHomeInt#merge(com.mkyong.customer.dao.Transformation
	 * )
	 */
	@Override
	public Transformation merge(Transformation detachedInstance) {
		log.debug("merging Transformation instance");
		try {
			Transformation result = (Transformation) sessionFactory
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
	 * @see com.DAO.TransformationHomeInt#findById(java.lang.Integer)
	 */
	@Override
	public Transformation findById(java.lang.Integer id) {
		log.debug("getting Transformation instance with id: " + id);
		try {
			Transformation instance = (Transformation) sessionFactory
					.getCurrentSession().get("Transformation", id);
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
	 * @see com.DAO.TransformationHomeInt#findByExample(com.mkyong.customer.dao.
	 * Transformation)
	 */
	@Override
	public List<Transformation> findByExample(Transformation instance) {
		log.debug("finding Transformation instance by example");
		try {
			List<Transformation> results = (List<Transformation>) sessionFactory
					.getCurrentSession().createCriteria("Transformation")
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
