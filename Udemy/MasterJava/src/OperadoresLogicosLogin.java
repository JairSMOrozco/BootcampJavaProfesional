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
            isAuth = userNames[i].equals(user) && passwords[i].equals(pass) ? true : isAuth;
        }

        String mensaje = isAuth ? "Inicio de sesión exitoso." + "\n" + "Bienvenido ".concat(user) :
                "Usuario y/o contraseña incorrectos";

        System.out.println(mensaje);

    }
}
