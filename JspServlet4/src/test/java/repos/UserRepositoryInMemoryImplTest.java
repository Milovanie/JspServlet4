package repos;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import model.Users;

public class UserRepositoryInMemoryImplTest   {
	private static UserRepositoryInMemoryImpl reimpl = new UserRepositoryInMemoryImpl();
	List<Users> findAll = reimpl.findAll();

	public void testUserRepositoryInMemoryImpl() {
		// fail("Not yet implemented");

		Assert.assertNotNull("List shouldn't be null", findAll);
		assertTrue(reimpl.userList.size() > 0);
		for (Users users : findAll) {
			System.out.println(users);
		}
		

	}

	@Ignore
	public void testFindAll() {
		  Assert.assertEquals("wrong size", 3, findAll.size());
		    Assert.assertEquals("Wrong 1st element", "Customer1", findAll.get(0));
		    Assert.assertEquals("Wrong 2nd element", "Customer2", findAll.get(1));
		    Assert.assertEquals("Wrong 3rd element", "Customer3", findAll.get(2));
	}
	@Test
	public void testSave() {
		// fail("Not yet implemented");
	}
	@Test
	public void testIsExists() {
		// fail("Not yet implemented");
	}

}
