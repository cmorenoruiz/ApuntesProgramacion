/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cmorenoruiz preguntando a chatGPT
 */
import java.util.ArrayList;

class Escritora {
    private String nombre;
    private String idioma;

    public Escritora(String nombre, String idioma) {
        this.nombre = nombre;
        this.idioma = idioma;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}

public class EjemploArrayList {
    public static void main(String[] args) {
        // Crear un ArrayList vacío
        ArrayList<Escritora> escritoras = new ArrayList();

        // Añadir cuatro objetos de clase Escritora que hablen castellano
        escritoras.add(new Escritora("Gabriela Mistral", "Español"));
        escritoras.add(new Escritora("Isabel Allende", "Español"));
        escritoras.add(new Escritora("Margarita Yourcenar", "Español"));
        escritoras.add(new Escritora("Laura Esquivel", "Español"));

        // Crear un segundo ArrayList pasándole el primero
        ArrayList<Escritora> escritorasModificadas = new ArrayList(escritoras);

        // Modificar una de las escritoras en el segundo ArrayList
        escritorasModificadas.get(1).setIdioma("Inglés");

        // Imprimir ambos ArrayList
        System.out.println("ArrayList original:");
        for (Escritora escritora : escritoras) {
            System.out.println("Nombre: " + escritora.getNombre() + ", Idioma: "
                    + escritora.getIdioma());
        }

        System.out.println("\nArrayList modificado:");
        for (Escritora escritora : escritorasModificadas) {
            System.out.println("Nombre: " + escritora.getNombre() + ", Idioma: "
                    + escritora.getIdioma());
        }
    }
}

