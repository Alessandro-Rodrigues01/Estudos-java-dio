package agendaContatos_set;

import java.util.Objects;

public class Contato {
private String nome;
private int ddd;
private long numeroTelefone;



public Contato(String nome, int ddd, long numeroTelefone) {
	super();
	this.nome = nome;
	this.ddd = ddd;
	this.numeroTelefone = numeroTelefone;
}

public String getNome() {
	return nome;
}



public int getDdd() {
	return ddd;
}

public long getNumeroTelefone() {
	return numeroTelefone;
}




public void setNumeroTelefone(long numeroTelefone) {
	this.numeroTelefone = numeroTelefone;
}


public void setDdd(int ddd) {
	this.ddd = ddd;
}

@Override
public int hashCode() {
	return Objects.hash(numeroTelefone);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Contato other = (Contato) obj;
	return numeroTelefone == other.numeroTelefone;
}

@Override
public String toString() {
	return "Contato ddd =" +
ddd + 
", nome =" + nome + 
", numeroTelefone =" +
numeroTelefone;
}





}
