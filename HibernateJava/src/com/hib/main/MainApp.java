package com.hib.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.hib.pojo.Event;


public class MainApp {

	public MainApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sessionFactory;
		System.out.println("In the main method");
		
/*		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure() // configures settings from hibernate.cfg.xml
				.build();*/
/*		 sessionFactory = new Configuration()
	                .configure() // configures settings from hibernate.cfg.xml
	                .buildSessionFactory();*/
		System.out.println("In the main method");
		try {
			//sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
			
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
			StandardServiceRegistry  serviceRegistry = serviceRegistryBuilder.build();
	        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			 
			System.out.println("In the main method");
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			List result = session.createQuery( "from Events" ).list();
			for ( Event job : (List<Event>) result ) {
				System.out.println( "Job (" + job.getTitle() + ") : " + job.getId() );
			}
			session.getTransaction().commit();
			session.close();
		}
		catch (Exception e) {
			// The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
			// so destroy it manually.
			//StandardServiceRegistryBuilder.destroy( registry );
		}
		
		
		/*Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save( new Event( "Our very first event!", new Date() ) );
		session.save( new Event( "A follow up event", new Date() ) );
		session.getTransaction().commit();
		session.close();*/

		// now lets pull events from the database and list them
		
	}

}
