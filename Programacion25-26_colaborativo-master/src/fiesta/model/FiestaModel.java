package fiesta.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FiestaModel implements FiestaModelInterface {
    private final List<Invitado> invitados;

    public FiestaModel() {
        this.invitados = new ArrayList<>();
    }

    @Override
    public Invitado crearInvitado(int id, String nombre, ColorEnum color) {
        return new Invitado(id, nombre, color);
    }

    @Override
    public boolean anadirInvitado(Invitado invitado) {
        if (invitado == null || buscarInvitadoPorId(invitado.getId()) != null) {
            return false;
        }

        invitados.add(invitado);
        return true;
    }

    @Override
    public Invitado buscarInvitadoPorId(int id) {
        for (Invitado invitado : invitados) {
            if (invitado.getId() == id) {
                return invitado;
            }
        }

        return null;
    }



}
