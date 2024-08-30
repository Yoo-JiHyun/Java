package Day13_14.Ex06_수강과정등록;

import java.util.ArrayList;
import java.util.List;

public class Academy {
	
	public static void main(String[] args) {
		
		// 일반인 과정 생성
		List<Person> personList = new ArrayList<Person>();
		personList.add( new Person("김조은") );
		personList.add( new Worker("박조은") );
		personList.add( new Student("이조은") );
		personList.add( new HighStudent("황조은") );
		personList.add( new MiddleStudent("권조은") );
		Course<Person> personCourse = new Course<Person>(personList);
		personCourse.createCourse("일반인 과정", personCourse);
		personCourse.printStudentList(personCourse);
		
		
		// 직장인 과정
		List<Worker> workerList = new ArrayList<Worker>();
		workerList.add( new Worker("안기욱") );
		workerList.add( new Worker("장그래") );
		workerList.add( new Worker("김부장") );
		Course<? super Worker> workerCourse = new Course<>(workerList);
		Course<?> createdWorkerCourse = workerCourse.createWorkerCourse("직장인 과정", workerCourse);
		Course<?> createdWorkerCourse2 = workerCourse.createWorkerCourse("직장인 과정2", personCourse);
		
		workerCourse.printStudentList(createdWorkerCourse);
		workerCourse.printStudentList(createdWorkerCourse2);
		
		
		// 학생 과정
		List<Student> studentList = new ArrayList<Student>();
		studentList.add( new Student("김학생") );
		studentList.add( new HighStudent("이고딩") );
		studentList.add( new MiddleStudent("장중딩") );
		// studentList.add( new Person("김조은") );
		// studentList.add( new Worker("안기욱") );
		Course<? extends Student> studentCourse = new Course(studentList);
		studentCourse.createStudentCourse("학생 과정 ", studentCourse);
		// studentCourse.createStudentCourse("직장인 과정 ", workerCourse);
		// studentCourse.createStudentCourse("일반인 과정 ", personCourse);
		
		List<MiddleStudent> middlestudentList = new ArrayList<MiddleStudent>();
		middlestudentList.add( new MiddleStudent("이중딩") );
		Course<MiddleStudent> middlestudentCourse = new Course(middlestudentList);
		middlestudentCourse.createStudentCourse("중학생 과정", middlestudentCourse);
		// * workerCourse.createWorkerCourse("직장인 과정3", studentCourse);
		// 직장인 과정에는 학생 과정 세팅을 개설 할 수 없다.
		
		studentCourse.printStudentList(studentCourse);
		studentCourse.printStudentList(middlestudentCourse);
	}

}
