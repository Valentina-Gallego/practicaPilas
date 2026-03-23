import java.util.Scanner;
import java.util.Stack;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();
        Stack<objPaginaWeb> p = new Stack<>();
        boolean seguir = true;
        while (seguir) {
            int opt = m.menu(sc);

            switch (opt) {
                case 1:
                    m.LLenarPila(p, sc);
                    break;

                case 2:
                    m.MostrarPila(p);
                    break;

                case 3:
                    m.Retroceder(p);
                    break;

                case 4:
                    System.out.println("SALIENDO.....");
                    seguir = false;
                    break;

                default:
                    System.out.println("INGRESE UNA OPCION DEL MENU");
                    break;
            }
        }

    }
}
