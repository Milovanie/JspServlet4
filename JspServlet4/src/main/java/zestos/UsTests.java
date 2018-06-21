package zestos;

import java.util.List;

import interfaces.IUserRepository;
import model.Users;
import repos.UserRepositoryInMemoryImpl;

public class UsTests {

	public static void main(String[] args) {
		IUserRepository repo = new UserRepositoryInMemoryImpl();
		List<Users> findAll = repo.findAll();
		
		for (Users users : findAll) {
			System.out.println(users);
		}
	}

}
