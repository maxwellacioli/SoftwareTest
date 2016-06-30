package resources;

import java.util.Scanner;

public class Main {
	private static Queue queue;

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {

		Scanner input = new Scanner(System.in);
		int capacity = input.nextInt();

		if (capacity < 0) {
			throw new Exception();
		}

		queue = new Queue(capacity);

		while (input.hasNextInt()) {
			int number = input.nextInt();

			queue.addElement(number);
		}

		String cmd = input.next();

		while (!cmd.equals("quit")) {
			command(cmd, input);
			cmd = input.next();
		}

		input.close();
	}

	private static void command(String cmd, Scanner input) throws Exception {
		if (cmd.equals("element")) {
			System.out.println(queue.getHead());
		} else if (cmd.equals("size")) {
			System.out.println(queue.getSize());
		} else if (cmd.equals("print")) {
			queue.printQueue();
		} else if (cmd.equals("remove")) {
			queue.removeNumber();
		} else if (cmd.equals("insert")) {
			while (input.hasNextInt()) {
				queue.addElement(input.nextInt());
			}
		} else {
			System.out.println("Comando invalido!");
		}

	}
}
