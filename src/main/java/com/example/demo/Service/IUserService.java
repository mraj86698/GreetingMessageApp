package com.example.demo.Service;

import com.example.demo.Dto.UserDto;
import com.example.demo.Model.User;

public interface IUserService {

	String getGreetingMessage(User user);
	public User addUser(UserDto userdto);
	public User getUserByid(int id);
	public User updateUser(UserDto userdto, int id);

}
