/**
 * Created by DAM on 15/9/16.
 */
public class coche {

    private String matricula;
    private String marca;
    private String modelo;
    private Double precio;
    private String color;

    public coche(String matricula, String marca, String modelo, Double precio, String color) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        coche coche = (coche) o;

        if (matricula != null ? !matricula.equals(coche.matricula) : coche.matricula != null) return false;
        if (marca != null ? !marca.equals(coche.marca) : coche.marca != null) return false;
        if (modelo != null ? !modelo.equals(coche.modelo) : coche.modelo != null) return false;
        if (precio != null ? !precio.equals(coche.precio) : coche.precio != null) return false;
        return color != null ? color.equals(coche.color) : coche.color == null;

    }

    @Override
    public int hashCode() {
        int result = matricula != null ? matricula.hashCode() : 0;
        result = 31 * result + (marca != null ? marca.hashCode() : 0);
        result = 31 * result + (modelo != null ? modelo.hashCode() : 0);
        result = 31 * result + (precio != null ? precio.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "coche{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                '}';
    }
}
