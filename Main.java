public class Main {
    public static void main(String[] args) {
        int numeroIf = 0;
        compararNumero(numeroIf);
        bucleWhile();
        bucleDoWhile();
        bucleFor();
        validarEstacion("otoño");

    }
    //funcion que permite determinar si un numero es positivo, negativo o cero 0
    public static void  compararNumero(int numeroIf){
        if (numeroIf>0){
             System.out.println("la variable es positiva");
        } else if (numeroIf<0) {
            System.out.println("la variable es negativa");
        }else {
            System.out.println("la variable es 0 cero");
        }
    }
    //bucle while con numeroWhile menor que 3
    public static void bucleWhile(){
        int numeroWhile = 0;
        while (numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
    }
    //bucle Dowhile con numeroDoWhile menor que 3
    public static void bucleDoWhile(){
        int numeroDoWhile = 3;
       do {
           System.out.println(numeroDoWhile);
           numeroDoWhile++;
       }while (numeroDoWhile<3);
    }
    //bucle for con numeroFor menor que 3
    public static void bucleFor(){
        for (int numeroFor=0;numeroFor<3;numeroFor++){
               System.out.println(numeroFor);
        }
    }
    public static void validarEstacion(String estacion){
        switch (estacion){
            case "verano":
                System.out.println("estas en verano");
                break;
            case "otoño":
                System.out.println("estas en otoño");
                break;
            case "invierno":
                System.out.println("estas en invierno");
                break;
            case "primavera":
                System.out.println("estas en primavera");
                break;
            default:
                System.out.println("valor desconocido");
        }
    }
}