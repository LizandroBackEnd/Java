public class Libro {
    String Titulo, Autor, Editorial, ISB;
    int paginas;

    public Libro(String Titulo, String Autor, String Editorial, String ISB, int paginas) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Editorial = Editorial;
        this.ISB = ISB;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void informacionLibro() {
        System.out.println("============ LIBRO ============");
        System.out.println("NOMBRE DEL LIBRO: " + Titulo);
        System.out.println("AUTOR DEL LIBRO : " + Autor);
        System.out.println("EDITORIAL DEL LIBRO : " + Editorial);
        System.out.println("ISB DEL LIBRO : " + ISB);
        System.out.println("PAGINAS DEL LIBRO : " + paginas);
        System.out.println("=================================");
    }

}