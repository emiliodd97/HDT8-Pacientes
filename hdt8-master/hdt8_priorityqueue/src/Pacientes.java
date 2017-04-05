
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emilio Diaz y Samantha Duarte
 */
public class Pacientes implements Comparable<Pacientes>{
    
    /*Variables que llenan la ficha del paciente*/
    private String name;
    private String sintoma;
    private String codigo;

    /*Método constructor*/
    public Pacientes(String name, String sintoma, String codigo) {
        this.name = name;
        this.sintoma = sintoma;
        this.codigo = codigo;
    }
    

    public Pacientes() {
		super();
		// TODO Auto-generated constructor stub
	}

    //Métodos set de los atributos del paciente
	public void setName(String name) {
        this.name = name;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    //Métodos get de los atributos del paciente
    public String getName() {
        return name;
    }

    public String getSintoma() {
        return sintoma;
    }

    public String getCodigo() {
        return codigo;
    }

    /*Método toString que no sdevuelve una cadena con los deatos del paciente*/
    @Override
    public String toString() {
        return name + ", " + sintoma + ", " + codigo;
    }

    /*Metodo CompareTo que compara los codigos de los pacientes*/
    @Override
    public int compareTo(Pacientes o) {
        return this.codigo.compareTo(o.codigo);
    }
    
   
    
    
}