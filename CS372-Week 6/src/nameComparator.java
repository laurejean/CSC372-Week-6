import java.util.Comparator;

public class nameComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		Student st1=(Student)o1;  
		Student st2=(Student)o2;    
		return st1.name.compareTo(st2.name);  		
	}
}
