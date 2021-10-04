package employeemanagement;

import com.moglix.employeemanagementsystem.dto.Role;
import com.moglix.employeemanagementsystem.dto.User;
import com.moglix.employeemanagementsystem.service.RoleService;
import com.moglix.employeemanagementsystem.service.RoleServiceImpl;
import com.moglix.employeemanagementsystem.service.UserService;
import com.moglix.employeemanagementsystem.service.UserServiceImpl;

public class Main {

	public static void main(String[] args) {

		Role R = new Role();
		
		RoleServiceImpl roleService = RoleService.getInstance();
		
		String result = roleService.addRole(R);
		System.out.println(result);
		
		//employee.setEmpID(123);
		R.setRole_Id("ROLE ID is : "+"123");
		R.setRole_Name("ROLE NAME is : "+"ADMIN");
		
		
		//System.out.println(employee.getEmpID());
		System.out.println("\n***** This is Role Table *****\n"+R.getRole_Id());
		System.out.println(R.getRole_Name());
		
		
		User U = new User();
		
		UserServiceImpl userServiceImpl= UserService.getInstance();
		
		
		
		String result2 = userServiceImpl.addUser(U);
		System.out.println(result2);
		
		
		
		U.setUser_Id("USER Id : "+"123");
		U.setUser_Name("USER NAME : "+"VISHU");
		U.setEmail("USER EMAIL ID : " + "vishal.saini@moglix.com");
		U.setPassword(1234);
		U.setRole_Id("USER ROLE ID : "+"123");
	
		System.out.println("\n *****  This is User Table *****\n"+U.getUser_Id());
		System.out.println(U.getUser_Name());
		System.out.println(U.getPassword());
		System.out.println(U.getRole_Id());
		System.out.println(U.getEmail());
		
		  
		  
		  
		  String result3= roleService.deleteRoleById("123");
		  System.out.println(result3);
		  
		  
		  
		  
		  
		  String result4= userServiceImpl.deleteUserById("123");
		  System.out.println(result4);
		  
		  
		  
	
		

	}

}
