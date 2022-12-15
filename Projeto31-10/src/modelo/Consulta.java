package modelo;

import java.time.LocalDate;

public class Consulta {
	private LocalDate dataConsulta;
	private String cidConsulta;

	public String getCidConsulta() {
		return cidConsulta;
	}

	public void setCidConsulta(String cidConsulta) {
		this.cidConsulta = cidConsulta;
	}

	public LocalDate getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(LocalDate dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

}
