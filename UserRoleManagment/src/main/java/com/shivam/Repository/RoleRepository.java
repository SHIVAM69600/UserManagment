package com.shivam.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivam.Entity.Role;

public interface RoleRepository  extends JpaRepository<Role, Long>{

}
