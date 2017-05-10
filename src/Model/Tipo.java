package Model;

/**
 * Created by Ray on 10/05/2017.
 */
public enum Tipo {
    PRIMERO("Primer piloto"),
    SEGUNDO("Segundo piloto"),
    PROBADOR("Piloto probador");

    private final String tipo;

    Tipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }
}




