package com.insurance.service;

import java.util.List;

import com.insurance.entity.Nominee;

public interface NomineeService {

	public Nominee saveNominee(Nominee nominee);
	
	public Nominee updateNominee(Nominee nominee);
	
	public List<Nominee> getNominee(Integer id);
	
	public void deleteNominee(Integer id);
	
}
