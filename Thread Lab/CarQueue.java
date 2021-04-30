//Ethan Yu (not you, me!)

import java.util.Random;
import java.util.Queue;
import java.util.LinkedList;

public class CarQueue {
	Queue<Integer> queue;
	Random randy = new Random();
	
	public CarQueue() {
		queue = new LinkedList<>();
		queue.add(3);
		queue.add(2);
		queue.add(1);
		queue.add(0);
		queue.add(1);
		queue.add(2);
	}
	
	public void addToQueue() {
		class temp implements Runnable {
			@Override
			public void run() {
				try {
					for(int i = 0; i < 1000; i++) {
						int num = randy.nextInt(4);
						queue.add(num);
						Thread.sleep(50);
					}
				}catch(Exception exception) {
					exception.printStackTrace();
			}
		}
	}
	
		Runnable run = new temp();
		Thread t = new Thread(run);
		t.start();
	}
	
	public int deleteQueue() {
		return queue.remove();
	}
}
