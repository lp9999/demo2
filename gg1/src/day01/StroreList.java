package day01;

public class StroreList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("--------商城库存清单--------");
System.out.println("品牌型号 　　尺寸 　　　价格 　　　配置　　　 库存");
double size=13.3;
double price=6988.88;
int total=5;
System.out.println("MacBookAir" + size + price + "i5处理器4GB内存128G内存" + total);
double size1=13.3;
double price1=59999.99;
int total1=10;
System.out.println("MacBookAir" + size1 + price1 + "i5处理器4GB内存500G内存" + total1);
double size2=13.3;
double price2=6988.88;
int total2=5;
System.out.println("MacBookAir" + size2 + price2 + "i5处理器4GB内存128G内存" + total2);

System.out.println("总库存" + total+total1 +total2);

	}

}
