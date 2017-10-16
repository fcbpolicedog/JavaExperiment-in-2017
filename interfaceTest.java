import java.util.*;
interface Shape{
	public abstract double getArea();
	public abstract double getPerimeter();
}
class Coordinates{
	protected long x;
	protected long y;
	public Coordinates(long x,long y){
		this.x = x;
		this.y = y;
	}
}
class Rectangle extends Coordinates implements Shape{
	public Rectangle(long x,long y){
		super(x,y);
	}
	public double getArea(){
		return x * y;
	}
	public double getPerimeter(){
		return (x + y) * 2;
	}
	public String display(){
		return "���ε����Ϊ��"+this.getArea()+" ���ε��ܳ�Ϊ��"+this.getPerimeter();
	}
}
class Circle extends Coordinates implements Shape{
	public Circle(long x,long y){
		super(x,0);
	}
	public double getArea(){
		return 3.14 * x *x;
	}
	public double getPerimeter(){
		return 3.14 * 2 * x;
	}
	public String display(){
		return "Բ�ε����Ϊ��"+this.getArea()+"Բ�ε��ܳ�Ϊ��"+this.getPerimeter();
	}
}
class Triangle extends Coordinates implements Shape{
	public Triangle(long x,long y){
		super(x,y);
	}
	public double getArea(){
		return 0.5 * x * y;
	}
	public double getPerimeter(){
		return x + y + Math.sqrt(x*x + y*y);
	}
	public String display(){
		return "���������Ϊ��"+this.getArea()+"�������ܳ�Ϊ��"+this.getPerimeter();
	}
}

public class interfaceTest{
	public static void main(String args[]){
		Rectangle rec = new Rectangle(2,3);
		System.out.println(""+rec.display());
		Circle cir = new Circle(3,0);
		System.out.println(""+cir.display());
		Triangle tri = new Triangle(3,4);
		System.out.println(""+tri.display());
	}
}
