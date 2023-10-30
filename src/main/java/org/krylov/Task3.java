package org.krylov;


import java.util.HashMap;
import java.util.Map;

// Виведіть на дисплей значення та індекси тільки тих елементів масиву A,
// значення яких не дорівнюють значенням інших елементів, тобто унікальних елементів масиву.

public class Task3<T> {

	public Map<T, Integer> getUniqueItems(T[] A) {
		var itemCounter = new HashMap<T, Integer>();
		var unique = new HashMap<T, Integer>();

		for (int i = 0; i < A.length; i++) {
			var aCount = itemCounter.getOrDefault(A[i], 0);
			itemCounter.put(A[i], ++aCount);

			unique.put(A[i], i);
		}

		for (T item : itemCounter.keySet()) {
			var count = itemCounter.get(item);
			if (count > 1)
				unique.remove(item);
		}

		return unique;
	}
}
