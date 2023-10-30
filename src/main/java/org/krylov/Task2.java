package org.krylov;


// Перевірте, чи є елементи масиву A множиною
// Для цього серед елементів масиву не повинно бути двох елементів з однаковим значенням.

import java.util.HashSet;

public class Task2<T> {

	public boolean isSet(T[] A) {
		var set = new HashSet<T>();

		for (T a : A) {
			if (set.contains(a))
				return false;
			else
				set.add(a);
		}

		return true;
	}
}
