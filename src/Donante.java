import java.util.Objects;

public class Donante {
    private String nombre;
    private String apellido;
    private int id;

    //Constructor:
    public Donante(String nombre, String apellido, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }

    // Sobreeescribimos el metodo equals y el hashcode para poder comparar

    @Override
    public boolean equals(Object otro){
        if (this == otro){
            return true;
        }

        if (otro == null || this.getClass() != otro.getClass()){
            return false;
        }

        Donante otro2 = (Donante) otro;
        return this.nombre.equals(otro2.nombre) && this.apellido.equals(otro2.apellido);

    }

    @Override
    public int hashCode(){
        return Objects.hash(nombre, apellido);
    }

    //Sobreescribimos el metodo toString()

    @Override
    public String toString(){
        return "(" + id + ")" + apellido + ", " + nombre;
    }
}
