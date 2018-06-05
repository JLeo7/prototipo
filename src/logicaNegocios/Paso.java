package logicaNegocios;

import java.time.LocalDateTime;

public class Paso {
	
	private int pasoID;
	private Tarea tarea;
	private String tipoPaso;
	private String pregunta;
	private String respuesta;
	private LocalDateTime fechaEjecucion;
	
	public Paso() {
		
	}
	
	public Paso(int pasoID, Tarea tarea, String tipoPaso, String pregunta) {
		
		this.pasoID = pasoID;
		this.tarea = tarea;
		this.tipoPaso = tipoPaso;
		this.pregunta = pregunta;
		
	}
	
	public Paso(int pasoID, Tarea tarea, String tipoPaso, String pregunta, String respuesta,
			LocalDateTime fechaEjecucion) {
		
		this.pasoID = pasoID;
		this.tarea = tarea;
		this.tipoPaso = tipoPaso;
		this.pregunta = pregunta;
		this.respuesta = respuesta;
		this.fechaEjecucion = fechaEjecucion;
		
	}

	@Override
	public String toString() {
		return "Paso [pasoID=" + pasoID + ", tarea=" + tarea + ", tipoPaso=" + tipoPaso + ", pregunta=" + pregunta
				+ ", respuesta=" + respuesta + ", fechaEjecucion=" + fechaEjecucion + "]";
	}

	public int getPasoID() {
		return pasoID;
	}

	public void setPasoID(int pasoID) {
		this.pasoID = pasoID;
	}

	public Tarea getTarea() {
		return tarea;
	}

	public void setTarea(Tarea tarea) {
		this.tarea = tarea;
	}

	public String getTipoPaso() {
		return tipoPaso;
	}

	public void setTipoPaso(String tipoPaso) {
		this.tipoPaso = tipoPaso;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public LocalDateTime getFechaEjecucion() {
		return fechaEjecucion;
	}

	public void setFechaEjecucion(LocalDateTime fechaEjecucion) {
		this.fechaEjecucion = fechaEjecucion;
	}
	
}
