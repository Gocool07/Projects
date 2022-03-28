package com.anudipfoundation.onetomany;

import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Connect {
	private Session session;
	
public static Session getSession()
{
	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
	SessionFactory factory = meta.getSessionFactoryBuilder().build();
	Session session = factory.openSession();
	return session;
}
public Connect() {
	session=Connect.getSession();
	Transaction t=session.beginTransaction();
}
void print()throws HibernateException
{
	Batch b=new Batch();
     b.setBatchid(8896);
     b.setBatchname("Java Core&Adv");
    Batch b1=new Batch();
    b1.setBatchid(0317);
    b1.setBatchname("Java Core&Adv");
	
	ArrayList<Batch> a=new ArrayList<>();
	a.add(b1);
	a.add(b);
	
	Staff s=new Staff();
	s.setStaff_name("Mercy");
	s.setStaff_designation("Java Trainer");
	s.setSalary(25000);
	s.setBatches(a);
	
	session.save(s);
	session.getTransaction().commit();
	session.close();
	
}


}

	


