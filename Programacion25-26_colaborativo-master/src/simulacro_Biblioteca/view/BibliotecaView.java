package simulacro_Biblioteca.view;

import simulacro_Biblioteca.controller.BibliotecaController;

/**
 * Tiene la responsabilidad de interactuar con el usuario (sout y scanner)
 */
public interface BibliotecaView {
    //private BibliotecaController controller;

    public void setController(BibliotecaController controller);
    /*{
        this.controller = controller;
    }

     */

    public void mostrarOpciones();

    public void seleccionarOpcion();
}
