package utilitarios;

public class Calc {

    public static final double IOF = 6.0;

    public static double conversor(double dolar, double quantidade){
        double valor = dolar * quantidade;
        
        return valor += valor * IOF /100;
    }

}