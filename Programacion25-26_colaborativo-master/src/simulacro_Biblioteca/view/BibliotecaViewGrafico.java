package simulacro_Biblioteca.view;

import simulacro_Biblioteca.controller.BibliotecaController;

public class BibliotecaViewGrafico implements BibliotecaView {
    private BibliotecaController controller;

    @Override
    public void setController(BibliotecaController controller) {
        this.controller = controller;
    }
}
