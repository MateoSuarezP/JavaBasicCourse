public class WhileLoop {

   static boolean isturnonlight = false;
    public static void main(String[] args) {
        turnOnOfLight();
        int i=1;
        while (isturnonlight && i <= 10){
            printSOS();
            i++;
        }

    }
    public static void printSOS(){
        System.out.println("...___...");
    }
    public static boolean turnOnOfLight(){
        isturnonlight = (isturnonlight)?false:true;
        return isturnonlight;
    }
}
