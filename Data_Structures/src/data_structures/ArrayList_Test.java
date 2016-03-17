package data_structures;

import java.util.ArrayList;

public class ArrayList_Test {

	public static void main(String[] args) {
		
		/**
		 * 
	  add(Object) – добавяне на нов елемент
-     add(index, Object) – добавяне елемент на определено място (индекс)
-     size() – връща броя на елементите в списъка
-     remove(Object) – премахване определен елемент
-     remove(index) – премахване на елемента на определено място (индекс)
-     clear() – изчистване на списъка
	 * */
		
		ArrayList list = new ArrayList();
		list.add(123);
		list.add("asdf");
		
		for (int i = 0; i < list.size(); i++) {
			Object value  = list.get(i);
			System.out.println(value);
		}
		
	}

}
