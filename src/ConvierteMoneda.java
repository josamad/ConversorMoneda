import java.util.Scanner;
public class ConvierteMoneda {
    public static void convertir(String monedaBase, String monedaObjetivo, ConsultaMoneda consulta, Scanner lectura){
        double cantidad;
        double cantidadConvertida;

        Moneda moneda = consulta.buscaMoneda(monedaBase, monedaObjetivo);
        System.out.println("El tipo de cambio para hoy\n1 "+monedaBase+ " = "+ moneda.conversion_rate()+" "+monedaObjetivo);
        System.out.println("Ingrese la cantidad de "+ monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad* moneda.conversion_rate();
        System.out.println(cantidad+" "+monedaBase + " = "+ cantidadConvertida + " " + moneda.target_code());
    }
    public static void convertirOtraMoneda(ConsultaMoneda consulta, Scanner lectura){
        System.out.println("Ingrese el codigo de la moneda base: ");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese la moneda objetivo: ");
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        convertir(monedaBase, monedaObjetivo, consulta, lectura);
    }
}