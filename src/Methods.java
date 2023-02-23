import javax.swing.*;

public class Methods {

    public static double campoFutbolCuñado(Double m2) {


        /**  Segun un numero de m2,  la  calculadoracuñada te  calcula cuantos campos de futbol son  **/



        /* Esto es lo que suele medir en metros cuadrados un campo */
        Double unCampoFutbol = 9.000;
        /* Calculamos la equivalencia en campos de futbol, con los metros cuadrados que pedimos y los que tiene un campo*/
        double CalculoCuñado = m2 / unCampoFutbol;
        /* Imprimimos resultado */
        System.out.println("Estos serian los campos de futbol que tienes chaval, espabila un poco : " + CalculoCuñado);

        return CalculoCuñado;
    }


    public static double jubilacionCuñada(double mesesTrabajados) {


        /** Para calcular, la jubilacion de un cuñado, la calculadora pide el número de meses trabajados
         y se lo resta al número de meses al que se suele jubilar    **/

        /* Estos son todos los meses que debemos trabajar para la jubilacion*/
        double mesesCotizados = 480;
        /*Se hace la equivalecia dividiendo los meses que he trabajado entre los que tengo que trabajar aun   */
        double calculoJubilacion = mesesCotizados / mesesTrabajados;

        System.out.println("Sobrino estos son los meses que te quedan para que te de la chapa todos los dias : " + calculoJubilacion);

        return calculoJubilacion;
    }

    public static double librosCuñado(double librosLeidos) {


        /** Los libros de arturo perez reverte, en este metodo vamos a realizar una equivalencia de un número,
         de libros que hemos leido entre el total de libros de arturo perez reverte **/

        /* Todos los libros de Arturo Perez Reverte */
        int librostotales = 479;
        /* Operacion para hallar la equivalencia hacemos una division del número de libros que hemos leido entre los de arturo   */
       double librosQueQuedan = librosLeidos / librostotales;
        /*Imprimimos el resultado */
        System.out.println("Y estos esta es la equivalencia en libros de Arturito : " + librosQueQuedan);
        return librosQueQuedan;

    }

    public static double gasolinaCuñada(double gasolinaCoche) {


        /**para acabar, tendriamos un cálculo comparando donde cojemos la gasolina,
         *y donde la coje nuestro cuñado para ver la diferencia **/

        /* Este es el precio de la gasolina de nuestro cuñado */
        double precioGasolinaCuñado = 1.395;

        /*  Esta es la diferencia de donde cojemos la gasolina nosotros y donde la coje nuestro cuñado*/
        double calculoGasolina = gasolinaCoche - precioGasolinaCuñado;
        /* Imprimimos el resultado con frase cuñada */
        System.out.println("No tienes ni idea, la gasolina mas barata esta aqui mira que gran diferencia : " + calculoGasolina);

        return calculoGasolina;
    }


}
