package database.hibernate.test.controller;

import java.util.List;
import database.hibernate.test.helpers.Helpers;
import database.hibernate.test.model.User;

public class Test {

	public static void main(String[] args) {

		Helpers helpers = new Helpers();

		// User user1 = new User("firstName_test1", "city_test1", "phone_test1",
		// "email_test1");
		// User user2 = new User("firstName_test2", "city_test2", "phone_test2",
		// "email_test2");
		// User user3 = new User("firstName_test3", "city_test3", "phone_test3",
		// "email_test3");
		// User user4 = new User("firstName_test4", "city_test4", "phone_test4",
		// "email_test4");
		// User user5 = new User("firstName_test5", "city_test5", "phone_test5",
		// "email_test5");

		// helpers.addUser(user1);
		// helpers.addUser(user2);
		// helpers.addUser(user3);
		// helpers.addUser(user4);
		// helpers.addUser(user5);

		// List<User> users = helpers.getAllUsers();
		// for (User u : users) {
		// System.out.println(u.toString());
		// }

		// helpers.updateFirstName(51, "updateName");
		// helpers.updateCity(51, "updateCity");
		// helpers.updatePhone(51, "updatePhone");
		// helpers.updateEmail(51, "updateEmail");

		// List<User> users1 = helpers.getAllUsers();
		// for (User u : users1) {
		// System.out.println(u.toString());
		// }

		// helpers.removeUser(51);

		List<User> users2 = helpers.getAllUsers();
		for (User u : users2) {
			System.out.println(u.toString());
		}

	}
}
