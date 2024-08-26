import java.util.Comparator;

public class rollnoComparator implements Comparator<Student>{
	
	@Override
	public int compare(Student o1, Student o2) {	
		Student st1=(Student)o1;  
		Student st2=(Student)o2;  
		if(st1.rollno==st2.rollno)  
		return 0;  
		else if(st1.rollno>st2.rollno)  
		return 1;  
		else  
		return -1; 
	}
}
