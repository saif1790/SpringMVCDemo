package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.UserDAO;
import springmvc.entity.User;

@Service
public class UserService
{

	@Autowired
	private UserDAO dao;
		
	public int createUser(User user)
	{
		int saveUser = dao.saveUser(user);
		return saveUser;
	}
}
