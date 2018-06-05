package logicaNegocios;

public class Usuario {
	
	private int usuarioID;
	private String cedula;
	private String nombreUsuario;
	private String password;
	private Grupo grupo;
	
	public Usuario() {
		
	}

	public Usuario(int usuarioID, String cedula, String nombreUsuario, String password, Grupo grupo) {
		
		this.usuarioID = usuarioID;
		this.cedula = cedula;
		this.nombreUsuario = nombreUsuario;
		this.password = password;
		this.grupo = grupo;
		
	}

	@Override
	public String toString() {
		return "Usuario [usuarioID=" + usuarioID + ", cedula=" + cedula + ", nombreUsuario=" + nombreUsuario
				+ ", password=" + password + ", grupo=" + grupo + "]";
	}

	public int getUsuarioID() {
		return usuarioID;
	}

	public void setUsuarioID(int usuarioID) {
		this.usuarioID = usuarioID;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	
	
	
	
	
	
	
}
