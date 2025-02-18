package com.shivam.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shivam.Entity.Role;
import com.shivam.ServiceInterfase.Roleinterfase;
import com.shivam.ServiceInterfase.UserInterfase;

@RestController
@RequestMapping("/roles")
public class RollController {
	@Autowired
	private Roleinterfase usere;
	@PostMapping("/Add1")
	public String addRole(@RequestBody  Role role) {
		 Role rr=usere.cretrole(role);
		return "Added";
		}
	@PutMapping("/role/{id}")
	public String updateRole(@PathVariable Long id,@RequestBody Role role) {
		
	Role role2=	usere.updateRole(id,role);
		return "Update";
		}
	@DeleteMapping("/role/{id}")
	public String delete1(@PathVariable Long id) {
		usere.dlt1(id);
		return "Delete";
		
	}
}
