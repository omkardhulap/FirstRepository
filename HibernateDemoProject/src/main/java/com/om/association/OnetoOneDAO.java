package com.om.association;
import java.io.File;
/**
 * @author omkar
 */
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class OnetoOneDAO {

	public static void main(String[] args) {

		Vehicle v1 =new Vehicle();
		v1.setVname("Hero");

		Vehicle v2 =new Vehicle();
		v2.setVname("Maruti");

		List<Vehicle> vlist = new ArrayList<Vehicle>();
		vlist.add(v1);
		vlist.add(v2);

		Person p1 = new Person();
		p1.setPname("Prakash");
		p1.setVehicles(vlist);
		
		File file = new File("E:\\Next\\Source\\GitForWindowsRepositories\\HibernateDemoProject\\src\\resources\\hibernate.cfg.xml");
		Configuration configuration = new Configuration().configure(file);
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		SessionFactory sessionFactory = configuration.configure().buildSessionFactory(serviceRegistry);

        Session session = sessionFactory.openSession();

        session.beginTransaction();

		Transaction t=session.beginTransaction();

		session.save(p1);
		t.commit();
		//		session.close();
		//
		//		session = sf.openSession();
		t=session.beginTransaction();

		Person p = (Person)session.get(Person.class,p1.getPid());
		System.out.println("Pers. of Vehoicleon's name:"+p.getPname());


		t.commit();
		session.close();
		sessionFactory.close();
		System.out.println("No of vehicles:"+p.getVehicles().size());


	}
}
