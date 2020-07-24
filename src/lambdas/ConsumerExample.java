package lambdas;

import java.util.List;
import java.util.function.Consumer;

import utility.Student;
import utility.StudentDatabase;

public class ConsumerExample {
	
	public static void main(String[] args) {
		
		//Consumer Function interface
		/*
		 * interface consumer<T> {
		 *   void accept(T t);
		 *   default Consumer<T> andThen(Consumer<T> after)	
		 *   
     	 * } 
		 */
		
		List<Student> studentsList = StudentDatabase.getAllStudents();
		
		/*
		 * for(Student student : studentsList){ System.out.println(student); }
		 */
		
		// convert string to Upper Case using Consumer Functional Interface(CFI)
		
				//Step1: Provide implementation to CFI
				
				Consumer<String> c1 = (s)->{System.out.println("UPPERCASE :  "+s.toUpperCase());};
		
				
				//Step 2: Pass the argument to the CFI
				
				c1.accept("suni");
		
		//Print Student List using CFI

				//Step1 : Provide implementation to CFI

				Consumer<Student>  c2 = (student)->{System.out.println(student);};
				
				//Step2: Pass argument to the CFI

				studentsList.forEach(c2);
		
		//Print Student names
				
				
				Consumer<Student> c3 = (student)->{System.out.println(student.getName());};
				
				studentsList.forEach(c3);
	
	 // Print Student activities
				
				Consumer<Student> c4 = (student) -> {System.out.println(student.getActivities());};
				
				studentsList.forEach(c4);
				
	//Combine Student name and Student activities
				
				studentsList.forEach(c3.andThen(c4));
	
	//Do some filtration using CFI \
				
				Consumer<Student> c5 = (student) -> {
					
					if(student.getGradelvel() > 2) {
						System.out.println(student);
						
					}
				};
				
				studentsList.forEach(c5);
				
		
	}
}
