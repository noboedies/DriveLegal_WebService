package com.tausif.drivelegal.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tausif.drivelegal.entity.Violation;

@Repository
public interface ViolationRepo extends JpaRepository<Violation, Long> {

	List<Violation> findAllByUserEmail (String email);
}
