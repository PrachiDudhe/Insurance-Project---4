package com.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.entity.Nominee;
@Repository
public interface NomineeRepository extends JpaRepository<Nominee, Integer>{

}
