package org.krylov;

// Сформувати масив B з масиву A наступним чином: масив B складається з тих елементів масиву A, які повторюються в масиві (по одному значенню для однакових елементів).
// Наприклад, для масиву a = [3, 7, 4, 3, 8, 7, 5] масив b матиме вигляд [3, 7].

import java.util.Arrays;
import java.util.HashMap;

public class Task5 {

	public int[] getDuplicates(int[] A) {
		var frequencies = new HashMap<Integer, Integer>();
		Arrays.stream(A).forEach(item -> frequencies.merge(item, 1, Integer::sum));

		return frequencies.keySet().stream().filter(key -> frequencies.get(key) > 1).mapToInt(Integer::intValue).sorted().toArray();
	}
}
