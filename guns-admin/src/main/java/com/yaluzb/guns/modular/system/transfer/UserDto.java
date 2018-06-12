package com.yaluzb.guns.modular.system.transfer;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 用户传输bean
 * 
 * @author yaluzb
 * @Date 2017/5/5 22:40
 */
@Data
public class UserDto{

	private Integer id;
	private String account;
	private String password;
	private String salt;
	private String name;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthday;
	private Integer sex;
	private String email;
	private String phone;
	private String roleid;
	private Integer deptid;
	private Integer status;
	private Date createtime;
	private Integer version;
	private String avatar;

}
