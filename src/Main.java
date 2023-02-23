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
            OutputStream os = newSocket.getOutputStream();
            DataInputStream eis = new DataInputStream(is);
            DataOutputStream sos = new DataOutputStream(os);
            boolean conectado = true;


            System.out.println("Haciendo las operaciones");

            while (conectado) {

                double numero = eis.readDouble();
                System.out.println("Numero recibido: "+ numero);
                switch (numero) {

                    case 1 -> {

                        os.write( Methods.campoFutbolCuñado(numero));


                    }

                    case 2 -> {


                    }

                    case 3 -> {

                    }

                    case 4 -> {
                    }


                    case 5 -> {
                        conectado = false;
                   }
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

