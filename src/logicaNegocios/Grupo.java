package logicaNegocios;

public class Grupo {
	
	private int grupoID;
	private String nombreGrupo;
	
	public Grupo() {
		
	}
	
	public Grupo(int grupoID, String nombreGrupo) {
		
		this.grupoID = grupoID;
		this.nombreGrupo = nombreGrupo;
		
	}

	@Override
	public String toString() {
		return "Grupo [grupoID=" + grupoID + ", nombreGrupo=" + nombreGrupo + "]";
	}

	public int getGrupoID() {
		return grupoID;
	}

	public void setGrupoID(int grupoID) {
		this.grupoID = grupoID;
	}

	public String getNombreGrupo() {
		return nombreGrupo;
	}

	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}
	
	
}
