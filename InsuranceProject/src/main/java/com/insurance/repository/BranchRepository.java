package com.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.entity.Branch;
@Repository
public interface BranchRepository extends JpaRepository<Branch, Integer> {

}
