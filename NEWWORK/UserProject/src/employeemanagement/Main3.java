package employeemanagement;

import java.util.TreeSet;

import com.moglix.employeemanagementsystem.dto.Role;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeSet<Role> roles = new  TreeSet<>();
		
		Role role = new Role("123","ADMIN");
		Role role2 = new Role("345","User");
		
		roles.add(role);
		roles.add(role2);
		
		boolean result = roles.contains(role);
		System.out.println(result);

	}

}
