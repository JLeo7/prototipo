package logicaNegocios;

public class Tarea {
	
	private int tareaID;
	private Proceso proceso;
	private Grupo grupoAEjecutar;
	private String nombreTarea;
	
	public Tarea() {
		
	}
	
	public Tarea(int tareaID, Proceso proceso, Grupo grupoAEjecutar, String nombreTarea) {
		
		this.tareaID = tareaID;
		this.proceso = proceso;
		this.grupoAEjecutar = grupoAEjecutar;
		this.nombreTarea = nombreTarea;
	}
	
	@Override
	public String toString() {
		return "Tarea [tareaID=" + tareaID + ", proceso=" + proceso + ", grupoAEjecutar=" + grupoAEjecutar
				+ ", nombreTarea=" + nombreTarea + "]";
	}
	
	public int getTareaID() {
		return tareaID;
	}
	
	public void setTareaID(int tareaID) {
		this.tareaID = tareaID;
	}
	
	public Proceso getProceso() {
		return proceso;
	}
	
	public void setProceso(Proceso proceso) {
		this.proceso = proceso;
	}
	
	public Grupo getGrupoAEjecutar() {
		return grupoAEjecutar;
	}
	
	public void setGrupoAEjecutar(Grupo grupoAEjecutar) {
		this.grupoAEjecutar = grupoAEjecutar;
	}
	
	public String getNombreTarea() {
		return nombreTarea;
	}
	
	public void setNombreTarea(String nombreTarea) {
		this.nombreTarea = nombreTarea;
	}

}
