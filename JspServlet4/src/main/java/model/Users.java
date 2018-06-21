package model;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Users {
	private String name;
	private String password;
	private LocalDate birthday;
	
	
	public Users(String name, String password, LocalDate birthday) {
		super();
		this.name = name;
		this.password = password;
		this.birthday = birthday;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {

			
 			return "Users [name=" + name + ", password=" + password + ", birthday=" + birthday + "]";
	 
	}
	

}
