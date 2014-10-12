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

import com.mkyong.customer.dao.ClassificationTagsHomeInt;
import com.mkyong.customer.model.ClassificationTags;

/**
 * Home object for domain model class ClassificationTags.
 * 
 * @see .ClassificationTags
 * @author Hibernate Tools
 */
public class ClassificationTagsHome implements ClassificationTagsHomeInt {

	private static final Log log = LogFactory
			.getLog(ClassificationTagsHome.class);

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
	 * @see com.entities.ClassificationTagsHomeInterface#persist(com.entities.
	 * ClassificationTags)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.entities.ClassificationTagsHomeInt#persist(com.entities.
	 * ClassificationTags)
	 */

	@Override
	public void persist(ClassificationTags transientInstance) {
		log.debug("persisting ClassificationTags instance");
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
	 * com.entities.ClassificationTagsHomeInterface#attachDirty(com.entities
	 * .ClassificationTags)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.entities.ClassificationTagsHomeInt#attachDirty(com.entities.
	 * ClassificationTags)
	 */

	@Override
	public void attachDirty(ClassificationTags instance) {
		log.debug("attaching dirty ClassificationTags instance");
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
	 * com.entities.ClassificationTagsHomeInterface#attachClean(com.entities
	 * .ClassificationTags)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.entities.ClassificationTagsHomeInt#attachClean(com.entities.
	 * ClassificationTags)
	 */

	@Override
	public void attachClean(ClassificationTags instance) {
		log.debug("attaching clean ClassificationTags instance");
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
	 * @see com.entities.ClassificationTagsHomeInterface#delete(com.entities.
	 * ClassificationTags)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.entities.ClassificationTagsHomeInt#delete(com.entities.ClassificationTags
	 * )
	 */

	@Override
	public void delete(ClassificationTags persistentInstance) {
		log.debug("deleting ClassificationTags instance");
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
	 * @see com.entities.ClassificationTagsHomeInterface#merge(com.entities.
	 * ClassificationTags)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.entities.ClassificationTagsHomeInt#merge(com.entities.ClassificationTags
	 * )
	 */

	@Override
	public ClassificationTags merge(ClassificationTags detachedInstance) {
		log.debug("merging ClassificationTags instance");
		try {
			ClassificationTags result = (ClassificationTags) sessionFactory
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
	 * com.entities.ClassificationTagsHomeInterface#findById(java.lang.Integer)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.entities.ClassificationTagsHomeInt#findById(java.lang.Integer)
	 */

	@Override
	public ClassificationTags findById(java.lang.Integer id) {
		log.debug("getting ClassificationTags instance with id: " + id);
		try {
			ClassificationTags instance = (ClassificationTags) sessionFactory
					.getCurrentSession().get("ClassificationTags", id);
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
	 * com.entities.ClassificationTagsHomeInterface#findByExample(com.entities
	 * .ClassificationTags)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.entities.ClassificationTagsHomeInt#findByExample(com.entities.
	 * ClassificationTags)
	 */

	@Override
	public List<ClassificationTags> findByExample(ClassificationTags instance) {
		log.debug("finding ClassificationTags instance by example");
		try {
			List<ClassificationTags> results = (List<ClassificationTags>) sessionFactory
					.getCurrentSession().createCriteria("ClassificationTags")
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
