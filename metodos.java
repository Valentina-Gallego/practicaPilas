import java.util.Scanner;
import java.util.Stack;

public class metodos {
    Scanner sc = new Scanner(System.in);

    public int menu(Scanner sc){
        int opt = 0;

        System.out.println("INGRESE LA OPCION QUE DESEA REALIZAR");
        System.out.println("1. INGRESAR A PAGINAS WEB");
        System.out.println("2. VER HISTORIAL");
        System.out.println("3. RETROCEDER");
        System.out.println("4. SALIR");
        opt = sc.nextInt();
        return opt;

    }

    public int ValidarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Por favor digite un numero");
            sc.nextLine();
        }
        return sc.nextInt();
    }

    public Stack<objPaginaWeb> LLenarPila() {
        Stack<objPaginaWeb> p = new Stack<>();
        metodos m = new metodos();
        boolean pedir = true;
        int opt = 0;
        while (pedir) {
            objPaginaWeb o = new objPaginaWeb();
            System.out.println("Ingrese la URL ");
            o.setUrl(sc.next());
            p.push(o);

            System.out.println("Ingrese el titulo ");
            o.setTitulo(sc.next());
            p.push(o);

            System.out.println("Ingrese la fecha ");
            o.setFecha(sc.nextInt());
            p.push(o);
            System.out.println("desea continuar 1) si , 2) no");
            opt = m.ValidarEntero(sc);
            if (opt == 2) {
                pedir = false;
            }
        }
        return p;
    }

    public void MostrarPila(Stack<objPaginaWeb> p) {
        for (objPaginaWeb o : p) {
            System.out.print(" - " + o.getUrl());
            System.out.println(" - " + o.getTitulo());
            System.out.println(" - " + o.getFecha());
        }
    }

    public void Retroceder(Stack<objPaginaWeb> p){
      while (!p.isEmpty()) {
        p.peek();
        p.pop();
      }
    }

}
