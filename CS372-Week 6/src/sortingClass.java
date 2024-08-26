import java.util.ArrayList;
import java.util.Collections;

public class sortingClass{

	public static void main(String[] args) {
	
	//Creating 10 objects
	Student st1 = new Student(4,"Laure","Bevil 3");
	Student st2 = new Student(6,"Bijou","Lalue 5");
	Student st3 = new Student(2,"Edinio","Bevil 1");
	Student st4 = new Student(8, "Myrtha", "Bourdon 5");
	Student st5 = new Student(3, "Nathanael", "Torcel 21");
	Student st6 = new Student(1,"Marie","Puits Blain 3");
	Student st7 = new Student(7, "Christne", "Delmas 91");
	Student st8 = new Student(5, "Christelle", "Berthe 54");
	Student st9 = new Student(9, "Ernst","Pelerin 56");
	Student st10 = new Student(10, "Jeff", "VivyMitche 5");
	
	//Create array list		
	ArrayList<Student> StudentList = new ArrayList<Student>();	
	
	//add 10 students to array list
	StudentList.add(st1);
	StudentList.add(st2);
	StudentList.add(st3);
	StudentList.add(st4);
	StudentList.add(st5);
	StudentList.add(st6);
	StudentList.add(st7);
	StudentList.add(st8);
	StudentList.add(st9);
	StudentList.add(st10);
	
	System.out.println("Sorting by Name");  
	  
	Collections.sort(StudentList,new nameComparator());  
	for(Student lst: StudentList){  
	System.out.println(lst.rollno+" "+lst.name+" "+lst.address);  
	}  
	System.out.println("");   
	System.out.println("Sorting by roll number");  
	  
	Collections.sort(StudentList,new rollnoComparator());  
	for(Student lst: StudentList){ 
	System.out.println(lst.rollno+" "+lst.name+" "+lst.address);  
	}
}
	
}
