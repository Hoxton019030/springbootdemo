package com.jerryboot.springbootdemo.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table
public class WorkMessages {

	public WorkMessages() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "next", columnDefinition = "nvarchar(200)")
	private String text;

	@DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss") // 從資料庫取出後轉格式
	@Temporal(TemporalType.TIMESTAMP) // 存進去的資料型別
	@Column(name = "added", columnDefinition = "datetime")
	private Date added;
}
