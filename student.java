class Pesion{
	private String name;
	private String xingbie;
	private String Birthdate;
    private String IDcode;
    public Pesion(String name,String xingbie,String Birthdate,String IDcode){
    	this.name = name;
    	this.xingbie = xingbie;
    	this.Birthdate = Birthdate;
    	this.IDcode = IDcode;
    }
    public void showBaseInfo(){
    	System.out.println("info is"+" name="+this.name
    		+" xingbie="+this.xingbie+" Birthdate"+this.Birthdate
    		+" IDcode="+this.IDcode);
    }
}

class Student extends Pesion{
	private int studentID;
	private String comeInSchoolDate;
	private String yuanXi;
    private double javaTestGrade;
    private int age;
    public Student(String name,String xingbie,String Birthdate,String IDcode,
    	int studentID,String comeInSchoolDate,String yuanXi){
    	super(name,xingbie,Birthdate,IDcode);
    	this.studentID = studentID;
    	this.comeInSchoolDate = comeInSchoolDate;
    	this.yuanXi = yuanXi;
    	this.javaTestGrade = javaTestGrade;
    }
    public void showStudentBaseInfo(){
    	super.showBaseInfo();
    	System.out.println();
    	System.out.println("student info is"+" studentID="+this.studentID
    		+" comeInSchoolDate="+this.comeInSchoolDate+" yuanXi"+this.yuanXi
    		+" javaTestGrade="+this.javaTestGrade);
    }
}

public class studentInfoTest{
	public static void main(String args[]){
		String[] name = new String[10];
		int[] age = new int[10];
		String[] Birthdate = new String[10];
		Double[] javaTestGrade = new Double[10];
		for(int i = 1;i <= 10;i++){
			System.out.println("")
		}
	}
	
}
