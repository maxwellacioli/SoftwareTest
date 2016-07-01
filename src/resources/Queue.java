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

	public void addElement(int number) {
		if (size >= max_size) {
			System.exit(1);
		}

		queue[size++] = number;
	}

	public int removeNumber() {

		if (size > 0) {
			int numberRemoved = queue[head];
			int i;
			for (i = 0; i < size - 1; i++) {
				queue[i] = queue[i + 1];
			}

			size--;

			return numberRemoved;
		} else {
			System.out.println("Nao foi possivel remover");
			return -1;
		}
	}

	public int getHead() {

		return queue[head];
	}

	public int getSize() {

		return size;
	}

	public void printQueue() {
		while (size > 0) {
			System.out.println(removeNumber());
		}
	}
}
