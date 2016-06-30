package resources;

public class Queue {
	private int[] queue;
	private int max_size;
	private int size = 0;
	private final int head = 0;
	
	public Queue(int max_size) {
		this.max_size = max_size;
		queue = new int[max_size];
	}
	
	public void setMaxSize(int max_size) {
		this.max_size = max_size;
		queue = new int[max_size];
	}

	public void addElement(int number) throws Exception {
		if(size >= max_size) {
			throw new Exception();
		}
		
		queue[size++] = number;
	}

	public int removeNumber() throws Exception {
		if(size <= 0) {
			throw new Exception();
		}
		
		int numberRemoved = queue[head];
		int i;
		for(i = 0; i < size - 1 ; i++) {
			queue[i] = queue[i+1]; 
		}
		
		size--;

		return numberRemoved;
	}

	public int getHead() {

		return queue[head];
	}

	public int getSize() {
		
		return size;
	}
	
	public void printQueue() {
		int i;
		
		for(i = 0 ; i < size ; i++) {
			System.out.println(queue[i]);
		}
	}
}
