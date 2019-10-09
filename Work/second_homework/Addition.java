package Work.second_homework;

public class Addition {

        public void add(Object x, Object y){

            if(x instanceof Integer){
                if(y instanceof Integer){
                    Integer sum = ((Integer) x).intValue()+((Integer) y).intValue();
                    System.out.println(sum.intValue());
                }
            }

            if(x instanceof Complex){
                if(y instanceof Complex){
                    Complex sum = new Complex();
                    sum.x = ((Complex) x).getX() + ((Complex) y).getX();
                    sum.y = ((Complex) x).getY() + ((Complex) y).getY();
                    System.out.println(sum.getComplex());
                }
            }
        }


    public static void main(String[] args) {
        Addition a = new Addition();
        Complex m = new Complex(1, 5);
        Complex n = new Complex(2, 6);

        a.add(m, n);
    }

}
