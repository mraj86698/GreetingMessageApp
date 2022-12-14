package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.UserDto;
import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepo;
import com.example.demo.Service.IUserService;

@RequestMapping("/greetingUser")
@RestController
public class GreetingController {

	@Autowired
	private static final String template = "Hello, %s";
	private final AtomicLong counter = new AtomicLong();
	private IUserService userService;
	@Autowired
	private UserRepo userRepo;


	public void UserController(IUserService userService) {
        this.userService = userService;
    }

	/**
	 *  /**
     * Ability for the Greeting App to give Greeting message with just First Name or Last Name based on User attributes provides Just Hello World.
	 * @param firstName
	 * @param lastName
	 * @returnr
	 */

	@GetMapping("/greeting")
    public String greeting(@RequestParam(name = "firstName", defaultValue = "Hello") String firstName,
                           @RequestParam(name = "lastName", defaultValue = "World") String lastName){

		User user = new User();
        user.setFirstname(firstName);
        user.setLastname(lastName);
        return userService.getGreetingMessage(user);
    }
	/**
	 * Ability for the Greeting App to save the Greeting Message in the Repository
	 * @param userdto
	 * @return
	 */
	@PostMapping("/add")
	public User addUser(@RequestBody UserDto userdto) {
		User user = userService.addUser(userdto);
		return user;
	}
	/**
	 * Ability for the Greeting App to find a Greeting Message by Id in the Repository
	 * @param id
	 * @return
	 */

	@GetMapping("/getUserById/{id}")
	public Optional<User> getUserById(@PathVariable int id) {
		return userRepo.findById(id);
	}
	/**
	 * Ability for the Greeting App to List all the Greeting Messages in the Repository
	 * @return
	 */
	@GetMapping("/getall")
	public List<User> getUser() {
		return userRepo.findAll();
	}
	/**
	 * Ability for the Greeting App to Edit a Greeting Messages in the Repository
	 */
	@PutMapping("/update")
	public User updateUser(@RequestBody UserDto userdto, @RequestParam int id) {
		User user = userService.updateUser(userdto, id);
		return user;
	}
	/**
	 * Ability for the Greeting App to Delete a Greeting Messages in the Repository
	 */
	@DeleteMapping("/deleteById/{id}")
	public void deleteById(@PathVariable int id) {
		userRepo.deleteById(id);
	}

}
