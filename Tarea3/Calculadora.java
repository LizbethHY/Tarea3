public class Calculadora{
    public String valoresX(int a, int b, int c){
        String res = " ";
        double x1 = ((-b)+(Math.sqrt((Math.pow(b,2))-(4*a*c))))/(2*a);
        double x2 = ((-b)-(Math.sqrt((Math.pow(b,2))-(4*a*c))))/(2*a);
        res = "X1 = "+ x1 + "      X2 = "+ " "+  x2;
        return res;
    }
    public String ecuacionRecta(int x1, int y1, int x2, int y2){
        String res = " ";
        double a = (y2-y1);
        double b = (x2-x1);
        double c = b*(-y1);
        double d = a*(-x1);
        double e = -c+d;
        res = a+"x  "+"+("+-b+ "y) "+"+("+ e+")"+" = 0";
        return res;
    }
    public double cateto2(double hipotenusa, double cateto1){
        double res = 0.0;
        res = Math.sqrt((Math.pow(hipotenusa,2))-(Math.pow(cateto1,2)));
        return res;
    }
}