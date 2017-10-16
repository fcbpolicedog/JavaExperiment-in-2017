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
		return "矩形的面积为："+this.getArea()+" 矩形的周长为："+this.getPerimeter();
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
		return "圆形的面积为："+this.getArea()+"圆形的周长为："+this.getPerimeter();
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
		return "三角形面积为："+this.getArea()+"三角形周长为："+this.getPerimeter();
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
