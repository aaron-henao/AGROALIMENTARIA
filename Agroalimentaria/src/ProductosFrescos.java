public class ProductosFrescos extends Producto {
    private String fechaEnvasado;
    private String pais;


    public ProductosFrescos(String caducidad, int lote, String fechaEnvasado, String Pais) {
        super();
        this.setCaducidad(caducidad);
        this.setLote(lote);
        this.setFechaEnvasado(fechaEnvasado);
        this.setPais(Pais);
    }

    //getters - setters
    public String getFechaEnvasado() {return fechaEnvasado;}
    public String getPais() {return pais;}
    public void setFechaEnvasado(String envasado) {this.fechaEnvasado = envasado;}
    public void setPais(String pais) {this.pais = pais;}

    public String informacionProductosFrescos() {
        return "Fecha de caducidad: " + getCaducidad() + " Número de lote: " + getLote() +
                " Fecha de envasado: " + getFechaEnvasado() + " País: " + getPais();
    }

}
