package org.krylov;

import java.util.ArrayList;
import java.util.Collections;

// Сформувати масив B з вихідного одновимірного масиву A за наступним алгоритмом:
// Спочатку йдуть елементи масиву A з парними значеннями в порядку їх зростання,
// потім елементи з непарними значеннями в порядку їх зменшення.
// Для визначення кількості парних елементів використовуйте оператор взяття модуля "%".

public class Task1 {

	public int[] evenAscendingOddDescending(int[] A) {
		int[] B = new int[A.length];

		ArrayList<Integer> odd = new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<>();

		for (int a : A) {
			if (a % 2 == 0)
				even.add(a);
			else
				odd.add(a);
		}

		even.sort(Integer::compareTo);
		odd.sort(Collections.reverseOrder());

		int bIndex = 0;

		for (int b : even)
			B[bIndex++] = b;
		for (int b : odd)
			B[bIndex++] = b;

		return B;
	}
}