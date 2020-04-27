package day7;

public class ClassEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_1 s1 = new Student_1();
		s1.entrance();
		s1.printInfo();
		System.out.println("-----------------------------------------");
		Student_1 s2 = new Student_1("디지털 컨버전스 응용SW개발자 JAVA", "이순신");
		s2.entrance();
		s2.leave();
		s2.printInfo();
		
	}

}
class Student{
	private static String Academyname = "그린컴퓨터아트학원";
	private static int studentNumber;
	private String studentName[] = new String[studentNumber];
	int entrancecont;
	int absentcont;
	int checktime;
	int tardycont;
	private int classDay = 600;
	int entrance[][]= new int[studentNumber][classDay];
	private int entranceTime = 560;
	int leaveTime;
	String className;
	int classCode;
	
	public void setStudentName(String studentName) {
		while(this.studentName[studentNumber]=="Null") {
			studentNumber++;
		}
		this.studentName[studentNumber] = studentName;
	}
	public int[][] entrance(String name,int time) {
		int i=0;
		while(studentName[i] != name && i<studentName.length) {
			i++;
		}
		if(entrance[i][classDay]==0) {;
			checktime=time;
			entrance[i][classDay]=1;
			return entrance;
		}else if(entrance[i][classDay]==0&&entranceTime<checktime&&checktime-entranceTime<510){
			checktime=time;
			entrance[i][classDay]=2;
			return entrance;
		}
		return entrance;
	}
	public void nextday() {
		for(int i=0; i<entrance.length; i++) {
			if(entrance[i][classDay]==0) {
				absentcont++;
			}else {
				checktime = 0;
			}
		}
		classDay++;
		
	}
	public void leave(String name, int time) {
		int i=0;
		while(studentName[i] != name && i<studentName.length) {
			i++;
		}
		if(entrance[i][classDay]!=0) {
			checktime = time;
		}
	}
	public void studentInfo() {
		System.out.println(Academyname);
		System.out.println(studentNumber);
		System.out.println(studentName);
	}
	
}

class Student_1{
	private String name;
	private boolean isEntrance;
	private String course;
	private String entranceTime, leaveTime;
	
	public void entrance() {
		System.out.println("입실했습니다.");
		isEntrance = true;
		entranceTime = "9시";
	}
	public void leave() {
		System.out.println("퇴실했습니다.");
		isEntrance = false;
		leaveTime = "18시";
	}
	public void printInfo() {
		System.out.println("과정 : " + course);
		System.out.println("이름 : " + name);
		if(isEntrance) {
			System.out.println("입실 중입니다.");
			System.out.println("입실시간 : " + entranceTime);
		}else {
			System.out.println("퇴실 했습니다.");
			System.out.println("입실시간 : " + entranceTime);
			System.out.println("퇴실시간 : " + leaveTime);
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isEntrance() {
		return isEntrance;
	}
	public void setEntrance(boolean isEntrance) {
		this.isEntrance = isEntrance;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getEntranceTime() {
		return entranceTime;
	}
	public void setEntranceTime(String entranceTime) {
		this.entranceTime = entranceTime;
	}
	public String getLeaveTime() {
		return leaveTime;
	}
	public void setLeaveTime(String leaveTime) {
		this.leaveTime = leaveTime;
	}
	public Student_1() {
		course = "자바";
		name = "홍길동";
	}
	public Student_1(String course, String name) {
		this.course = course;
		this.name = name;
	}
}



