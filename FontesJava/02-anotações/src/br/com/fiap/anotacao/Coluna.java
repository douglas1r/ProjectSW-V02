package br.com.fiap.anotacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME) // Mantem a anota��o at� a execu��o
@Target(ElementType.FIELD)// Anota��o pode ser utilizada em atributos
public @interface Coluna {

	String nome();
	boolean nullable();
	
}
