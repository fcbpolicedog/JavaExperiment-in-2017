import java.lang.*;
import java.util.*;
class Complex{
    private double shibu;
    private double xubu;
    public Complex(){
        shibu = 0;
        xubu = 0;
    }
    public Complex(double shibu,double xubu){
        this.shibu = shibu;
        this.xubu = xubu;
    }
    public Complex add(Complex x,Complex y){
        Complex temp = new Complex();
        temp.shibu = x.shibu + y.shibu;
        temp.xubu = x.xubu + y.xubu;
        System.out.println("相加之后的结果为："+temp.shibu+temp.xubu+"i");
        return temp;
    }
    public Complex sub(Complex x,Complex y){
        Complex temp = new Complex();
        temp.shibu = x.shibu - y.shibu;
        temp.xubu = x.xubu - y.xubu;
         System.out.println("相减之后的结果为："+temp.shibu+temp.xubu+"i");
        return temp;
    }
    public String toString(Complex x){
    	System.out.println(""+x.shibu+"+"+x.xubu+"i");
        return ""+x.shibu+"+"+x.xubu+"i";
    }
    public void complae(Complex x){
        if(x.shibu==this.shibu&&x.xubu==this.xubu){
           System.out.println("两个复数相等");
        }
        else{
           System.out.println("两个复数不相等");
        }
    }
}
public class ComplexTest{
    public static void main(String args[]){
        Complex first = new Complex(2,3);
        Complex second = new Complex(1.3,4);
        Complex third = new Complex(2,3);
        Complex temp = new Complex();
        temp.add(first,second);
        temp.sub(first,second);
        first.toString(first);
        first.complae(second);
        first.complae(third);
    }
}