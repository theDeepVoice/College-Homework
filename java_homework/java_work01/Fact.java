package java_work01;
public class Fact {
    public static void function(int n){
        long s = 1;
        int i = 1;
        Fact f = new Fact();
        while( n > i){
            s = f.fact(i);
            System.out.println(""+i+"的阶乘为："+ s);
            i++;
        }
    }
    private long fact(int n){
        if (n == 1){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }

    public static void main(String[] args) {
        Fact f = new Fact();
        f.function(30);
    }
}
