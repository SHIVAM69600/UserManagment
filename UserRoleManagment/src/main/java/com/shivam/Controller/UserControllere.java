package com.shivam.Controller;

import java.security.PublicKey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shivam.Entity.Role;
import com.shivam.Entity.UserMaster;
import com.shivam.ServiceInterfase.UserInterfase;


@RestController
@RequestMapping("/users")
public class UserControllere {
@Autowired
private UserInterfase usere;

@PostMapping("/Add")
public String adduser(@RequestBody UserMaster user) {
	UserMaster userMaster=	usere.cretaUser(user);
	return "user added";
}

@PutMapping("/{id}")
public UserMaster updateUser(@PathVariable Long id, @RequestBody UserMaster user) {
    UserMaster userMaster= usere.updateMaster(id, user);
	return userMaster;
}
@DeleteMapping("/{id}")
public String delete(@PathVariable Long id) {
	  usere.dlt(id);
	return "delete";
	       
	}

	
}

