package simulacro_Comercios1;

public class TiendaOnline extends Comercio {

    private boolean tieneEnvioInternacional;
    public final int COSTE_BASE = 500;
    public final int COSTE_SI_ENV_INT = 150;

    public TiendaOnline(String ID, String nombre, String ciudad, TipoComercio tipoComercio, boolean tieneEnvioInternacional) {
        super(ID, nombre, ciudad, tipoComercio);
        this.tieneEnvioInternacional = tieneEnvioInternacional;
    }

    public boolean isTieneEnvioInternacional() {
        return tieneEnvioInternacional;
    }

    public void setTieneEnvioInternacional(boolean tieneEnvioInternacional) {
        this.tieneEnvioInternacional = tieneEnvioInternacional;
    }

    @Override
    public double calcularCosteOperacion() {
        return tieneEnvioInternacional ? COSTE_BASE + COSTE_SI_ENV_INT : COSTE_BASE;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Tienda online: ");

        sb.append(super.toString());

        sb.append(String.format(", tiene envío internacional: '%b', coste de operación: '%.3f' ", tieneEnvioInternacional, calcularCosteOperacion()));

        return sb.toString();
    }

}