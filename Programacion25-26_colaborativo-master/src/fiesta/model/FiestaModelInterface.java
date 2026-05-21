package fiesta.model;

import java.util.List;

public interface FiestaModelInterface {
    Invitado crearInvitado(int id, String nombre, ColorEnum color);

    boolean anadirInvitado(Invitado invitado);

    Invitado buscarInvitadoPorId(int id);

    boolean eliminarInvitado(int id);

    List<Invitado> getInvitados();

    int getTotalInvitados();
}
