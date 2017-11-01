import java.util.*;
import java.lang.*;
interface Average{
    public abstract double getAverage();
}
class allGetAverage implements Average{
    private int count;
   public double getAverage(int a[]){
       for(int i = 0;i < a.length; i++ ){
           count += a[i];
       }
       return count/a.length;
   }
}

class notLessAndTopGetAverage implements Average{
    private int count;
    public double getAverage(int a[]){
        int less = a[0];
        for(int i =0;i < a.length;i++){
            if(a[i] < less){
                less = a[i];
            }
        }
        int top = a[0];
        for(int i = 0;i < a.length;i++){
            if(a[i] > top){
                top = a[i];
            }
        }
        for(int i = 0;i < a.length;i++){
            count+=a[i];
        }
        return (count-less-top)/(a.length-2);

    }
}

