public class Matematico{
    private Calculadora cal = new Calculadora();
    public Matematico(){
    }
    
    public String obtenerValoresX(int a, int b, int c){        
        return cal.valoresX(a,b,c);
    }
    
    public String ecuacionRecta(int x1, int y1, int x2, int y2){
        return cal.ecuacionRecta(x1,y1,x2,y2);
    }
    
    public double cateto2(double hip, double cat){
        return cal.cateto2(hip,cat);
    }
    
    public int obtenerMayor(int num1, int num2, int num3){
        int mayor = 0;
        if(num1 > num2 && num1 > num3){
            mayor = num1;
        }
        else if(num2 > num1 && num2 > num3){
            mayor = num2;
        }
        else{
            mayor = num3;
        }
        return mayor;
    }
    
    public double area(double base, double altura){
        double area;
        area = base * altura;
        return area;
    }
    
    public double distancia(double x1, double y1, double x2, double y2){
        double distancia;
        distancia = Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
        return distancia;
    }
    
    public String obtenerCuadrante(int x, int y){
        String res = " ";
        if(x > 0 && y > 0){
            res = "El punto (" + x + ","+y+ ") se encuentra en el primer cuadrante";
        }
        else if(x < 0 && y > 0){
            res = "El punto (" + x + ","+y+ ") se encuentra en el segundo cuadrante";
        }
        else if(x < 0 && y < 0){
            res = "El punto (" + x + ","+y+ ") se encuentra en el tercer cuadrante";
        }
        else{
            res = "El punto (" + x + ","+y+ ") se encuentra en el cuarto  cuadrante";
        }
        return res;
    }    
}