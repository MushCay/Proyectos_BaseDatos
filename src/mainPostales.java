public class mainPostales {
    public static void main(String[] args) {//Clase main la cual mas abajo mandamos llamar el metodo de imprimir
        codigoPostal archivo = new codigoPostal();//Objeto de la clase codigo postal

        archivo.imprimirResultado();//objeto que manda llamar el metodo publico de imprimir

        /*Nota: Coloque el metodo de leer archivo y el hasmap principal como privado para que solamente se pudiera acceder
        desde imprimir resultado, la impresion es publica
        * */
    }
}
