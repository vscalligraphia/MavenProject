package employeemanagement;

import java.util.TreeSet;

import com.moglix.employeemanagementsystem.dto.User;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	TreeSet<User> users = new  TreeSet<>();
		
		User user = new User("123", "HELL", 123, "abc@gmail.com", "123");
		User user2 = new User("098", "Nooo", 456, "xyz@gmail.com", "987");
		
		users.add(user);
		users.add(user2);
		
		boolean result = users.contains(user2);
		System.out.println(result);


	}

}
