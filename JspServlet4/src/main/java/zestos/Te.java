package zestos;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import model.Users;

public class Te {

	public static void main(String[] args) {

		   @SuppressWarnings("unused")
		DateTimeFormatter fmt = DateTimeFormatter
			        .ofLocalizedDate(FormatStyle.SHORT);
		   
		   
		LocalDate ldt = LocalDate.of(2012, Month.JULY, 22);
		Users user0 = new Users("aa", "",  ldt);
		
//		fmt.format(ldt);
		System.out.println("-->" + user0);
		
//		    System.out.println("Short  Date: " + fmt.format(ldt));
		
	}
}


 class Kuku {
		private String name;
		private LocalDate birthday;
		
		@Override
		public String toString() {

			   DateTimeFormatter fmt = DateTimeFormatter
				        .ofLocalizedDate(FormatStyle.SHORT);
				LocalDate ldt = LocalDate.of(birthday.getYear(), birthday.getMonth() , birthday.getDayOfMonth()); 
			   
//				return "Kuku [name=" + name + ", birthday=" + fmt.format(ldt) + "]";
			return "Kuku : name=" + name + ", birthday=" + fmt.format(ldt) + " ";
		}
		
		public Kuku(String name, LocalDate birthday) {
			super();
			this.name = name;
			this.birthday = birthday;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public LocalDate getBirthday() {
			return birthday;
		}
		public void setBirthday(LocalDate birthday) {
			this.birthday = birthday;
		}
		
		
		 
 }