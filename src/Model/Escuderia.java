package Model;

/**
 * Created by Ray on 10/05/2017.
 */
public enum Escuderia {
    MCLAREN("McLaren",1),
    RENAULT("Renault",2),
    MERCEDES("Mercedes",3),
    FERRARI("Ferrari",4);



    private final String escuderia;
    private final int posicion;

    //Constructor

    Escuderia(String escuderia, int posicion){
        this.escuderia = escuderia;
        this.posicion = posicion;
    }

    public String getEscuderia(){
        return this.escuderia;
    }

    public int getPosicion(){
        return this.posicion;
    }
}
