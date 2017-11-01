class MyDate{
	private int year;
	private int month;
	private int day;
	public MyDate(int year,int month,int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public MyDate(){
		year = 0;
		month = 0;
		day = 0;
	}
	public void showDate(){
		System.out.println(this.year+"/"this.month+"/"this.day);
	}
}

public MyDateTest{
	public static void main(String args[]){
		MyDate date = new MyDate(2017,10,12);
		date.showDate();
	}
}
