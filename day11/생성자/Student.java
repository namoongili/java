package day11.생성자;

public class Student extends Person{

	int classNo;
	
	//생성자

	//기본생성자
	public Student() {}
	public Student(String name, String id, int classNo) { //자식의생성자에서부모의기본생성자를호출한다.(강제되어있음)
		//부모의 기본생정자를 호출하게 강제되어 있다.
		//부모의 생성자 호출방법 : super()
		

		/*
		 부모의 매개변수가 있는 생성자를 통해서 초기화 될 수 있도록 한다
		this.name = name;
		this.id = id;
		*/
		this.classNo = classNo;
	}
	
	public void output()
	{
			System.out.println( "이름="+ name);
			System.out.println( "아이디="+ id);
			System.out.println( "반="+ classNo);
		}
	
	public static void main(String[] args) {
		Student s = new Student("김솔", "kimssol", 403);
		s.output();
	}
	}

