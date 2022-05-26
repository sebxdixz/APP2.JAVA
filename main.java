//App 2: Editor de texto .csv 
//La Aplicaion constara un menu el cual permitira al usuario seleccionar la opcion que desee
//El Archivo CSV esta organizado como: titulo,autor,anio,estante_numero,estante_seccion,piso,edificio,sede
//Opcion 1: Agregar libro nuevo.
//Opcion 2: Quitar libro existente.
//Opcion 3: Agregar nueva sede o cambiar de sede. (En un libro existen o en un libro nuevo)
//Opcion 4: Quitar sede existente. (En un libro existen)
//Opcion 5: Editar libro existente. En donde puede cambiar el titulo, autor, anio, estante, seccion, piso, edificio o sede.
//Opcion 6: Salir. (Guardar todos los cambios)

//Empezamos importando las librerias necesarias
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

//Creamos la clase principal, y conectamos el archivo csv ("inventarios.csv")
public class main {
    public static void main(String[] args) throws IOException {
        //Creamos una lista de objetos de la clase Libro
        List<Libro> libros = new ArrayList<Libro>();
        //Creamos una lista de objetos de la clase Sede
        List<Sede> sedes = new ArrayList<Sede>();
        //Creamos una lista de objetos de la clase Estante
        List<Estante> estantes = new ArrayList<Estante>();
        //Creamos una lista de objetos de la clase Seccion
        List<Seccion> secciones = new ArrayList<Seccion>();
        //Creamos una lista de objetos de la clase Piso
        List<Piso> pisos = new ArrayList<Piso>();
        //Creamos una lista de objetos de la clase Edificio
        List<Edificio> edificios = new ArrayList<Edificio>();
        //Creamos una lista de objetos de la clase Estante
        List<Estante> estantes2 = new ArrayList<Estante>();
        //Creamos una lista de objetos de la clase Seccion
        List<Seccion> secciones2 = new ArrayList<Seccion>();
        //Creamos una lista de objetos de la clase Piso
        List<Piso> pisos2 = new ArrayList<Piso>();
        //Creamos una lista de objetos de la clase Edificio
        List<Edificio> edificios2 = new ArrayList<Edificio>();
        //Creamos una lista de objetos de la clase Sede
        List<Sede> sedes2 = new ArrayList<Sede>();
        //Creamos una lista de objetos de la clase Libro

        //Creamos una variable de tipo Scanner para leer el archivo csv
        Scanner sc = new Scanner(new File("inventarios.csv"));

        //Pasamos los datos del csv a una lista de objetos de las clases Libro, Sede, Estante, Seccion, Piso, Edificio, Estante, Seccion, Piso, Edificio, Sede
        while (sc.hasNextLine()) {
            String linea = sc.nextLine();
            String[] datos = linea.split(",");
            Libro libro = new Libro(datos[0], datos[1], Integer.parseInt(datos[2]), datos[3], datos[4], Integer.parseInt(datos[5]), datos[6], datos[7], datos[8]);
            Sede sede = new Sede(datos[9]);
            Estante estante = new Estante(Integer.parseInt(datos[10]), datos[11]);
            Seccion seccion = new Seccion(Integer.parseInt(datos[12]), datos[13]);
            Piso piso = new Piso(Integer.parseInt(datos[14]), datos[15]);
            Edificio edificio = new Edificio(Integer.parseInt(datos[16]), datos[17]);
            Estante estante2 = new Estante(Integer.parseInt(datos[18]), datos[19]);
            Seccion seccion2 = new Seccion(Integer.parseInt(datos[20]), datos[21]);
            Piso piso2 = new Piso(Integer.parseInt(datos[22]), datos[23]);
            Edificio edificio2 = new Edificio(Integer.parseInt(datos[24]), datos[25]);
            Sede sede2 = new Sede(datos[26]);
            libros.add(libro);
            sedes.add(sede);
            estantes.add(estante);
            secciones.add(seccion);
            pisos.add(piso);
            edificios.add(edificio);
            estantes2.add(estante2);
            secciones2.add(seccion2);
            pisos2.add(piso2);
            edificios2.add(edificio2);
            sedes2.add(sede2);
        }
            pisos2.add(piso2);
            edificios2.add(edificio2);
            sedes2.add(sede2);
        }
        
        //Creamos la primera funcion, agregar el libro nuevo
        public static void agregarLibroNuevo(List<Libro> libros, List<Sede> sedes, List<Estante> estantes, List<Seccion> secciones, List<Piso> pisos, List<Edificio> edificios) {
            System.out.println("Ingrese el titulo del libro");
            String titulo = sc.nextLine();
            System.out.println("Ingrese el autor del libro");
            String autor = sc.nextLine();
            System.out.println("Ingrese el año del libro");
            int anio = sc.nextInt();
            System.out.println("Ingrese el estante del libro");
            int estante = sc.nextInt();
            System.out.println("Ingrese la seccion del libro");
            int seccion = sc.nextInt();
            System.out.println("Ingrese el piso del libro");
            int piso = sc.nextInt();
            System.out.println("Ingrese el edificio del libro");
            String edificio = sc.nextLine();
            System.out.println("Ingrese la sede del libro");
            String sede = sc.nextLine();
            //Agregamos los datos de los libros a la lista de libros
            libros.add(new Libro(titulo, autor, anio, estante, seccion, piso, edificio, sede));
            //Agregamos los datos de las sedes a la lista de sedes
            sedes.add(new Sede(sede));
            //Agregamos los datos de los estantes a la lista de estantes
            estantes.add(new Estante(estante));
            //Agregamos los datos de las secciones a la lista de secciones
            secciones.add(new Seccion(seccion));
            //Agregamos los datos de los pisos a la lista de pisos
            pisos.add(new Piso(piso));
            //Agregamos los datos de los edificios a la lista de edificios
            edificios.add(new Edificio(edificio));
            //Agregamos los datos de las sedes a la lista de sedes
            sedes.add(new Sede(sede));

            //Creamos la segunda funcion, quitar libro existente





