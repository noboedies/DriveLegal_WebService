package com.tausif.drivelegal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tausif.drivelegal.entity.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, String> {

}
