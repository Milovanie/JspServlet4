package repos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import interfaces.IUserRepository;
import model.Users;

public class UserRepositoryInMemoryImpl implements IUserRepository {
	
	List<Users> userList ;
	
	public UserRepositoryInMemoryImpl() {
		//  конструктор
		
		this.userList = new ArrayList<>();
		Users user1 = new Users("aa", "111", LocalDate.parse("1994-01-04" ));
		Users user2 = new Users("bb", "222", LocalDate.parse("1991-02-05" ));
		Users user3 = new Users("cc", "333", LocalDate.parse("1995-03-01" ));
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
	}

	@Override
	public List<Users> findAll() {
		return this.userList;
	
	}

	@Override
	public void save(Users user) {
		userList.add(user);
	}

	@Override
	public boolean isExists(String name, String password) {
		 
		return false;
	}
}
