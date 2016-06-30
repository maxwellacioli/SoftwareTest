package test;

import org.junit.Test;

import resources.Queue;
import static org.junit.Assert.assertEquals;

public class teste {

	@Test
	public void test() throws Exception {
		int maxSize = 10;
		int sizeExpected = 5;
		int numb1 = 2;
		int numb2 = 3;
		int numb3 = 5;
		int numb4 = 7;
		int numb5 = 4;
		
		Queue q = new Queue(maxSize);
		q.addElement(numb1);
		q.addElement(numb2);
		q.addElement(numb3);
		q.addElement(numb4);
		q.addElement(numb5);
		
		assertEquals(sizeExpected, q.getSize());
	}
	

}
