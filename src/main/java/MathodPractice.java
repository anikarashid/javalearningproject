public class MathodPractice {

    public static void main(String[] args) {
    sum();
    System.out.println("this is from sum1 mathod >>>"+sum1());
    System.out.println("this is from ball mathod >>>"+ball());
    System.out.println("this is from ball2 mathod >>>"+ball1());
    System.out.println("this is from one mathod >>>"+one( 50,100));
    }

public static void sum(){
    int a=5;
    int b=6;
    int c=a+b;
    System.out.println("this is from sum mathod >>>"+c);

    }

public static int sum1(){
    int i=2;
    int j=4;
    int k=i+j;
    return k;
}
public static boolean ball(){
    long l=5;
    int m=5;
    if(l==m){
      return true;
    }else {
        return false;
    }
 }
public static boolean ball1(){
    int i=5;
    long g=15;
    if(i==g) {
        return true;
    }else{
        return false;
    }

    }
    public static int one(int x,int y){
      int s=x+y;
      return s;

    }


}


