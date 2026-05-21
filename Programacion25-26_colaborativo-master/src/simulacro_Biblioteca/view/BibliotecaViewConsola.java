package simulacro_Biblioteca.view;

import simulacro_Biblioteca.controller.BibliotecaController;
import simulacro_Biblioteca.model.TipoPrestamo;

import java.util.Scanner;

public class BibliotecaViewConsola implements BibliotecaView {
    private BibliotecaController controller;

    @Override
    public void setController(BibliotecaController controller) {
        this.controller = controller;
    }

    @Override
    public void mostrarOpciones() {
        mostrarMenu();
    }

    @Override
    public void seleccionarOpcion() {
        int opcion;
        Scanner sc = new Scanner(System.in);

        opcion = sc.nextInt();

        do {
            switch (opcion){
                case 1:
                    pedirDatosLibro();
                    break;
                case 2:
                    pedirDatosRevista();
                    break;
                case 3:
                    listarTodos();
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (opcion < 1 || opcion > 3 );

    }

    private void pedirDatosLibro() {
        int id;
        String titulo;
        String autor;
        TipoPrestamo tipoPrestamo;
        int numPaginas;


        id = leerNumeroEntero("Dime el id del libro: ");
        titulo = leerTexto("Dame el título del libro: ");
        autor = leerTexto("Dame el nombre del autor: ");
        tipoPrestamo = leerTipoPrestamo("Dame el tipo de préstamo: ");
        numPaginas = leerNumeroEntero("Dame el número de páginas: ");


    }

    private TipoPrestamo leerTipoPrestamo(String mensaje) {
        TipoPrestamo resultado = null;
        String leido;

        leido = leerTexto(mensaje);

        if( leido.equalsIgnoreCase(TipoPrestamo.DOMICILO.toString())){
            resultado = TipoPrestamo.DOMICILO;
        }
        else if( leido.equalsIgnoreCase(TipoPrestamo.SALA.toString())) {
            resultado = TipoPrestamo.SALA;
        }
        else {
            resultado = TipoPrestamo.SALA; // valor por defecto. TODO de momento
        }

        return resultado;
    }

    private int leerNumeroEntero(String mensaje){
        Scanner sc = new Scanner(System.in);
        int resultado;

        System.out.println(mensaje);
        resultado = sc.nextInt();

        return resultado;
    }

    private String leerTexto(String mensaje){
        Scanner sc = new Scanner(System.in);
        String resultado;

        System.out.println(mensaje);
        resultado = sc.nextLine();

        return resultado;
    }


    public void mostrarMenu(){
        System.out.println("Qué quieres hacer");
        System.out.println("1. Agregar libro");
        System.out.println("2. Agregar revista");
        System.out.println("3. Listar recursos");
    }


}
