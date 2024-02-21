import java.util.regex.Matcher;
import java.util.regex.Pattern;

enum Marca{AUDI,PEUGEOT,MERCEDES,BMW,OTHER}
enum Tama{PEQ,MED,GRA}
public class Coche {
    private String matricula;
    private Marca marca;
    private Tama tama;

    private Coche(String matricula, Marca marca, Tama tama) {
        this.matricula = matricula;
        this.marca = marca;
        this.tama = tama;
    }

    //FACTORÍA COCHE

    public static Coche crearCoche(String matricula, String marca, String tama) {

        if(checkMatricula(matricula) && checkMarca(marca) && checkTama(tama)){
            return new Coche(matricula, marca, tama);
        } else {
            return null;
        }

    }

    public static boolean checkMatricula(String matricula) {
        //Primero, creo un String que sirve de modelo para el patrón
        String matriculaLegal = "[0-9]{4}[A-Z]{3}";
        //Ahora introduzco el modelo en el patrón con Pattern.compile
        Pattern patronMatricula = Pattern.compile(matriculaLegal);
        //Por último, enfrento el patron con el String que llega por parámetro
        Matcher checker = patronMatricula.matcher(matricula);

        return ;
    }

    public static boolean checkMarca(String marca){

    }

    public static boolean checkTama(String tama){

    }

    public String getMatricula() {
        return matricula;
    }

    public Marca getMarca() {
        return marca;
    }

    public Tama getTama() {
        return tama;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", marca=" + marca +
                ", tama=" + tama +
                '}';
    }
}
