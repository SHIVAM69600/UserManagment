package com.shivam.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivam.Entity.Role;
import com.shivam.Repository.RoleRepository;
import com.shivam.ServiceInterfase.Roleinterfase;

@Service
public class RoleService implements Roleinterfase {
	@Autowired
	private RoleRepository rLRepository;
	public Role cretrole(Role role) {
	 return	 rLRepository.save(role);

	}

	@Override
	public Role updateRole(Long id, Role role) {
	Optional<Role>exit=	rLRepository.findById(id);
	if(exit.isPresent()) {
	  Role exit1=exit.get();
	  exit1.setName(role.getName());
	  exit1.setStatus(role.getStatus());
	  return rLRepository.save(exit1);
	}
		return null;
	}

	@Override
	public void dlt1(Long id) {
		// TODO Auto-generated method stub
		 rLRepository.deleteById(id);
	}

	}


