/*CODIGO DE CODIGO POSTAL- BASE DE DATOS 1*/

import java.io.*;//Paquete utilizado para la excepion
import java.util.*;//Paquete utilizado para poder hacer uso de las estructuras hasmap y sus metodos.
public class codigoPostal {
    private HashMap<String, Integer> codigosPostales = new HashMap<>();
    /*En el hasmap se va a guardar los codigos postales*/

    private void lectorArchivo(String ruta){//Metodo para leer el archivo y almacenarlo en en el hasmap
        /*Metodo que se encarga de leer el archivo que fue proporcionado .csv */
        String lectura;
        try {
            BufferedReader rd = new BufferedReader(new FileReader(ruta));//Lector
            while((lectura = rd.readLine()) != null){//La condicion de while quiere decir que

                String []codigosP = lectura.split(",");
                /*Array en el cual se guardaban los datos que iban guardando las columnas del archivo csv separadas.*/
                String codigo = codigosP[0];
                /*Cadena de caracter que almacena la posicion inicial del array anterios , cadena que posteriormente
                almacenara en las estructura hasmap.
                 */

                codigosPostales.put(codigo,codigosPostales.getOrDefault(codigo,0)+1);
                /*Linea en la cual se agrega el codigo postal y el numero de repeticiones que este tiene a lo largo del array.*/

            }
        } catch (IOException e) {//Excepcion
            e.printStackTrace();//Linea que se encuentra para imprimir
        }

    }

    public void imprimirResultado(){//Metodo para imprimir el resultado
        lectorArchivo("C:\\postales.csv");//Ruta en la cual se encuentra el archivo csv
        Map<String, Integer> codigoOrdenado = new TreeMap<>(codigosPostales);//Hasmap creado para organizar la estructura anterior
        for (Map.Entry<String, Integer> entry : codigoOrdenado.entrySet()) {//For que sirvio para ordenar los datos de menor a mayor en el nuevo hasmap.
            System.out.println("CP: " + entry.getKey() + "-Numero de asentamientos: " + entry.getValue());
            //Impresion de los datos en los cuales se muestra el codigo postal, es decir el identificador y la cantidad de colonias que estan asociadas a este
        }
    }

}
