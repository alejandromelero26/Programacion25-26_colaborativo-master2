package simulacro_Biblioteca.model;

public class Libro extends Recurso {
    private int numeroPaginas;
    private final int PRESTAMO_BASE = 15; // 15 días para cualquier libro
    private final int PAGINAS_LIBRO_GRANDE = 300;
    private final int DIAS_PRESTAMO_LIBRO_GRANDE = 5; // 5 días para libros de más de 300 páginas

    public Libro(int id, String titulo, String autor, TipoPrestamo tipoPrestamo, int numeroPaginas) {
        super(id, titulo, autor, tipoPrestamo);
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public int calcularDiasPrestamo(){

        int cantidadDias = PRESTAMO_BASE;

        if( numeroPaginas > PAGINAS_LIBRO_GRANDE){
            cantidadDias += DIAS_PRESTAMO_LIBRO_GRANDE;
        }

        return cantidadDias;

        // return numeroPaginas > PAGINAS_LIBRO_GRANDE ? PRESTAMO_BASE + DIAS_PRESTAMO_LIBRO_GRANDE : PRESTAMO_BASE;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getPRESTAMO_BASE() {
        return PRESTAMO_BASE;
    }

    public int getDIAS_PRESTAMO_LIBRO_GRANDE() {
        return DIAS_PRESTAMO_LIBRO_GRANDE;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append(String.format(", numero de páginas: '%d', días de préstamo: %d", numeroPaginas, calcularDiasPrestamo()));

        return sb.toString();
    }
}
