package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import utility.Student;
import utility.StudentDatabase;

public class MapMethodExample {
	
	public static List<String> nameList(){
		
 return StudentDatabase.getAllStudents().stream()
				.map(Student::getName)
				.map(String::toUpperCase)
				.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		
		System.out.println(nameList());
	}
	

}
