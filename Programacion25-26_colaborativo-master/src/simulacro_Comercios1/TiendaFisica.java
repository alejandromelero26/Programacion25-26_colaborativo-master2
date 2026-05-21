package simulacro_Comercios1;

public class TiendaFisica extends Comercio {

    private int numeroEmpleados;
    public final int COSTE_BASE = 1000;
    public final int COSTE_SI_EMP_5 = 200;

    public TiendaFisica(String ID, String nombre, String ciudad, TipoComercio tipoComercio, int numeroEmpleados) {
        super(ID, nombre, ciudad, tipoComercio);
        this.numeroEmpleados = numeroEmpleados;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    @Override
    public double calcularCosteOperacion() {
        double costeFinal;

        // Operador ternario
        // variable = condicion ? valor_si_verdadero : valor_si_falso;
        costeFinal = numeroEmpleados > 5 ? (COSTE_BASE + COSTE_SI_EMP_5) : (COSTE_BASE);

        if( numeroEmpleados > 5 ){
            costeFinal = COSTE_BASE + COSTE_SI_EMP_5;
        } else {
            costeFinal = COSTE_BASE;
        }

        return costeFinal;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("Tienda física: ");

        sb.append(super.toString());

        sb.append(String.format(", número empleados: '%d', coste de operación: '%.3f' ", numeroEmpleados, calcularCosteOperacion()));

        return sb.toString();
    }
}
