package Work.second_homework;

public class Complex {
    double x=0;
    double y=0;

    public Complex(){

    }

    public Complex(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Complex(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String getComplex(){
        return x+"+"+y+"i";
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }


}
