package simulacro_Biblioteca.model;

public class Revista extends Recurso {
    private int numeroEdicion;
    private final int PRESTAMO_FIJO = 7; // 7 días

    public Revista(int id, String titulo, String autor, TipoPrestamo tipoPrestamo, int numeroEdicion) {
        super(id, titulo, autor, tipoPrestamo);
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public int calcularDiasPrestamo() {
        return PRESTAMO_FIJO;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public int getPRESTAMO_FIJO() {
        return PRESTAMO_FIJO;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append(String.format(", numero de edición: '%d', días de préstamo: %d", numeroEdicion, PRESTAMO_FIJO));

        return sb.toString();
    }
}
