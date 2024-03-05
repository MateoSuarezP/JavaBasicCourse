public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnable = true;
        int fileSended = 3;

        if (isBluetoothEnable){
            //Send File
            fileSended++;
            System.out.println("Archivo enviado");
        }else {
            fileSended--;
            System.out.println("Enciende el bluetooth para iniciar la transferencia de archivos");
        }
        System.out.println(fileSended);
    }
}
