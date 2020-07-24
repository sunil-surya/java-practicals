

class Emp{
	int eid;
	int salary;
	String comapnyName;
	
	void show() {
		System.out.println(eid+" : "+salary+" : "+comapnyName);
	}
}



public class StaticDemo {
	public static void main(String[] args) {
		
		Emp navin = new Emp();
	
		navin.eid = 101;
		navin.salary = 6000;
		navin.comapnyName="FIME";
		
		navin.show();
		
		Emp rahul = new Emp();
		
	    rahul.eid = 102;
	    rahul.salary = 4000;
	    rahul.comapnyName = "FIME";
	    
	    navin.show();
		
		
	}

}
