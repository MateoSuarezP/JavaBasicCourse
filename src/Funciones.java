public class Funciones {
    public static void main(String[] args) {
        double y = 3;
        //area de un circulo
        //pi*r2
        circleArea(y);
        //Area de una esfera
        //4*pi*r2
        sphereArea(y);
        //Volumen de una esfera
        //(4/3)*pi*r3
        sphereVolume(y);

        System.out.println("Peso a dolares: " +converToDolar(390000, "COP"));
    }
    /**
     * Descripción: Función que permite hallar el area de un circulo especificando su radio.
     * @param r Radio del circulo
     * */
    public static double circleArea (double r){
        return Math.PI * Math.pow(r, 2);
    }
     /** Descripción: Función que permite hallar el de una esfera especificando su radio.
     * @param r Radio de la esfera
     * */
    public static double sphereArea (double r){
        return 4 * Math.PI * Math.pow(r, 2);
    }
    /** Descripción: Función que permite hallar el volúmen de una esfera especificando su radio.
     * @param r Radio de la esfera
     * */
    public static double sphereVolume (double r){
        return (4/3) * Math.PI * Math.pow(r, 3);
    }

    /**
     * Descripción: Función que, especificando su moneda,convierte una cantidad de dinero en dolares
     *
     * @param quantity Cantidad dinero
     * @param currency Tipo de moeda (solo acepta MXN y COP
     * @return quantity devuelve la cantidad actualizada en dolares
     * */
    public static double converToDolar (double quantity, String currency) {
        //MXN COP
        switch (currency){
            case "MXN":
                quantity = quantity * 0.059;
                break;
            case  "COP":
                quantity = quantity * 0.00026;
                break;
        }
        return quantity;
    }

}