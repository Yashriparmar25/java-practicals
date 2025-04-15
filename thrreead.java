class thrreead extends Thread{
public static void main(String[] args) {
Thread A = new Thread(()->{
    for(int i=1;i<=10;i++){
        int two=i*2;
        System.out.println("thread for table of 2 : 2*"+i+"="+two);
    }
});    
Thread B = new Thread(()->{
    for(int i=1;i<=10;i++){
        int two=i*20;
        System.out.println("thread for table of 20 : 20*"+i+"="+two);
    }
});

try {
    A.start();
    A.join();
    B.start();
  
} catch (Exception e) {
    System.out.println("thread have a problemin compiling ");
}

}
}