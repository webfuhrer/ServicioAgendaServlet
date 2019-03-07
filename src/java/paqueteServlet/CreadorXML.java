package paqueteServlet;

import java.util.ArrayList;

public class CreadorXML {

	public static String crear(ArrayList<Contacto> lista_contactos) {
		String xml="<xml>";
		xml+="<agenda>";
		for (Contacto contacto : lista_contactos) {
			xml+="<contacto>";
			xml+="<nombre>"+contacto.getNombre()+"</nombre>";
			xml+="<apellido>"+contacto.getApellido()+"</apellido>";
			xml+="<email>"+contacto.getEmail()+"</email>";
			xml+="</contacto>";
		}
		xml+="</agenda>";
		return xml;
	}

}
