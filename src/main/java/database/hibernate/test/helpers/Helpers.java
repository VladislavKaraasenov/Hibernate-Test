package database.hibernate.test.helpers;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import database.hibernate.test.model.User;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Helpers {

	public SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
		return sessionFactory;
	}

	public Integer addUser(User user) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		System.out.println("Completed successfully! " + user.toString());
		return user.getUserID();
	}

	public void updateFirstName(int userID, String firstName) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		User user = findById(userID);
		user.setFirstName(firstName);
		session.update(user);
		session.getTransaction().commit();
		session.close();
		System.out.println("Completed successfully! " + user.toString());
	}

	public void updateCity(int userID, String city) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		User user = findById(userID);
		user.setCity(city);
		session.update(user);
		session.getTransaction().commit();
		session.close();
		System.out.println("Completed successfully! " + user.toString());
	}

	public void updatePhone(int userID, String phone) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		User user = findById(userID);
		user.setPhone(phone);
		session.update(user);
		session.getTransaction().commit();
		session.close();
		System.out.println("Completed successfully! " + user.toString());
	}

	public void updateEmail(int userID, String email) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		User user = findById(userID);
		user.setEmail(email);
		session.update(user);
		session.getTransaction().commit();
		session.close();
		System.out.println("Completed successfully! " + user.toString());
	}

	public void removeUser(int userID) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		User user = findById(userID);
		session.delete(user);
		session.getTransaction().commit();
		session.close();
		System.out.println("Completed successully! " + user.toString());
	}

	private User findById(int userID) {
		Session session = getSessionFactory().openSession();
		User user = (User) session.get(User.class, userID);
		session.close();
		return user;
	}

	public List<User> getAllUsers() {
		Session session = getSessionFactory().openSession();
		@SuppressWarnings("unchecked")
		List<User> usersList = session.createCriteria(User.class).list();
		session.close();
		System.out.println("Completed successfully!");
		return usersList;
	}

}
