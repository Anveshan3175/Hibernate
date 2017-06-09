package com.reverse.generated;
// Generated Jun 10, 2017 3:39:38 AM by Hibernate Tools 4.3.1.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class EmpDetailsView.
 * @see com.reverse.generated.EmpDetailsView
 * @author Hibernate Tools
 */
public class EmpDetailsViewHome {

	private static final Log log = LogFactory.getLog(EmpDetailsViewHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(EmpDetailsView transientInstance) {
		log.debug("persisting EmpDetailsView instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(EmpDetailsView instance) {
		log.debug("attaching dirty EmpDetailsView instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EmpDetailsView instance) {
		log.debug("attaching clean EmpDetailsView instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(EmpDetailsView persistentInstance) {
		log.debug("deleting EmpDetailsView instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EmpDetailsView merge(EmpDetailsView detachedInstance) {
		log.debug("merging EmpDetailsView instance");
		try {
			EmpDetailsView result = (EmpDetailsView) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public EmpDetailsView findById(com.reverse.generated.EmpDetailsViewId id) {
		log.debug("getting EmpDetailsView instance with id: " + id);
		try {
			EmpDetailsView instance = (EmpDetailsView) sessionFactory.getCurrentSession()
					.get("com.reverse.generated.EmpDetailsView", id);
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

	public List findByExample(EmpDetailsView instance) {
		log.debug("finding EmpDetailsView instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("com.reverse.generated.EmpDetailsView")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
