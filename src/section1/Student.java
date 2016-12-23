package section1;

public class Student implements Comparable<Student> {
	public String name;
	public Integer age;
	public Integer grade;
	public Double average;

	@Override
	public int compareTo(Student age) {
		// TODO Auto-generated method stub
		return 0;
	}
	public Student(String name,int age,int grade,double average){
		
	}
	
	@Override
	public String toString(){
		return ("{name: "+ name + "age: "+age+"grade: "+grade+"average: "+average);
		
	}


}
