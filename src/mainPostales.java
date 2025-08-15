public class mainPostales {
    public static void main(String[] args) {//Clase main la cual mas abajo mandamos llamar el metodo de imprimir
        codigoPostal archivo = new codigoPostal();//Objeto de la clase codigo postal

        archivo.imprimirResultado();//objeto que manda llamar el metodo publico de imprimir

        /*Nota: Coloque el metodo de leer archivo y el hasmap principal como privado para que solamente se pudiera acceder
        desde imprimir resultado, la impresion es publica
        * */



        /*OBJETIVO:
        Crear un programa en java que cumpla con el siguiente objetivo:
        •	El programa busca recopilar el total de colonias que pertenecen a un mismo código postal, a partir de una
        serie de datos proporcionados provenientes de un archivo csv.

        •	Posteriormente se debería imprimir el código postal con su respectiva cantidad de colonias asociadas a él.
        FORMATO DE LOS DATOS:
        En el formato de los datos proporcionados se aprecia que el código postal aparece al inicio y posteriormente
        se muestra la colonia que forma parte de ese código postal.
        [Código Postal, Colonia].

        REQUERIMIENTOS
        •	Recopile todas las colonias que pertenecen a un código postal
        •	Impresión del código postal acompañado de el numero de colonias que tiene.En el siguiente formato:
              [Código postal - Número de asentamientos]

        CONFLICTOS
        Durante este practica se presentaron una serie de conflictos, entre lo teórico, practico,
        la gestión del tiempo.

        Por parte de lo teórico fue básicamente los conocimientos requeridos para realizar el programa, ya que, si bien
        mis conocimientos previos fueron de mucha ayuda , requerí hacer un pequeño repaso en cuanto al manejo de archivos, así como también la incorporación
        de nuevos conceptos como lo fue el uso del hasmap, dediqué tiempo a investigar para saber cómo utilizarlo e implementarlo.

        En cuanto a lo práctico, fue que al no estar tan familiarizada con la estructura hasmap, me costó el entender como ingresar la columna de los códigos
        postales y posteriormente que al imprimirla los resultados aparecían en desorden. También fue un poco difícil pero mucho más sencillo de resolver,
        la lectura del archivo, ya que en varias ocasiones el programa lanzaba error , al no encontrar el archivo en la ruta mencionada.

        DISTRIBUCION DE TIEMPOS
        •	Lectura del problema  20 minutos
        •	Análisis, extracción de requerimientos y pautas de entrega  1hrs
        •	Forma en la que pensaba desarrollar el sistema  1hrs ya que había extraído los requerimientos.
        •	Repaso e investigación de nuevos conceptos.   4hrs repartidas durante el día, a partir de las 2:30 pm.
        •	Código  6 hrs también distribuidas a partir de las 10 pm a 12 am y posteriormente de 3 am a 6 am para terminar
            de pulir detalles faltantes en cuanto a teoría y resolución de problemas.
        •	Pruebas  2hr de 6 am a 8 am, esto ya fue lo último, aunque también hubo pruebas mientras realizaba el código para
            verificar que hasmap estaba guardando bien los datos.
        CONCLUSION
        Puedo decir que esta práctica fue útil en cuanto a repaso e incorporación de nuevos conocimientos,
        me ayudó mucho para un mejor manejo de archivos, ya que como mencione ya había utilizado antes,
        aun había y hay falta de práctica, pero el ya incorporar una nueva estructura como lo fue el
        hasmap me dio un mejor manejo de estos. Así mismo también me dio la oportunidad de practicar aun
        mas el uso de los métodos para programación orientada objetos. Entonces puedo concluir que en
        primera instancia represento un reto ante la búsqueda de nuevo conocimiento, pero dio como resultado
        el aterrizar y repasar los conocimientos que ya tenía.
         */

    }
}
