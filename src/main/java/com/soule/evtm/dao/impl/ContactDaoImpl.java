package com.soule.evtm.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.soule.evtm.dao.ContactDao;
import com.soule.evtm.domain.Contact;

@Repository("contactDao")
@Transactional
public class ContactDaoImpl implements ContactDao {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Resource(name="sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional(readOnly=true) 
	public List<Contact> findAll() {
		return sessionFactory.getCurrentSession().
				createQuery("from Contact c").list(); 
	}


}
