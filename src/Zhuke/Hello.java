package Zhuke;

public class Hello {
public static void main(String [] args){
    System.out.print("Hello World!");
    System.out.print("Бул зертханалык жумыстын максаты");
    System.out.print("GitGup- пен жумыс жасап уйрену");
    int a= MyMath.kvadrat( 5);
    int b=MyMath.kup( 5) ;
    System.out.print("a = " + a);
    System.out.print("b = " + b);
    System.out.print(MyMath.max3(8,9, 12));
    System.out.print(MyMath.min3(12,8,15));
}
}
