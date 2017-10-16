import java.lang.*;
import java.util.*;
class BanKzhanghu {
    private String zhangHao;
    private String kaiHuName;
    private String kaiHuDate;
    private String idNumber;
    private int    money;
    public BanKzhanghu(){
        zhangHao = null;
        kaiHuName = null;
        kaiHuDate = null;
        idNumber = null;
        money = 0;
    }
    public BanKzhanghu(String zhangHao,String kaiHuName,String kaiHuDate,
           String idNumber,int money){
               this.zhangHao = zhangHao;
               this.kaiHuName = kaiHuName;
               this.kaiHuDate =kaiHuDate;
               this.idNumber = idNumber;
               this.money = money;
           }
    public void kaiHu(String zhangHao,String kaiHuName,String kaiHuDate,String idNumber,int money){
               this.zhangHao = zhangHao;
               this.kaiHuName = kaiHuName;
               this.kaiHuDate =kaiHuDate;
               this.idNumber = idNumber;
               this.money = 0;
    }
    public void chunkuan(int money){
        this.money = money;
        System.out.println("您已经在本行存入"+money+"元"); 
    }
    public void qukuan(int quMoney){
        this.money = this.money - quMoney;
        System.out.println("您已经在本行取走"+quMoney+"元"+"账户余额为："+this.money+"元");
    }
    public void chaxun(){
        System.out.println("您的账户余额为："+this.money+"元");
    }
    protected void finalize(){
		super.finalize();
        System.out.println("您的账户已经消除，期待下次为您服务");
        
    }
}
public class BanKzhanghuTest{
    public static void main(String args[]){
        BanKzhanghu myZhanghu = new BanKzhanghu("123","景泉洁","2017.9.15","510781",0);
        myZhanghu.chunkuan(2000);
        myZhanghu.qukuan(500);
        myZhanghu.chaxun();
        myZhanghu.finalize();
    }
}