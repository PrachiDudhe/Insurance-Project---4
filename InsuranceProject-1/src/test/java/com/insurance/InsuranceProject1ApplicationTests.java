package com.insurance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.insurance.entity.Branch;
import com.insurance.entity.Nominee;
import com.insurance.entity.User;
import com.insurance.repository.BranchRepository;
import com.insurance.repository.NomineeRepository;
import com.insurance.repository.UserRepository;
import com.insurance.service.UserService;
import com.insurance.service.impl.BranchServiceImpl;
import com.insurance.service.impl.NomineeServiceImpl;
import com.insurance.service.impl.UserServiceImpl;

@SpringBootTest
class InsuranceProject1ApplicationTests {

	@InjectMocks
	private UserServiceImpl userService;

	@Mock
	private UserRepository userRepository;

	@InjectMocks
	private NomineeServiceImpl nomineeService;

	@Mock
	private NomineeRepository nomineeRepository;

	@Test
	public void saveUserNominee() {

		// Create Object Of Nominee
		Nominee nominee = new Nominee(1, "Vinay", "Brother", null);
		Nominee nominee1 = new Nominee(2, "vikram", "brother", null);
		List<Nominee> nominees = new LinkedList<>();
		nominees.add(nominee);
		nominees.add(nominee1);

		// Create Object Of User
		User user = new User(1, "Prachi Dudhe", "prachi@gmail.com", nominees);

		// To write when&then statement
		when(userRepository.save(user)).thenReturn(user);

		// Save the Nominee
		for (Nominee n : nominees) {
			n.setUserId(user.getId());
			nomineeService.saveNominee(n);
			// To write when&then statement
			when(nomineeRepository.save(n)).thenReturn(n);
			// Call the Service and assert
			assertEquals(n, nomineeService.saveNominee(n));
		}
		// Call the service and assert
		assertEquals(user, userService.saveUser(user));
	}

	@Test
	public void updateUserNominee() {

		// Create Object Of Nominee
		Nominee nominee = new Nominee(1, "Vijay", "Brother", null);
		Nominee nominee1 = new Nominee(2, "vikram", "brother", null);
		List<Nominee> nominees = new LinkedList<>();
		nominees.add(nominee);
		nominees.add(nominee1);

		// Create Object Of User
		User user = new User(1, "Sweta", "sweta@gmail.com", nominees);

		// To write when&then statement
		when(userRepository.save(user)).thenReturn(user);

		// Save the Nominee
		for (Nominee n : nominees) {
			n.setUserId(user.getId());
			// To write when&then statement
			when(nomineeRepository.save(n)).thenReturn(n);
			// Call the Service and assert
			assertEquals(n, nomineeService.updateNominee(n));
		}
		// Call the service and assert
		assertEquals(user, userService.updateUser(user));
	}
	public void getUserNomineeById() {
		// Create Object Of Nominee
				Nominee nominee = new Nominee(1, "Vijay", "Brother", null);
				Nominee nominee1 = new Nominee(2, "vikram", "brother", null);
				List<Nominee> nominees = new LinkedList<>();
				nominees.add(nominee);
				nominees.add(nominee1);
				
				// Create Object Of User
				User user = new User(1, "Sweta", "sweta@gmail.com", nominees);
			
				//To Write When and Then Statement
		when(userRepository.findById(1)).thenReturn(new User(2, "Sarika", "sarikamavale@gmail.com",nominees));
		
		//save nominees
		for (Nominee n : nominees) {
			n.setUserId(user.getId());
			when(nomineeRepository.save(n)).thenReturn(n);
			// Call the Service and assert
			assertEquals(n, nomineeService.getNominee(2));
		}
		// Call the service and assert
		assertEquals(user, userService.getUser(2));
	
	}

	@InjectMocks
	private BranchServiceImpl branchService;

	@Mock
	private BranchRepository branchRepository;
	
	@Test
	public void saveBranch() {
		Branch branch = new Branch (1,"SBI Mumbai", 567789, "Mumbai", 405678,"India");
		when(branchRepository.save(branch)).thenReturn(branch);
		assertEquals(branch, branchService.saveBranch(branch));	
		
	}

}