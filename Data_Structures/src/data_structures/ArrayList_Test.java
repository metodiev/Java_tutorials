package data_structures;

import java.util.ArrayList;

public class ArrayList_Test {

	public static void main(String[] args) {
		
		/**
		 * 
	  add(Object) � �������� �� ��� �������
-     add(index, Object) � �������� ������� �� ���������� ����� (������)
-     size() � ����� ���� �� ���������� � �������
-     remove(Object) � ���������� ��������� �������
-     remove(index) � ���������� �� �������� �� ���������� ����� (������)
-     clear() � ���������� �� �������
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
