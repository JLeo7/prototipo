package logicaNegocios;

public class Proceso {
	
	private int procesoID;
	private String nombreProceso;
	
	public Proceso() {
		
	}

	public Proceso(int procesoID, String nombreProceso) {
		
		this.procesoID = procesoID;
		this.nombreProceso = nombreProceso;
		
	}

	@Override
	public String toString() {
		return "Proceso [procesoID=" + procesoID + ", nombreProceso=" + nombreProceso + "]";
	}

	public int getProcesoID() {
		return procesoID;
	}

	public void setProcesoID(int procesoID) {
		this.procesoID = procesoID;
	}

	public String getNombreProceso() {
		return nombreProceso;
	}

	public void setNombreProceso(String nombreProceso) {
		this.nombreProceso = nombreProceso;
	}
	
}
