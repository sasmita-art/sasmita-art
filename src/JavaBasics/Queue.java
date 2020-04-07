package JavaBasics;

import java.util.PriorityQueue;

public class Queue {

	public static void main(String[] args) {
		 PriorityQueue pq= new PriorityQueue();
		 pq.add(10);
		 pq.add(20);
		 pq.add(5);
		 pq.add(2);
		 pq.add(10);
		 System.out.println(pq);
		 System.out.println(pq.size());
		 pq.poll();
		 pq.poll();
		 pq.poll();
		 System.out.println(pq.size());
		 
		 System.out.println(pq);
		 

	}

}
