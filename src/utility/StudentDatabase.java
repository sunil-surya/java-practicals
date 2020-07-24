package utility;

import java.util.Arrays;
import java.util.List;

public class StudentDatabase {
	
	static public List<Student> getAllStudents(){
		
		
		return Arrays.asList(
				new Student("Alex", 2.5, 2, "male", Arrays.asList("cricket","singing")),
				new Student("John", 3, 2, "male", Arrays.asList("football","reading")),
				new Student("Sara", 3.9, 3, "female", Arrays.asList("rubbi","dancing")),
				new Student("Ram", 3.5, 3, "male", Arrays.asList("Kabbaddi","singing")),
				new Student("Rahul", 4.0, 4, "male", Arrays.asList("hocky","singing")),
				new Student("Sunil", 3.9, 4, "male", Arrays.asList("running","dancing"))
				);
	}

}
