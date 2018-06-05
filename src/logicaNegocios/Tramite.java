package logicaNegocios;

public class Tramite {
	
	private int idTramite;
	private Proceso procesoActual;
	private Usuario iniciadoPor;
	
	public Tramite() {
		
	}

	public Tramite(int tramiteID, Proceso proceso, Usuario iniciadoPor) {
		
		this.idTramite = tramiteID;
		this.procesoActual = proceso;
		this.iniciadoPor = iniciadoPor;
		
	}

	@Override
	public String toString() {
		return "Tramite [tramiteID=" + idTramite + ", proceso=" + procesoActual + ", iniciadoPor=" + iniciadoPor + "]";
	}

	public int getTramiteID() {
		return idTramite;
	}

	public void setTramiteID(int tramiteID) {
		this.idTramite = tramiteID;
	}

	public Proceso getProceso() {
		return procesoActual;
	}

	public void setProceso(Proceso proceso) {
		this.procesoActual = proceso;
	}

	public Usuario getIniciadoPor() {
		return iniciadoPor;
	}

	public void setIniciadoPor(Usuario iniciadoPor) {
		this.iniciadoPor = iniciadoPor;
	}

}
