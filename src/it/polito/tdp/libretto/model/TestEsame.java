package it.polito.tdp.libretto.model;

import java.time.LocalDate;

public class TestEsame {

	public static void main(String[] args) {
		Esame esame=new Esame("03df","tecniche","fulvio");
		System.out.println(esame);
		Esame esame1=new Esame("04df","tecniche","fulvio");
		System.out.println(esame1);
		System.out.println(esame1.equals(esame));
		esame.supera(30, LocalDate.now());
		System.out.println(esame);
		esame.supera(18, LocalDate.now());
	}

}
