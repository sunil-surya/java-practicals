package lambdas;

import java.io.ObjectInputStream.GetField;
import java.util.List;

import utility.Student;
import utility.StudentDatabase;
import java.util.function.*;

public class BiConcumerExample {
	
	public static void main(String[] args) {
		
		
		List<Student> studentsList = StudentDatabase.getAllStudents();
		
		//Print values of a and b using BCFI

			BiConsumer<String,String> b1 = (a,b)-> {System.out.println(a +" "+b);};
			
			b1.accept("Sunil", "T");
		
		//Multiply 2 numbers using BCFI
		
				BiConsumer<Integer,Integer> multiply = (x,y) -> {System.out.println(x*y);};
				
				multiply.accept(10, 5);
		
		//Divide two numbers using BCFI
		
			BiConsumer<Integer, Integer> divide = (x,y) -> {
				if(y == 0) {
					throw new RuntimeException("Y can not be 0");
				}else {
					System.out.println("quotient : "+x/y);
				}
			};
			
			divide.accept(10, 2);
		
	
			System.out.println();
		//Combine 2 BCFI's using andThen() method of BCFI
			
			multiply.andThen(divide).accept(20,4);
			
	
		//Print Student names and Student activities using BCFI
			
			BiConsumer<String,List<String>> b2 = (name,activities)-> {System.out.println(name+":"+activities);};
			
			Consumer<Student> c1 = (student)->{
				b2.accept(student.getName(), student.getActivities());
				
			};
			
			studentsList.forEach(c1);
		
		
	}

}
