# THREAD-RUNNABLE
package oxygen.com;
public class Program {
	int count =1;
	public void increment(){
		count ++;
		}
		public static void main(String[] args) throws InterruptedException {
Program p = new Program();
		Runnable r = new Runnable(){
			@Override
			public void run() {
				for(int i =0;i<1000;i++)
					p.increment();
			}
		};
		Thread t = new Thread(r);
		t.start();
		Runnable r1 = new Runnable(){
			@Override
			public void run() {
				for(int i =0;i<1000;i++)
					p.increment();
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		t.join();
		t1.join();
		System.out.println(p.count);
		}
    }
OUTPUT:
2001



