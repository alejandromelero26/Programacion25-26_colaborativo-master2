package simulacro_Biblioteca;

import simulacro_Biblioteca.controller.BibliotecaController;
import simulacro_Biblioteca.model.*;
import simulacro_Biblioteca.view.BibliotecaView;

public class Main {

    public static void main(String[] args) {
        // 1º
        BibliotecaView view = new BibliotecaView();
        BibliotecaModel model = new BibliotecaModel();
        // 2º
        BibliotecaController controller = new BibliotecaController(model, view);

        // view.setController(controller); Le quitamos esta responsabilidad al Main y se la damos al propio controlador












        BibliotecaConPredicados bibliotecaConPredicados = new BibliotecaConPredicados();


        Libro quijote = new Libro(1, "Quijote", "Cervantes", TipoPrestamo.DOMICILO, 660 );
        Libro manual = new Libro(2, "Manual", "Víctor", TipoPrestamo.DOMICILO, 1660 );

        Revista muy = new Revista(3, "Muy Interesante", "Varios", TipoPrestamo.SALA, 5);
        Revista gta6 = new Revista(4, "Ge Te A Seis", "Varios", TipoPrestamo.DOMICILO, 3);

        bibliotecaConPredicados.addRecurso(quijote);
        bibliotecaConPredicados.addRecurso(manual);
        bibliotecaConPredicados.addRecurso(muy);
        bibliotecaConPredicados.addRecurso(gta6);

        /*
        System.out.println( biblioteca.buscar(4) ); // gta6
        System.out.println( biblioteca.buscar("Quijote") );
        System.out.println( biblioteca.buscar(TipoPrestamo.DOMICILO) );
        */

        // imprimirRecursos(biblioteca);

        System.out.println( bibliotecaConPredicados.listarTipoRecurso(Libro.class));
    }

    /**
     * Llama a los diferentes tipos de métodos de listado de Biblioteca, para imprimirlos
     */
    private static void imprimirRecursos(BibliotecaConPredicados bibliotecaConPredicados) {

        System.out.println( bibliotecaConPredicados.listarTodos());

        System.out.println( bibliotecaConPredicados.listarPorTipoPrestamo(TipoPrestamo.DOMICILO));

        System.out.println( bibliotecaConPredicados.listarPorTipoPrestamo(TipoPrestamo.SALA));

        System.out.println( bibliotecaConPredicados.listarLibros());

        System.out.println( bibliotecaConPredicados.listarRevistas());

    }
}
