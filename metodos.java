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

public void LLenarPila(Stack<objPaginaWeb> p, Scanner sc) {
    boolean pedir = true;
    int opt = 0;

    while (pedir) {
        objPaginaWeb o = new objPaginaWeb();

        sc.nextLine(); // limpiar buffer

        System.out.println("Ingrese la URL ");
        o.setUrl(sc.nextLine());

        System.out.println("Ingrese el titulo ");
        o.setTitulo(sc.nextLine());

        System.out.println("Ingrese la fecha ");
        o.setFecha(sc.nextInt());

        p.push(o);

        System.out.println("¿Desea continuar? 1) Si, 2) No");
        opt = ValidarEntero(sc);

        if (opt == 2) {
            pedir = false;
        }
    }
}
public void MostrarPila(Stack<objPaginaWeb> p) {
    if (p.isEmpty()) {
        System.out.println("No hay historial");
        return;
    }

    System.out.println("HISTORIAL:");

    for (objPaginaWeb o : p) {
        System.out.println("URL: " + o.getUrl());
        System.out.println("Titulo: " + o.getTitulo());
        System.out.println("Fecha: " + o.getFecha());
        System.out.println("----------------------");
    }
}
  /*  public void MostrarPila(Stack<objPaginaWeb> p) {
        for (objPaginaWeb o : p) {
            System.out.print(" - " + o.getUrl());
            System.out.println(" - " + o.getTitulo());
            System.out.println(" - " + o.getFecha());
        }
    }
*/
   /* public void Retroceder(Stack<objPaginaWeb> p){
      while (!p.isEmpty()) {
        p.peek();
        p.pop();
      }*/

    public void Retroceder(Stack<objPaginaWeb> p) {
    if (p.isEmpty()) {
        System.out.println("No hay paginas para retroceder");
        return;
    }

    p.pop();

    System.out.println("Se retrocedio una pagina");

    if (!p.isEmpty()) {
        System.out.println("Pagina actual:");
        System.out.println(p.peek().getTitulo());
    } else {
        System.out.println("No hay paginas abiertas");
    }
}    
}
