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

    // FACTORÍA COCHE

    public static Coche crearCoche(String matricula, String marca, String tama) {

        if(checkMatricula(matricula) && checkMarca(marca) && checkTama(tama)){
            return new Coche(matricula, convertMarca(marca), convertTama(tama));
        } else {
            return null;
        }

    }


    // Comprobador de matrícula válida
    public static boolean checkMatricula(String matricula) {
        try {
            //Primero, creo un String que sirve de modelo para el patrón
            String matriculaLegal = "[0-9]{4}[A-Z]{3}";
            //Ahora introduzco el modelo en el patrón con Pattern.compile
            Pattern patronMatricula = Pattern.compile(matriculaLegal);
            //Por último, enfrento el patron con el String que llega por parámetro
            Matcher checker = patronMatricula.matcher(matricula);
            return checker.matches();
        } catch (MatchException e) {
            return false;
        }
    }

    // Comprobador de Marca válida
    public static boolean checkMarca(String marca){
        for (Marca valor:Marca.values()) {
            if (valor.name().equals(marca.toUpperCase())) {
                return true;
            }
        }
        return false;
    }

    // Converter de String a Marca
    public static Marca convertMarca(String marca){
        try {
            return Marca.valueOf(marca.toUpperCase());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    // Comprobador de Tama válido
    public static boolean checkTama(String tama){
        for (Tama valor:Tama.values()) {
            if (valor.name().equals(tama.toUpperCase())) {
                return true;
            }
        }
        return false;
    }

    // Converter de String a Tama
    public static Tama convertTama(String tama){
        try {
            return Tama.valueOf(tama.toUpperCase());
        } catch (IllegalArgumentException e) {
            return null;
        }
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
        return "Matrícula: " + this.matricula + "\n"
                + "Marca: " + this.marca + "\n"
                + "Tamaño: " + this.tama + "\n";
    }
}
