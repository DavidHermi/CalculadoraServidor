import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocket;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            System.out.println("Servidor");


            System.out.println("Creando socket servidor");

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

            InputStream is = newSocket.getInputStream();


            byte[] mensaje = new byte[1];
            is.read(mensaje);
            int opcion = Integer.parseInt(new String(mensaje));
            System.out.println("Mensaje recibido: " + new String(mensaje));


            System.out.println("Haciendo las operaciones");

            switch (opcion) {

                case 1 -> {

                    Methods.campoFutbolCuñado();


                }

                case 2 -> {

                    Methods.jubilacionCuñada();


                }

                case 3 -> {
                    Methods.librosCuñado();
                }

                case 4 -> {
                    Methods.gasolinaCuñada();



                }


                case 5 -> {


                }
            }
            System.out.println("Cerrando el socket");
            newSocket.close();
            System.out.println("Cerrando el socket servidor");
            serverSocket.close();
            System.out.println("Terminado");
        } catch (IOException ignored) {
        }
    }
}
