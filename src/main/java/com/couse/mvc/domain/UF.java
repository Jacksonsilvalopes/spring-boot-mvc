package com.couse.mvc.domain;

public enum UF {
	AC("AC", "Acre"), 
	AL("AL", "Alagoas"),
	AM("AM", "Amazonas"),
	BA("BA", "Bahia"),
	CE("CE", "CearÃ¡"),
	DF("DF", "Distrito Federal"),
	ES("ES", "EspÃ­rito Santo"),
	GO("GO", "GoiÃ¡s"),
	MA("MA", "MaranhÃ£o"),
	MT("MT", "Mato Grosso"),
	MS("MS", "Mato Grosso do Sul"),
	MG("MG", "Minas Gerais"),
	PA("PA", "ParÃ¡"),
	PB("PB", "ParaÃ­ba"),
	PR("PR", "ParanÃ¡"),
	PE("PE", "Pernambuco"),
	PI("PI", "PiauÃ­"),
	RJ("RJ", "Rio de Janeiro"),
	RN("RN", "Rio Grande do Norte"),
	RS("RS", "Rio Grande do Sul"),
	RO("RO", "RondÃ´nia"),
	RR("RR", "Roraima"),
	SC("SC", "Santa Catarina"),
	SP("SP", "SÃ£o Paulo"),
	SE("SE", "Sergipe"),
	TO("TO", "Tocantins");
	
	private String sigla;
	
	private String descrição;

	UF(String sigla, String descrição) {
		this.sigla = sigla;
		this.descrição = descrição;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
	
	
	
}
