/** 
 * Project Name:usee 
 * File Name:EconomicEntityDao.java 
 * Package Name:org.usee.demo.dao
 * Date:Sep 20, 201511:26:19 AM 
 * Copyright (c) 2015, jianlei.qin@sktlab.com All Rights Reserved. 
 * 
 */
package uwillsee.orm.dao;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.github.jetqin.orm.repository.AbstractDataService;

import uwillsee.orm.domain.Department;

/** 
 * ClassName: EconomicEntityDao  
 * 
 * @author jet 
 * @version Configuration Framework 1.0
 * @since JDK 1.7 
 */
@Repository
public class DepartmentDao extends AbstractDataService<Department, BigDecimal>
{
	/**
	 * 
	 */
	public DepartmentDao()
	{
		// TODO Auto-generated constructor stub
		setClazz(Department.class);
	}
}
