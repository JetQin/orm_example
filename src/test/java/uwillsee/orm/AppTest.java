package uwillsee.orm;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import uwillsee.orm.dao.DepartmentDao;
import uwillsee.orm.domain.Department;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = App.class)
public class AppTest 
{
	@Autowired
	DepartmentDao dao;
	
	@Test
	public void testGetCount()
	{
		Long count = dao.getTotalCount();
		System.out.println("{count="+count+"}");
	}
	
	@Test
	public void testSaveDepartment()
	{
		Department dep = new Department();
		dep.setId(new BigDecimal("2"));
		dep.setName("Department 2");
		dao.save(dep);
	}
}
