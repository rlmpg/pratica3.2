
public class Pratica32 {
    public static void main(String[] args) {
        System.out.println(densidade(-1,67,3));
    }
    
    public static double densidade(double x, double media, double desvio) {
        double d;
        d = Math.exp(-0.5*Math.pow((x-media)/desvio,2))/(Math.sqrt(2*Math.PI)*desvio);
        return d;
    }
}