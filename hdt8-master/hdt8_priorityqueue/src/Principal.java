/*
 * UVG
 * Algoritmos y Estructura de Datos
 * Priority Queue
 * Autores:
 * 		Emilio Diaz
 * 		Samantha Duarte
*/	

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Principal {

    static ArrayList<Pacientes> arrayPacientes = new ArrayList<Pacientes>();
    static ArrayList<Pacientes> arrayPacientes2 = new ArrayList<Pacientes>();
    static VectorHeap<Pacientes> vector = new VectorHeap<Pacientes>();
    static String laCadena = "";
    
    //Método en donde se crea el vector leyendo el contendido del archivo txt
    public static void crearVector(){
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\pacientes.txt"));
            String linea;
            while((linea = br.readLine()) != null)
            {
                //String tmp = br.readLine();
                String[] palabras = linea.split(", ");      
                Pacientes nuevoPaciente = new Pacientes(palabras[0], palabras[1], palabras[2]);
                vector.add(nuevoPaciente);
                laCadena = laCadena + "\n"+nuevoPaciente.toString();
            }
        } catch (IOException e) {
                e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    
    
	public static void main(String[] args) {

                crearVector();
                //Impresion de las listas de los pacientes al ingresar y de los pacientes como deben de sera atendidos.
                System.out.println("Los pacientes ingresaron de esta manera: ");
                System.out.println(laCadena + "\n");      
                System.out.println("Los pacientes deben ser atendidos de la siguiente manera: \n");
                while(!vector.isEmpty()){
                    System.out.println(vector.remove().toString());
                } 
	}

}
