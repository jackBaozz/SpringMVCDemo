package test;

/**
 * Created by Vitelon on 2017/3/10.
 */
public class Demo1 {
    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        int c = 4;
        int d = 4;
        int i,j,k,l;
        i = a++;
        j = ++b;
        k = c--;
        l = --d;
        System.out.println("i = "+ i +",a ="+ a); //i=4, a=5
        System.out.println("j = "+ j +",b ="+ b); //j=5, b=5
        System.out.println("k = "+ k +",c ="+ c); //k=4, c=3
        System.out.println("l = "+ l +",d ="+ d); //l=3, d=3
        //++--运算符,在前时，是先增减再赋值；在后时，是先赋值再增减。
    }
}
