import java.lang.*;
import java.util.*;
class Vehicle{
	private int wheels;
	private double weight;
	public Vehicle(int wheels,int weight){
		this.wheels = wheels;
		this.weight = weight;
	}
	public String disPlay(){
		return "��������Ϊ��"+this.wheels+"�� "+"����Ϊ��"+this.weight+"��";
	}
}
class Car extends Vehicle{
	private int loader;
	public Car(int wheels,int weight,int loader){
		super(wheels,weight);
		this.loader = loader;
	}
	public String disPlay(){
		return super.disPlay()+"������Ϊ��"+this.loader;
	}
}
class Truck extends Car{
	private double payload;
	public Truck(int wheels,int weight,int loader,int payload){
		super(wheels,weight,loader);
		this.payload = payload;
	}
	public String disPlay(){
		return super.disPlay()+"������Ϊ��"+this.payload+"��";
	}
} 

public class VehicleTest{
	public static void main(String args[]){
		Vehicle veh = new Vehicle(4,2);
		System.out.println(""+veh.disPlay());
		Car car = new Car(4,1,5);
		System.out.println(""+car.disPlay());
		Truck tck = new Truck(6,10,2,13);
		System.out.println(""+tck.disPlay());
	}
}
