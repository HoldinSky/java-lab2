package org.krylov;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MainTest {

	@Test
	public void testTask1() {
		int[] samples = {2, 6, 24, 13, 9, 53, 0, 104, -5, -94, 29};
		int[] expect = {-94, 0, 2, 6, 24, 104, 53, 29, 13, 9, -5};

		var testClass = new Task1();

		var output = testClass.execute(samples);

		assertArrayEquals(expect, output);
	}

	@Test
	public void testTask2() {
		Integer[] sample1 = {2, 5, 1, 125, 2, 0, 125, 2};
		Integer[] sample2 = {-42, 162, 215, 852, 91, 0, 12};

		String[] sample3 = {"Nazar", "Andrew", "Alina", "Nazar"};
		String[] sample4 = {"Nazar", "Andrew", "Alina", "Emma", "John"};

		var testClassStr = new Task2<String>();
		var testClassInt = new Task2<Integer>();

		assertFalse(testClassInt.isSet(sample1));
		assertTrue(testClassInt.isSet(sample2));

		assertFalse(testClassStr.isSet(sample3));
		assertTrue(testClassStr.isSet(sample4));

	}

	@Test
	public void testTask3() {
		Integer[] sample1 = {2, 5, 1, 125, 2, 0, 125, 2, 264, 1295, 1, 0, 3259};
		String[] sample2 = {"Nazar", "Oleg", "Andrew", "Luke", "Oleg", "Nazar"};

		var testClass1 = new Task3<Integer>();
		var testClass2 = new Task3<String>();

		var actual1 = testClass1.getUniqueItems(sample1);
		var actual2 = testClass2.getUniqueItems(sample2);

		System.out.println("\n\nTASK_3");
		System.out.println("UNIQUE OF SAMPLE_1");
		for (var item : actual1.keySet()) {
			System.out.println("Item: " + item + "; Index: " + actual1.get(item));
		}

		System.out.println("\nUNIQUE OF SAMPLE_2");
		for (var item : actual2.keySet()) {
			System.out.println("Item: " + item + "; Index: " + actual2.get(item));
		}
		System.out.println("\n\n");
	}

	@Test
	public void testTask4() {
		var samples = new ArrayList<int[]>();
		samples.add(new int[] {4, 9, 1});
		samples.add(new int[] {2, 10, 0});
		samples.add(new int[] {28, 3, 1});
		samples.add(new int[] {14, 7, 0});
		samples.add(new int[] {30, 6, 0});
		samples.add(new int[] {31, 8, 1});

		var expect = new int[] { 248, 275, 88, 195, 181, 244 };

		var testClass = new Task4();

		var i = 0;
		for (int[] sample : samples) {
			var result = testClass.getDayOfYear(sample[0], sample[1], sample[2] == 1);
			assertEquals(expect[i], result);
			i++;
		}
	}

	@Test
	public void testTask5() {
		int[] sample1 = new int[] { 3, 7, 4, 3, 8, 7, 5 };
		int[] sample2 = new int[] { 10, 2, 35, 2, 9, 7, 10, 7, 109};
		int[] sample3 = new int[] { 1, 1, 5, 17, 20, 21, 5, 21 };

		int[] expect1 = new int[] { 3, 7 };
		int[] expect2 = new int[] { 2, 7, 10 };
		int[] expect3 = new int[] { 1, 5, 21 };

		var testClass = new Task5();

		var result1 = testClass.getDuplicates(sample1);
		var result2 = testClass.getDuplicates(sample2);
		var result3 = testClass.getDuplicates(sample3);

		assertArrayEquals(expect1, result1);
		assertArrayEquals(expect2, result2);
		assertArrayEquals(expect3, result3);
	}
}