package com.mkyong.customer.bo;

import java.util.List;

import com.mkyong.customer.model.ClassificationTags;

public interface ClassificationTagsBoInt {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.entities.ClassificationTagsHomeInterface#persist(com.entities.
	 * ClassificationTags)
	 */
	void persist(ClassificationTags transientInstance);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.entities.ClassificationTagsHomeInterface#attachDirty(com.entities
	 * .ClassificationTags)
	 */
	void attachDirty(ClassificationTags instance);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.entities.ClassificationTagsHomeInterface#attachClean(com.entities
	 * .ClassificationTags)
	 */
	void attachClean(ClassificationTags instance);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.entities.ClassificationTagsHomeInterface#delete(com.entities.
	 * ClassificationTags)
	 */
	void delete(ClassificationTags persistentInstance);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.entities.ClassificationTagsHomeInterface#merge(com.entities.
	 * ClassificationTags)
	 */
	ClassificationTags merge(ClassificationTags detachedInstance);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.entities.ClassificationTagsHomeInterface#findById(java.lang.Integer)
	 */
	ClassificationTags findById(java.lang.Integer id);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.entities.ClassificationTagsHomeInterface#findByExample(com.entities
	 * .ClassificationTags)
	 */
	List<ClassificationTags> findByExample(ClassificationTags instance);

}