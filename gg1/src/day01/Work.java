package day01;
import java.util.Scanner;
public class Work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("输入第一个数");
Scanner p= new Scanner(System.in);
int a=p.nextInt();
System.out.println("输入第二个数");
Scanner p1= new Scanner(System.in);
int b=p.nextInt();
Scanner p2= new Scanner(System.in);
char c = p.next().charAt(0);
switch(c){
case '+':
System.out.println("加法为" +(a + b));
break;
case '-':
System.out.println("减法为" +(a - b));
break;
case '*':
System.out.println("乘法为" +(a * b));
break;
case '/':
System.out.println("除法为" +(a / b));
break;
}
}
}
