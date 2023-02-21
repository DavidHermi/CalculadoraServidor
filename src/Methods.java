import javax.swing.*;

public class Methods {

    public void campoFutbolCuñado() {


        /**  Segun un numero de m2,  la  calculadoracuñada te  calcula cuantos campos de futbol son  **/

        Double m2 = (double) Integer.parseInt(JOptionPane.showInputDialog(" Chaval dame los m2 que quieras que yo te digo cuantos campos de futbol son: "));
        Double unCampoFutbol = 9.000;

        double CalculoCuñado = m2 / unCampoFutbol;
        System.out.println("Estos serian los campos de futbol que tienes chaval, espabila un poco : " + CalculoCuñado);

    }


    public void jubilacionCuñada() {


        /** Para calcular, la jubilacion de un cuñado, la calculadora pide el numero de meses trabajados
          y se lo resta al numero de años al que se suele jubilar    **/

       double mesesTrabajados = Integer.parseInt(JOptionPane.showInputDialog(" Jefe estos son los meses que me llevas dando la chapa: "));
       double mesesCotizados = 480 ;

      double calculoJubilacion = mesesCotizados / mesesTrabajados  ;

        System.out.println("Sobrino estos son los años  que te quedan para que  te de la chapa todos los dias : " +calculoJubilacion     );


    }

    public void librosCuñado() {


        /**    **/

        int librosLeidos = Integer.parseInt(JOptionPane.showInputDialog(" Mira estos son los libros que leido de Arturito: "));
        int librostotales = 479 ;

        int calculoJubilacion =l  ;

        System.out.println("Y estos son los libros que me quedan de su ilustrisimo : "      );


    }








}
