package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.entity.Branch;
import com.insurance.repository.BranchRepository;
import com.insurance.service.BranchService;

@Service
public class BranchServiceImpl implements BranchService{

	@Autowired
	private BranchRepository branchRepository;
	
	@Override
	public Branch SaveBranch(Branch branch) {
		Branch branch1 = branchRepository.save(branch);
		return branch1;
	}

}
