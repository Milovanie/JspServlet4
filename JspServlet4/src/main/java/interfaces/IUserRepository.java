package interfaces;

import java.util.List;

import model.Users;

public interface IUserRepository {
	List<Users> findAll();
	void save(Users user);
	boolean isExists(String name, String password);
	
}
