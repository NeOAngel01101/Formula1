import Model.Escuderia;
import Model.Piloto;
import Model.Tipo;


/**
 * Created by Ray on 10/05/2017.
 */
public class Main {
    public static void main(String[] args) {

        Piloto Manolo = new Piloto(3,"Manolo", "España", Escuderia.MERCEDES, Tipo.SEGUNDO);

        System.out.println(Manolo);
    }
}
