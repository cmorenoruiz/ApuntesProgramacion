//Ejemplo generado por chatGPT el 15/06/2023
//Comentarios de Cristina Moreno Ruiz
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Observa cómo la clase Persona implementa la interfaz Comparable
class Persona implements Comparable<Persona> {
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
    //Porlo tanto tengo que implementar mi método compareTo
    @Override
    public int compareTo(Persona otraPersona) {
        // Comparamos las edades de las personas
        // Devolvemos un valor negativo si la edad de "otraPersona" es mayor,
        // un valor positivo si es menor, y 0 si son iguales.
        return this.edad - otraPersona.edad;
    }
}

public class ComparandoPersonas {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", 25));
        personas.add(new Persona("Ana", 30));
        personas.add(new Persona("Pedro", 20));

        System.out.println("Lista original:");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " - " + persona.getEdad());
        }
        //Como la clase Persona implementa a Comparable
        //podemos llamar al método estático sort de Collections
        //y usará nuestro método compareTo para ordenar la colección
        Collections.sort(personas);

        System.out.println("\nLista ordenada por edad:");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " - " + persona.getEdad());
        }
    }
}

