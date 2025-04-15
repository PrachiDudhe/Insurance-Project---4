package com.insurance.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.entity.Branch;
import com.insurance.entity.User;
import com.insurance.service.BranchService;
import com.insurance.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name="Insurance", description = "Insurance API Formation")
@RestController
public class InsuranceRestController {
	
	//User Area ..................................
	
	@Autowired
	private UserService userService;
	
	@PutMapping("/updateUserDetails")
	@Operation(summary = "Update User Details",description = "Design API to Update User details into system.")
	@ApiResponses(value= {@ApiResponse(responseCode = "200", description = "ok")})
	public User updateUser(User user) {
		User user1 = userService.updateUserDetails(user);
		return user1;	
	}
	
	
	//Nominee Area................................
	
	
	
	
	//Policy Area.................................
	
	
	
	
	
	
	//Branch Area.................................
	
	@Autowired
	private BranchService branchService;
	
	@PostMapping("/AddBranchDetails")
	@Operation(summary = "Add Branch Details",description = "Design API to add branch details into system.")
	@ApiResponses(value= {@ApiResponse(responseCode = "200", description = "ok")})
	public Branch AddBranchDetails(@RequestBody Branch branch) {
		Branch branch1 = branchService.SaveBranch(branch);
		return branch1;
		
	}

	
}
