import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Texto texto = new Texto();
		String pacientes = texto.leerTexto();
		
		for(int i = 0; i<pacientes.length(); i++){
			String[] listaPacientes = pacientes.split(",");
		}
		
	}

}
