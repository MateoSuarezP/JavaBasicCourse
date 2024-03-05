public class LogicOperations {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        //operadores de asignación
        System.out.println("Es a igual a b? - " + (a == b));
        System.out.println("Es a diferente a b? - " + (a != b));

        //Operadores Relacionales
        System.out.println("Es a mayor que b? - " + (a > b));
        System.out.println("Es a menor que b? - " + (a < b));
        System.out.println("Es a mayor o igual que b? - " + (a >= b));
        System.out.println("Es a menor o igual que b? - " + (a <= b));

        if (a == b) {
            System.out.println("a igual que b");
        }else if ((a != b) && (a > b)) {
            System.out.println("a diferente que b");
        }else if (a > b) {
            System.out.println("a mayor que b");
        }else if (a < b) {
            System.out.println("a menor que b");
        }else if (a >= b) {
            System.out.println("a mayor o igual a b");
        } else if (a <= b) {
            System.out.println("a menor o igual a b");
        }
    }
}
