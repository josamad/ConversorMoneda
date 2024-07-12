import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();

        int opcion=0;
        while(opcion != 8){
            System.out.println("""
                    #####################################
                    Bienvenidos al conversor de moneda\s

                    Ingresa la conversion que deseas realizar

                    1. Dolar a Sol Peruano
                    2. Sol Peruano a Dolar
                    3. Dolar a Renminbi Chino
                    4. Renminbi Chino a Dolar
                    5. Dolar a Euro
                    6. Euro a Dolar
                    7. Convertir otra moneda
                    8. Salir""");

            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion) {
                case 1 -> ConvierteMoneda.convertir("USD", "PEN", consulta, lectura);
                case 2 -> ConvierteMoneda.convertir("PEN", "USD", consulta, lectura);
                case 3 -> ConvierteMoneda.convertir("USD", "CNY", consulta, lectura);
                case 4 -> ConvierteMoneda.convertir("CNY", "USD", consulta, lectura);
                case 5 -> ConvierteMoneda.convertir("USD", "EUR", consulta, lectura);
                case 6 -> ConvierteMoneda.convertir("EUR", "USD", consulta, lectura);
                case 7 -> ConvierteMoneda.convertirOtraMoneda(consulta, lectura);
                case 8 -> System.out.println("Finalizando...");
                default -> System.out.println("Opcion no valida");
            }

        }
    }
}
