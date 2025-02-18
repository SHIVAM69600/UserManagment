package com.shivam.ServiceInterfase;

import org.springframework.web.bind.annotation.RequestBody;

import com.shivam.Entity.Role;

public interface Roleinterfase {
	public  Role cretrole(@RequestBody  Role role);
	public Role updateRole(Long id, Role role);
	public void dlt1(Long id);
}
