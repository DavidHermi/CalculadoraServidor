import javax.swing.*;

public class Methods {

    public void campoFutbolCuñado() {


        /**  Segun un numero de m2,  la  calculadoracuñada te  calcula cuantos campos de futbol son  **/

        /* el cuñado pide los m2 a quien sea (nosotros por ejemplo)   */
        Double m2 = (double) Integer.parseInt(JOptionPane.showInputDialog(" Chaval dame los m2 que quieras que yo te digo cuantos campos de futbol son: "));
        /* Esto es lo que suele medir en metros cuadrados un campo */
        Double unCampoFutbol = 9.000;
        /* Calculamos la equivalencia en campos de futbol, con los metros cuadrados que pedimos y los que tiene un campo*/
        double CalculoCuñado = m2 / unCampoFutbol;
        /* Imprimimos resultado */
        System.out.println("Estos serian los campos de futbol que tienes chaval, espabila un poco : " + CalculoCuñado);

    }


    public void jubilacionCuñada() {


        /** Para calcular, la jubilacion de un cuñado, la calculadora pide el número de meses trabajados
         y se lo resta al número de meses al que se suele jubilar    **/
        /* el cuñado le dice los meses que ha trabajado a su jefe   */
        double mesesTrabajados = Integer.parseInt(JOptionPane.showInputDialog(" Jefe estos son los meses que me llevas dando la chapa: "));
        /* Estos son todos los meses que debemos trabajar para la jubilacion*/
        double mesesCotizados = 480;
        /*   */
        double calculoJubilacion = mesesCotizados / mesesTrabajados;

        System.out.println("Sobrino estos son los meses que te quedan para que te de la chapa todos los dias : " + calculoJubilacion);


    }

    public void librosCuñado() {


        /** Los libros de arturo perez reverte, en este metodo vamos a realizar una equivalencia de un número,
         de libros que hemos leido entre el total de libros de arturo perez reverte **/
        /* Libros leidos por tu persona, en comparacion con los de Arturo Perez Reverte */
        int librosLeidos = Integer.parseInt(JOptionPane.showInputDialog(" Mira estos son los libros que e leido: "));

        /* Todos los libros de Arturo Perez Reverte     */
        int librostotales = 479;


        /* Operacion para hallar la equivalencia hacemos una division del número de libros que hemos leido entre los de arturo   */
        int librosQueQuedan = librosLeidos / librostotales;
        /*Imprimimos el resultado */
        System.out.println("Y estos esta es la equivalencia en libros de Arturito : " + librosQueQuedan);


    }

    public void gasolinaCuñada() {


        /**para acabar, tendriamos un cálculo comparando donde cojemos la gasolina,
         *y donde la coje nuestro cuñado para ver la diferencia **/
        /* Este el precio de donde nosotros cojemos la gasolina */
        double gasolinaCoche = Integer.parseInt(JOptionPane.showInputDialog(" Mira cuñado aqui pillo yo la Gasolina, barata ehhh: "));

        /* Este es el precio de la gasolina de nuestro cuñado */
        double precioGasolinaCuñado = 1.395;

        /*  Esta es la diferencia de donde cojemos la gasolina nosotros y donde la coje nuestro cuñado*/
        double calculoGasolina = gasolinaCoche - precioGasolinaCuñado;
        /* Imprimimos el resultado con frase cuñada */
        System.out.println("No tienes ni idea, la gasolina mas barata esta aqui mira que gran diferencia : " + calculoGasolina);


    }


}
