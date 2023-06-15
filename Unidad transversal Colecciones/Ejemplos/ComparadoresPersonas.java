//Ejemplo generado por chatGPT el 15/06/2023
//Comentarios de Cristina Moreno Ruiz
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}

public class ComparadoresPersonas {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", 30));
        personas.add(new Persona("María", 25));
        personas.add(new Persona("Pedro", 35));

        // Comparador por edad
        Comparator<Persona> comparadorPorEdad = new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return Integer.compare(p1.getEdad(), p2.getEdad());
            }
        };

        // Comparador por nombre
        Comparator<Persona> comparadorPorNombre = new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p1.getNombre().compareTo(p2.getNombre());
            }
        };
        //Al poder crear todos los comparadores que queramos,
        //no estamos limitando la clase Persona a ordenarse solo por un criterio
        //podemos añadir tantos comparadores como queramos
        
        // Ordenamos la lista de personas por edad
        Collections.sort(personas, comparadorPorEdad);
        System.out.println("Ordenado por edad:");

        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " - " + persona.getEdad());
        }

        // Ordenamos la lista de personas por nombre
        Collections.sort(personas, comparadorPorNombre);
        System.out.println("\nOrdenado por nombre:");

        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " - " + persona.getEdad());
        }
    }
}

