import java.util.*;
import java.lang.*;
import java.io.*;

class MyException extends Exception{
	public MyException(String s){
		super(s);
	}
}

class stringTest{
	public static void complare(String s)throws MyException{
		if (s.equals("XYZ")) {
			System.out.println("s="+s);
			throw new MyException("this is XYZ");
		}
		System.out.println("处理异常");
		System.out.println("s="+s);
	}
}
public class MyExceptionTest{
	static stringTest st = new stringTest();
	public static void main(String args[])throws MyException,IOException{
		System.out.println("请输入字符串");
	Scanner b = new Scanner(System.in);
	 String a = b.nextLine();
     try{
     	st.complare(a);
     }
     catch(MyException e){
     	System.out.println("e"+e.getMessage());
     	e.printStackTrace();
     }
	}
}