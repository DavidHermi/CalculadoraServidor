import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocket;
import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            System.out.println("Servidor");


            System.out.println("Creando socket servidor");
            //Creamos el socket del servidor
            ServerSocket serverSocket = new ServerSocket();
            // Realizamos el bind
            System.out.println("Realizando el bind");
            InetSocketAddress addr = new InetSocketAddress("localhost", 5555);
            serverSocket.bind(addr);

            //Esperamos a que una conexion del cliente llege
            System.out.println("Aceptando conexiones");
            Socket newSocket = serverSocket.accept();

            //Recibimos las conexion
            System.out.println("Conexion recibida");

            //Instanciamos objeto is de la clase Input, porque vamos a recibir
            //un dato del Cliente
            InputStream is = newSocket.getInputStream();
            // Instanciamos objeto de datasource  para poder recibir datos que no sean bytes
            DataInputStream eis = new DataInputStream(is);
            //Instanciamos objeto de la clase outputStream para enviar en este
            // caso las operaciones con los resultados que va a recibir el cliente
            OutputStream os = newSocket.getOutputStream();
            // Instanciamos objeto dataSource para devolver datos que no sean byte
            DataOutputStream sos = new DataOutputStream(os);
            // variabe boolean para el bucle mientras sea true el bucle sigue
            boolean conexion = true;

            //Println para indicar que comenzamos hacer los calculos en el menu
            System.out.println("Haciendo las operaciones");
            // Inicilizamos el bucle con el boolean
            while (conexion) {
                // variable mensaje para recibir el dato del cliente
                int mensaje = eis.readInt();
                //Recibimos el dato del ciente
                System.out.println("Mensaje  recibido: "+ mensaje);
                //variable numeró double, porque vamos a devolver un double al cliente,
                //ya que las operaciones están hechas con esta variable
                double numero = eis.readDouble();
                //instanciamos el menu
                switch (mensaje) {

                    case 1 -> {
                        //llamamos al la clase methods ya hecho en la clase methods,
                        // y le damos la variable número que va ser enviada al cliente
                      sos.writeUTF((Methods.campoFutbolCuñado(numero)));


                    }

                    case 2 -> {
                        //llamamos al la clase methods ya hecho en la clase methods,
                        // y le damos la variable número que va ser enviada al cliente
                        sos.writeUTF(Methods.jubilacionCuñada(numero));


                    }

                    case 3 -> {
                        //llamamos al la clase methods ya hecho en la clase methods,
                        // y le damos la variable número que va ser enviada al cliente
                        sos.writeUTF(Methods.librosCuñado(numero));

                    }

                    case 4 -> {
                        //llamamos al la clase methods ya hecho en la clase methods,
                        // y le damos la variable número que va ser enviada al cliente
                        sos.writeUTF(Methods.gasolinaCuñada(numero));
                    }


                    case 5 -> {
                        //bolean false para acabar el buclle
                        conexion = false;
                   }
                }

            }
            //Printl de que vamos cerrar el socket
            System.out.println("Cerrando el socket");
            //Cerramos el socket
            newSocket.close();
            // Printl avisando de que vamos a cerrar el socket del servidor
            System.out.println("Cerrando el socket servidor");
            //Cerramos socket Servidor
            serverSocket.close();
            //Acabamos
            System.out.println("Se acabo");
        } catch (IOException ignored) {
        }
    }
}

