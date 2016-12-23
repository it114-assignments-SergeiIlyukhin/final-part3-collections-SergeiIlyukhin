package section1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentCollectionTester {
	protected List<Student> students;
	protected List<Student> studentOrig;
	public static List<Student> createStudents(){
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Allison", 19, 1, 4.0));
		students.add(new Student("Barbara", 18, 2, 3.5));
		students.add(new Student("Charlie", 17, 1, 3.8));
		students.add(new Student("Donald", 20, 3, 3.6));
		students.add(new Student("Edward", 21, 4, 2.8));
		return students;
	}
	
	public static List<Student>	studentsOrig() {
		return null;
		
	}
	public void SortStudents() {
		studentOrig = createStudents();	
		students = studentOrig;
	}
		public List<Student> sortStudent() {
		System.out.println("BEFORE sorting:" + students);
		Collections.sort(students);
		System.out.println("AFTER sorting:" + students);

		return null;
			
	}
	public List<Student> sortStudentInReverseOfNaturalOrder() {
		students = new ArrayList<Student>(studentOrig);
		System.out.println("BEFORE sorting:" + students);
		Comparator<Student> reverseOfNaturalOrderComparator = Collections.reverseOrder();
		Collections.sort(students, reverseOfNaturalOrderComparator);
		System.out.println("AFTER sorting:" + students);

		return null;
	}
	public List<Student> sortStudentBasedOnGrade() {

		students = new ArrayList<Student>(studentOrig);
		System.out.println("BEFORE sorting:" + students);

		StudentGradeComparator studentGradeComparator = new StudentGradeComparator();
		Collections.sort(students, studentGradeComparator);
		System.out.println("AFTER sorting:" + students);

		return null;
	}
	
	public List<Student> sortStudentBasedOnReverseAverage() {
		students = studentOrig;
		System.out.println("BEFORE sorting:" + students);

		StudentAverageComparator studentAverageComparator = new StudentAverageComparator();
		Comparator<Student> reverseAverageComparator = Collections.reverseOrder(studentAverageComparator);
		Collections.sort(students, reverseAverageComparator);
		System.out.println("AFTER sorting:" + students);

		return null;
	}
	public List<Student> shuffleStudents() {
		students = new ArrayList<Student>(studentOrig);
		System.out.println("BEFORE shuffling:" + students);

		Collections.shuffle(students);
		System.out.println("AFTER shuffling:" + students);

		return students;
	}
	public List<Student> reverseStudents() {
		students = new ArrayList<Student>(studentOrig);	
		System.out.println("BEFORE reversing:" + students);

		Collections.reverse(students);
		System.out.println("AFTER  reversing:" + students);

		return students;
	}
	public List<Student> swap1stAnd2ndStudents() {
		students = new ArrayList<Student>(studentOrig);	
		System.out.println("BEFORE swapping:" + students);
		Collections.swap(students, 0 , 1);
		System.out.println("AFTER  swapping:" + students);

		return students;
	}
	public List<Student> copyStudents() {
		List<Student> copyStudents = new ArrayList<Student>(studentOrig.size());	
		Student s;
		for (int i = 0; i < studentOrig.size(); i++) {
			s = new Student("", 0, 0, 0.0);
			copyStudents.add(s);
		}
		Collections.copy(copyStudents, studentOrig);
		System.out.println("Student     copy:" + copyStudents);

		Collections.sort(copyStudents);
		System.out.println("Sorted      copy:" + copyStudents);

		System.out.println("Original students:" + studentOrig);
		return copyStudents;
	}
	public Student maxStudentInStudents() {
		students = new ArrayList<Student>(studentOrig);
		System.out.println("original Studentss:" + students);
		Collections.sort(students);
		System.out.println("sorted   Students:" + students);

		Student maxStudent = Collections.max(students);
		System.out.println("MAX (based on natural order) Student:" + maxStudent);

		return maxStudent;
	}
	public void binarySearchOrderedStudents() {
		students = new ArrayList<Student>(studentOrig);
		System.out.println("original students:" + students);

		Student studentsToSearch = students.get(3);
		
		Collections.sort(students);	
		System.out.println("sorted students:" + students);
		int indexOfFoundStudent = Collections.binarySearch(students, studentsToSearch);
		System.out.println("personToSearch:" + studentsToSearch + ", indexOfFoundStudent:" + indexOfFoundStudent);
	}


		
	
		
	
}
