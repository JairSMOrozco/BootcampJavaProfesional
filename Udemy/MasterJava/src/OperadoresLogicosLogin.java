import java.sql.Array;
import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        String[] userNames = new String[3];
        userNames[0] = "jair";
        userNames[1] = "admin";
        userNames[2] = "pepe";

        String[] passwords = new String[3];
        passwords[0] = "123";
        passwords[1] = "12345";
        passwords[2] = "123";

        boolean isAuth = false;

        Scanner mySCanner = new Scanner(System.in);

        System.out.println("Ingrese usuario");
        String user = mySCanner.nextLine();

        System.out.println("Ingrese password");
        String pass = mySCanner.nextLine();

        for(int i = 0; i < userNames.length; i++){
            if (userNames[i].equals(user) && passwords[i].equals(pass)){
                isAuth = true;
                break;
            }
        }

        if(isAuth){
            System.out.println("Inicio de sesión exitoso.");
            System.out.println("Bienvenido ".concat(user));
        }else {
            System.out.println("Usuario y/o contraseña incorrectos");
        }

    }
}
