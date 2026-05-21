package fiesta;

import fiesta.controller.FiestaController;
import fiesta.controller.FiestaControllerInterface;
import fiesta.model.ColorEnum;
import fiesta.model.FiestaModel;
import fiesta.model.FiestaModelInterface;
import fiesta.view.FiestaConsoleView;
import fiesta.view.FiestaViewInterface;

public class Main {
    public static void main(String[] args) {
        FiestaModelInterface model = new FiestaModel();
        FiestaControllerInterface controller = new FiestaController(model);
        FiestaViewInterface view = new FiestaConsoleView();

        controller.crearYAnadirInvitado(1, "Ana", ColorEnum.VERDE);
        controller.crearYAnadirInvitado(2, "Luis", ColorEnum.NARANJA);
        controller.crearYAnadirInvitado(3, "Marta", ColorEnum.ROJO);

        view.mostrarMensaje("Lista de invitados:");
        view.mostrarInvitados(controller.listarInvitados());
    }
}
