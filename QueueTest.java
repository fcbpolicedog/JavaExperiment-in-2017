    interface Storage{
        void put(int x);
        int get();
    }
     class Queue implements Storage {  
        private int[] obj;  
        private int head;  
        private int end;  
        private int size;  
          
        public Queue(int size){  
            obj = new int[size];  
            this.head = 0;  
            this.end = -1;  
            this.size = 0;  
        }  
          
        public void put(int a){  
            if(this.size > obj.length)  
                System.out.println("error!");  
            if(end == obj.length - 1)  
                end = -1;  
            obj[++end] = a;  
            size++;  
        }  
          
        public int get(){  
            if(this.size == 0)  
                System.out.println("Queue is empty!");  
            int tmp = obj[head++];  
            if(head == obj.length)  
                head = 0;  
            size--;  
            return tmp;  
        }  
          
}
public class QueueTest{
    public static void main(String args[]){
        Queue que = new Queue(10);
        System.out.println("put data into the queue");
        for(int i = 0;i <= 9;i++){
			System.out.println(i);
            que.put(i);
        }
        System.out.println("get data from the queue");
        for (int i = 0;i<=9 ;i++ ) {
            System.out.println(""+que.get());
        }
        
    }
}
