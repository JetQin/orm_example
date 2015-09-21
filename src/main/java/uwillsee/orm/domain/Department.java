/** 
 * Project Name:cf 
 * File Name:EconomicEntity.java 
 * Package Name:com.g360.repository.entity.mosaic
 * Date:2015年4月2日下午3:52:37 
 * Copyright (c) 2015, jianlei.qin@sktlab.com All Rights Reserved. 
 * 
 */
package uwillsee.orm.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.Data;



/** 
 * ClassName: EconomicEntity  
 * 
 * @author jet 
 * @version Configuration Framework 1.0
 * @since JDK 1.7 
 */
@Entity
@Table(name="DEPARTMENT")
@Cache(region="entity", usage = CacheConcurrencyStrategy.READ_WRITE)
public @Data class Department implements Serializable
{


	   
		@Id
		@Column(name="ID",precision=10,scale=0)
		private BigDecimal id;

		@Column(name="NAME")
		private String name;
	   
}
