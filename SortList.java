package by.epam.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Отсортировать список по длине строк
public class SortList {

	public static void main(String[] args) {

		ArrayList<String> strings = new ArrayList<String>();
		strings.add("gdfgfg");
		strings.add("fggfgfgfgfgfg");
		strings.add("fgfgfgg");
		strings.add("fgg");
		System.out.println(strings);

		sortingAsc(strings);
		printSort(strings);
		sortingDesc(strings);
		printSort(strings);

	}

	static void sortingAsc(ArrayList<String> strings) {

		Collections.sort(strings, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				return a.length() - b.length();
			}
		});

		System.out.println("После сортировки по возрастанию: ");

	}

	static void printSort(ArrayList<String> strings) {
		for (String a : strings) {
			System.out.println(a);
		}

	}

	static void sortingDesc(ArrayList<String> strings) {

		Collections.sort(strings, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				return b.length() - a.length();
			}
		});

		System.out.println("После сортировки по убыванию: ");

	}

}
