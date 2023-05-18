package org.exemplo.heranca;

import java.time.LocalDateTime;
import java.util.Date;

public class Programa {

	public static void main(String[] args) {
		
		
		
		IPaciente p1 = new PacienteMasculino("000",
				"Gustavo", 1.7f, 80f, 20, LocalDateTime.now());
		
		IPaciente p2 = new PacienteFeminino("111", 
				"Maria", 1.7f, 80f, 20, new Date(), new Date());
		
		System.out.println(p1.calcularMetabolismo());
		
		System.out.println(p2.calcularMetabolismo());
		
	}
}
