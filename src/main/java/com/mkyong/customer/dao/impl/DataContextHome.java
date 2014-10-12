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

import com.mkyong.customer.dao.DataContextHomeInt;
import com.mkyong.customer.model.DataContext;

/**
 * Home object for domain model class DataContext.
 * 
 * @see .DataContext
 * @author Hibernate Tools
 */
public class DataContextHome implements DataContextHomeInt {

	private static final Log log = LogFactory.getLog(DataContextHome.class);

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
	 * @see com.entities.DataContextHomeInt#persist(com.entities.DataContext)
	 */
	@Override
	public void persist(DataContext transientInstance) {
		log.debug("persisting DataContext instance");
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
	 * com.entities.DataContextHomeInt#attachDirty(com.entities.DataContext)
	 */
	@Override
	public void attachDirty(DataContext instance) {
		log.debug("attaching dirty DataContext instance");
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
	 * com.entities.DataContextHomeInt#attachClean(com.entities.DataContext)
	 */
	@Override
	public void attachClean(DataContext instance) {
		log.debug("attaching clean DataContext instance");
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
	 * @see com.entities.DataContextHomeInt#delete(com.entities.DataContext)
	 */
	@Override
	public void delete(DataContext persistentInstance) {
		log.debug("deleting DataContext instance");
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
	 * @see com.entities.DataContextHomeInt#merge(com.entities.DataContext)
	 */
	@Override
	public DataContext merge(DataContext detachedInstance) {
		log.debug("merging DataContext instance");
		try {
			DataContext result = (DataContext) sessionFactory
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
	 * @see com.entities.DataContextHomeInt#findById(java.lang.Integer)
	 */
	@Override
	public DataContext findById(java.lang.Integer id) {
		log.debug("getting DataContext instance with id: " + id);
		try {
			DataContext instance = (DataContext) sessionFactory
					.getCurrentSession().get("DataContext", id);
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
	 * com.entities.DataContextHomeInt#findByExample(com.entities.DataContext)
	 */
	@Override
	public List<DataContext> findByExample(DataContext instance) {
		log.debug("finding DataContext instance by example");
		try {
			List<DataContext> results = (List<DataContext>) sessionFactory
					.getCurrentSession().createCriteria("DataContext")
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
