package resources;

import java.util.Scanner;

public class Main {
	private static Queue queue;

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {

		
		Scanner input = new Scanner(System.in);
		int capacity = input.nextInt();

		queue = new Queue(capacity);

		String cmd = input.next();

		while (!cmd.equals("quit")) {
			try {
				command(cmd, input);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cmd = input.next();
		}

		input.close();

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
		} else if (cmd.equals("add")) {
			if (input.hasNextInt()) {
				queue.addElement(input.nextInt());
			}
		} else {
			System.out.println("Comando invalido!");
		}

	}
}
