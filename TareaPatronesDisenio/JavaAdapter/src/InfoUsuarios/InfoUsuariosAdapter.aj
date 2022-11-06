package InfoUsuarios;

import Modelo.Usuario;

public aspect InfoUsuariosAdapter {
	declare parents: InfoUsuariosCSV implements IAdaptadorUsuarios;
	declare parents: InfoUsuariosXML implements IAdaptadorUsuarios;
	
	public void InfoUsuariosXML.guardar_info_usuarios(Usuario u){
		saveInfoUsuarioXML();
	}
	public void InfoUsuariosCSV.guardar_info_usuarios(Usuario u){
		saveInfoUsuarioCSV();
	}
}
