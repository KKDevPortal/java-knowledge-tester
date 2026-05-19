package threading.example1;

public class Threading_example_2 extends Thread {
   @Override
    public void run() {
       for(int i=0; i<1000;i++) {
           System.out.println("I am dancing on song...");
       }
   }
}
