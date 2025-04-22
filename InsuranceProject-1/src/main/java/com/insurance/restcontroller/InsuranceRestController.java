package com.insurance.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.entity.Branch;
import com.insurance.entity.Nominee;
import com.insurance.entity.User;
import com.insurance.service.BranchService;
import com.insurance.service.NomineeService;
import com.insurance.service.UserService;

@RestController
public class InsuranceRestController {
	@Autowired
	private UserService userService;
	@Autowired
	private NomineeService nomineeService;

	// To Save User with Multiple Nominee
	@PostMapping("/addUserNomineeDetails")
	public User addUserNomineeDetails(@RequestBody User user) {

		User user1 = userService.saveUser(user);
		List<Nominee> nominee1 = user.getNominees();
		for (Nominee n : nominee1) {
			n.setUserId(user.getId());
			nomineeService.saveNominee(n);
		}
		return user1;
	}

	// To Update User with Multiple Nominee
	@PutMapping("/updateUserNomineeDetails")
	public User updateUserNomineeDetails(@RequestBody User user) {

		User user1 = userService.updateUser(user);
		List<Nominee> nominee1 = user.getNominees();
		for (Nominee n : nominee1) {
			n.setUserId(user.getId());
			nomineeService.updateNominee(n);
		}
		return user1;
	}

	@Autowired
	private BranchService branchService;

	@PostMapping("/addBranchDetails")
	public Branch addBranchDetails(@RequestBody Branch branch) {
		Branch branch1 = branchService.saveBranch(branch);
		return branch1;
	}
	
	//To Get User With Multipal Nominee
	
	@GetMapping("/getUserNomineeDetails/{id}")
	public User getUserNomineeDetails(@PathVariable("id") Integer id) {
		User user1 =  userService.getUser(id);
		List<Nominee> nominee1 = nomineeService.getNominee(id);
		user1.setNominees(nominee1);
		return user1;
	
        }
	
	//To Delete User With Multipal Nominee
	@DeleteMapping("/deleteUserNomineeDetails/{id}")
   public void deleteUserNomineeDetails(@PathVariable("id") Integer id) {
	   userService.deleteUser(id);
	   nomineeService.deleteNominee(id);
     }
	                             
 }
	







