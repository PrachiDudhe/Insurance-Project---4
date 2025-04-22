package com.insurance.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.insurance.entity.Nominee;
@Repository
public interface NomineeRepository extends JpaRepository<Nominee, Serializable> {
	
	@Query(value = "from Nominee")
	public List<Nominee> findAllNominee(Integer id);
	
	
	@Query(value = "from Nominee")
	public List<Nominee> deleteAllNominees(Integer id);
	
	
	
	
}
