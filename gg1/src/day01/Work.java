package day01;
import java.util.Scanner;
public class Work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("�����һ����");
Scanner p= new Scanner(System.in);
int a=p.nextInt();
System.out.println("����ڶ�����");
Scanner p1= new Scanner(System.in);
int b=p.nextInt();
Scanner p2= new Scanner(System.in);
char c = p.next().charAt(0);
switch(c){
case '+':
System.out.println("�ӷ�Ϊ" +(a + b));
break;
case '-':
System.out.println("����Ϊ" +(a - b));
break;
case '*':
System.out.println("�˷�Ϊ" +(a * b));
break;
case '/':
System.out.println("����Ϊ" +(a / b));
break;
}
}
}
