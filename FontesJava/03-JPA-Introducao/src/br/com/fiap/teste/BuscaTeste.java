package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import br.com.fiap.entity.Zoologico;

public class BuscaTeste {
public static void main(String[] args) {
	EntityManagerFactory fabrica = 
			Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
	EntityManager em = fabrica.createEntityManager();
	
	
	//PESQUSAR UM ZOOLOGICO DE ID = 1 
	
	Zoologico zoo = em.find(Zoologico.class, 1);
		
	System.out.println(zoo.getNome());
	  
	
	em.close();
	fabrica.close();
}	
}
