package paqueteServlet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AccesoFichero {
	public static ArrayList<Contacto> leerContactos() {
		File fichero=new File("D:\\agenda.csv");
		ArrayList<Contacto> lista=new ArrayList();
		try {
			
			FileReader fr=new FileReader(fichero);
			BufferedReader br=new BufferedReader(fr);
			String linea=br.readLine();
			while(linea!=null)
			{
				
				//System.out.println(linea);
				//pepe,perez,42,pepe@mail.com
				String[] valores;
				valores=linea.split(",");
				// Contacto(String nombre, String email, String apellido, int edad) 
				Contacto c=new Contacto(valores[0], valores[3], valores[1], Integer.parseInt(valores[2]));
				lista.add(c);
				linea=br.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}
}
