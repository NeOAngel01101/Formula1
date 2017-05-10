package Model;

/**
 * Created by Ray on 10/05/2017.
 */
public class Piloto {
    private int dorsal;
    private String nombre;
    private String nacionalidad;
    private Escuderia escuderia;
    private Tipo tipo;


    //Constructor

    //Constructor por defecto
    public Piloto() {
    }

    //Constructor con todos los atributos

    public Piloto(int dorsal, String nombre, String nacionalidad, Escuderia escuderia, Tipo tipo) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.escuderia = escuderia;
        this.tipo = tipo;
    }


    // GETTER AND SHETTER

    public double getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Escuderia getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(Escuderia escuderia) {
        this.escuderia = escuderia;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }


    //ToString


    @Override
    public String toString() {
        return "PILOTO:" +
                " Dorsal:" + dorsal +
                " Nombre:" + nombre +
                " Nacionalidad:" + nacionalidad +
                " Escuderia:" + escuderia +
                " Tipo:" + tipo ;
    }
}
