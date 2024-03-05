public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;
        //redondear hacia arriba
        System.out.println(Math.ceil(x));
        //redondear hacia abajo
        System.out.println(Math.floor(x));
        //número elevado a una potencia
        System.out.println(Math.pow(y, 2));
        //raíz cuadrada
        System.out.println((int) Math. sqrt(y));
        //Número mayor
        System.out.println(Math.max(x,y));
        //area de un circulo
        //pi*r2
        System.out.println(Math.PI * Math.pow(y, 2));
        //Area de una esfera
        //4*pi*r2
        System.out.println(4 * Math.PI * Math.pow(y, 2));
        //Volumen de una esfera
        //(4/3)*pi*r3
        System.out.println((4/3) * Math.PI * Math.pow(y, 3));
    }
}
