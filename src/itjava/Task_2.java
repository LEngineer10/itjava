package itjava;

import java.util.Scanner;

public class Task_2 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		double v1, v2, v3,v4;
		double s1, s2;
		double h, h1, h2;
		// text
		System.out.println("������. �������� ����� ������ s1 �� ������ ������� ����");
		System.out.println("� s2 �� �� ������� ����. ��������, ��� � ����������� �������� �����");
		System.out.println("v1 ��/�, � �������� ������� ���� v2 ��/�. ������� ����� ����� ��������� �� ���� ����?");
		
		// 1
		System.out.println("");
		System.out.println("1) v1 + v2 = v3");
		System.out.println("������� �������� v1:");
		v1 = console.nextDouble();
		System.out.println("������� �������� v2:");
		v2 = console.nextDouble();
		v3 = v1 + v2;
		System.out.println("v3 ����� �����:");
		System.out.println(v3);
		System.out.println("");
		
		//2
		System.out.println("");
		System.out.println("2) v1 � v2 = v4");
		System.out.println("�������� v1 �������");
		System.out.println("�������� v2 �������");
		v4 = v1 - v2;
		System.out.println("v4 ����� �����:");
		System.out.println(v4);
		System.out.println("");
		
		//3
		System.out.println("");
		System.out.println("3) s1 : v4 = h1");
		System.out.println("������� �������� s1:");
		s1 = console.nextDouble();
		System.out.println("�������� v4 �������");
		h1 = s1 / v4;
		System.out.println("h1 ����� �����:");
		System.out.println(h1);
		System.out.println("");
		//4
		System.out.println("4) s2 : v3 = h2");
		System.out.println("������� �������� s2:");
		s2 = console.nextDouble();
		System.out.println("�������� v3 �������");
		h2 = s2 / v3;
		System.out.println("h2 ����� �����:");
		System.out.println(h2);
		//5
		System.out.println("5) h1 + h2 = h");
		h = h1 + h2;
		System.out.println("h ����� �����:");
		System.out.println(h);
		System.out.println("--");
		//Answer
		//asw1
		System.out.println("");
		System.out.print("1) ");
		System.out.print(v1);
		System.out.print(" + ");
		System.out.print(v2);
		System.out.print(" = ");
		System.out.print(v3);
		System.out.print(" (��/�)");
		//asw2
		System.out.println("");
		System.out.print("2) ");
		System.out.print(v1);
		System.out.print(" - ");
		System.out.print(v2);
		System.out.print(" = ");
		System.out.print(v4);
		System.out.print(" (��/�)");
		//asw3
		System.out.println("");
		System.out.print("3) ");
		System.out.print(s1);
		System.out.print(" : ");
		System.out.print(v4);
		System.out.print(" = ");
		System.out.print(h1);
		System.out.print(" (�)");
		//asw4
		System.out.println("");
		System.out.print("4) ");
		System.out.print(s2);
		System.out.print(" : ");
		System.out.print(v3);
		System.out.print(" = ");
		System.out.print(h2);
		System.out.print(" (�)");
		//asw5
		System.out.println("");
		System.out.print("5) ");
		System.out.print(h1);
		System.out.print(" + ");
		System.out.print(h2);
		System.out.print(" = ");
		System.out.print(h);
		System.out.print(" (�)");
		//aswfin
		System.out.println("");
		System.out.print("�����: ");
		System.out.print(h);
	}
}
