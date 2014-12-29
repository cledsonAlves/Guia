package com.br.objetos;

import java.util.ArrayList;

public class PojoTransporte {
	
	// cria os objetos transportes
	public static ArrayList<Transp> getTransportes(){
		
		ArrayList<Transp> lista = new ArrayList<Transp>();

		//Transporte 0
		Transp t = new Transp();
		ArrayList<String> horarios = new ArrayList<String>();
 		String[] h =  new String[]{"tagDIAS ÚTEIS (VIA TERRA)","06:00","09:45","12:00","14:00","17:30","tagDOMINGO E FERIADO (VIA TERRA)","06:00","09:45","15:00","17:30","tagDIAS ÚTEIS (VIA PISTA)","05:50","08:00","11:00","15:30","17:15","18:20","tagDOMINGO E FERIADO (VIA PISTA)","08:00","12:00"};
 		for (int i = 0; i < h.length; i++) {
 			horarios.add(h[i]);
			
		}
 		t.setHorarios(horarios);
		t.setDestino("JARINU x CAMPO LIMPO");
		t.setViacao("VIAÇÃO ATIBAIA");
		
		//Transporte 1
		Transp t1 = new Transp();
		ArrayList<String> h1 = new ArrayList<String>();
		h1.add("tagDIAS ÚTEIS ( VIA TERRA)");h1.add("07:00");h1.add("11:00");h1.add("16:00");h1.add("19:00");
		h1.add("tagDOMINGO E FERIADO ( VIA TERRA) ");h1.add("07:00");h1.add("11:00");h1.add("16:00");h1.add("19:00");
		h1.add("tagDIAS ÚTEIS (VIA PISTA)");h1.add("07:00");h1.add("09:30");h1.add("13:00");h1.add("16:30");h1.add("18:00");h1.add("19:30");
		h1.add("tagDOMINGO E FERIADO (VIA PISTA)");h1.add("09:00");h1.add("14:00");
		t1.setHorarios(h1);
		t1.setDestino("CAMPO LIMPO x JARINU");
		t1.setViacao("VIAÇÃO ATIBAIA");
		
		//Transporte 2
		Transp t2 = new Transp();
		t2.setDestino("JARINU x JUNDIAÍ");
		t2.setViacao("VIAÇÃO ATIBAIA");
		ArrayList<String> h2 = new ArrayList<String>();
		h2.add("tagDIAS ÚTEIS (LINHA URBANA)");h2.add("05:50");h2.add("06:45");h2.add("07:00");h2.add("08:30");h2.add("10:00");h2.add("12:00");h2.add("13:30");h2.add("14:30");h2.add("16:00");
		h2.add("17:30");h2.add("22:00");h2.add("tagSÁBADO (LINHA URBANA)");h2.add("06:00");h2.add("06:45");h2.add("07:00");h2.add("08:30");h2.add("10:00");h2.add("12:00");h2.add("13:30");
		h2.add("16:00");h2.add("17:30");h2.add("20:30");h2.add("tagDOMINGO E FERIADO");h2.add("06:00");h2.add("10:00");h2.add("13:30");h2.add("17:30");h2.add("20:30");
		h2.add("tagDOMINGO À DOMINGO (INTERMUNICIPAL)");h2.add("07:30");h2.add("11:40");h2.add("15:20");h2.add("19:10");
		t2.setHorarios(h2);
		
		
		//Transporte 3
		Transp t3 = new Transp();
		t3.setDestino("JUNDIAÍ x JARINU");
		t3.setViacao("VIAÇÃO ATIBAIA");
		ArrayList<String> h3 = new ArrayList<String>();
		h3.add("tagDIAS ÚTEIS (LINHA URBANA)");h3.add("07:00");h3.add("08:00");h3.add("10:00");h3.add("12:00");h3.add("14:15");h3.add("15:30");h3.add("16:30");h3.add("16:55");h3.add("17:30");
		h3.add("18:30");h3.add("23:00");h3.add("tagSÁBADO (LINHA URBANA)");h3.add("07:15");h3.add("08:25");h3.add("10:00");h3.add("11:30");h3.add("12:55");h3.add("14:15");h3.add("15:30");
		h3.add("16:55");h3.add("18:30");h3.add("23:00");h3.add("tagDOMINGO E FERIADO (LINHA URBANA)");h3.add("08:25");h3.add("11:30");h3.add("15:30");h3.add("18:20");h3.add("23:00");
		h3.add("tagDOMINGO À DOMINGO (INTERMUNICIPAL)");h3.add("08:30");h3.add("13:00");h3.add("17:00");h3.add("20:00");
		t3.setHorarios(h3);
		
		//Transporte 4
		Transp t4 = new Transp();
		t4.setDestino("JARINU x ATIBAIA");
		t4.setViacao("VIAÇÃO ATIBAIA");
		ArrayList<String> h4 = new ArrayList<String>();
		h4.add("tagSEGUNDA Á SABADO (VIA USINA)");h4.add("06:00");h4.add("13:20");h4.add("tagDOMINGO E FERIADO (VIA USINA)");h4.add("06:00");h4.add("tagDOMINGO À DOMINGO (VIA DOM PEDRO)");h4.add("09:20");h4.add("13:50");h4.add("17:50");h4.add("20:50");
		t4.setHorarios(h4);
		
		//Transporte 5
		Transp t5 = new Transp();
		t5.setDestino("ATIBAIA x JARINU");
		t5.setViacao("VIAÇÃO ATIBAIA");
		ArrayList<String> h5 = new ArrayList<String>();
		h5.add("tagSEGUNDA À SABADO (VIA USINA)");h5.add("09:00");h5.add("12:30");h5.add("tagDOMINGO E FERIADO (VIA USINA)");h5.add("09:00");h5.add("tagDOMINGO À DOMINGO ( VIA DOM PEDRO)");h5.add("06:50");h5.add("11:00");h5.add("14:40");h5.add("18:30");
		t5.setHorarios(h5);
		
		
		//Transporte 6
		Transp t6 = new Transp();
		t6.setDestino("JARINU x DOM PEDRO");
		t6.setViacao("VIAÇÃO FENIX");
		ArrayList<String> h6 = new ArrayList<String>();
		h6.add("tagDias Úteis");h6.add("05:15");h6.add("06:10");h6.add("06:25");h6.add("06:30");h6.add("06:50");h6.add("07:10");h6.add("07:30");h6.add("08:30 (via pista)");h6.add("09:10");
		h6.add("09:40");h6.add("10:30");h6.add("11:00 (até a Rigor)");h6.add("11:30");h6.add("12:00");h6.add("12:45");h6.add("13:30");h6.add("14:10 (até a Rigor)");h6.add("15:00");h6.add("15:35");
		h6.add("15:50");h6.add("16:10");h6.add("16:30 (até a Rigor)");h6.add("17:15");h6.add("17:40");h6.add("18:10");h6.add("18:40");h6.add("19:40");h6.add("20:40");h6.add("21:45");
		h6.add("tagSÁBADO");h6.add("05:15");h6.add("06:10");h6.add("06:30");h6.add("07:10");h6.add("07:30");h6.add("08:30");h6.add("09:10");h6.add("09:40");h6.add("10:30");
		h6.add("11:00");h6.add("11:30");h6.add("12:00");h6.add("12:40");h6.add("13:30");h6.add("14:00");h6.add("14:50");h6.add("15:20");h6.add("15:45");h6.add("16:30");
		h6.add("17:20");h6.add("18:00");h6.add("18:30");h6.add("19:40");h6.add("20:40");
		h6.add("tag::::DOMINGO::::");h6.add("06:00");h6.add("07:30");h6.add("08:50");h6.add("10:10");h6.add("12:15");h6.add("14:00");h6.add("16:20");h6.add("18:00");h6.add("19:30");h6.add("20:30");h6.add("21:45");
		t6.setHorarios(h6);
		
		
		// Transporte 7
		Transp t7 = new Transp();
		t7.setViacao("VIAÇÃO FENIX");
		t7.setDestino("DOM PEDRO x JARINU");
		ArrayList<String> h7 = new ArrayList<String>();
		h7.add("tagDIAS ÚTEIS");h7.add("06:10");h7.add("06:50");h7.add("06:55");h7.add("07:25");h7.add("07:50");h7.add("08:05");h7.add("09:10");h7.add("09:50");h7.add("10:20");
		h7.add("11:10");h7.add("11:45");h7.add("12:10");h7.add("13:00");h7.add("13:20");h7.add("14:10");h7.add("14:50");h7.add("15:40");h7.add("16:15");h7.add("16:30");
		h7.add("17:15");h7.add("18:05");h7.add("18:20");h7.add("18:50");h7.add("19:25");h7.add("20:25");h7.add("21:15");h7.add("22:20");
		h7.add("tagSÁBADO");h7.add("06:00");h7.add("06:10");h7.add("06:50");h7.add("07:50");h7.add("08:00");h7.add("09:10");h7.add("09:50");h7.add("10:20");h7.add("11:05");
		h7.add("11:45");h7.add("12:10");h7.add("12:45");h7.add("13:20");h7.add("14:15");h7.add("14:50");h7.add("16:00");h7.add("16:30");h7.add("17:05");h7.add("17:50");h7.add("18:00");h7.add("18:30");
		h7.add("19:05");h7.add("20:10");h7.add("21:10");h7.add("22:25");
		h7.add("tag:::DOMINGO:::");h7.add("06:40");h7.add("08:05");h7.add("09:30");h7.add("10:50");h7.add("12:50");h7.add("14:45");h7.add("16:50");
		h7.add("18:40");h7.add("20:00");h7.add("21:10");h7.add("22:30");
		t7.setHorarios(h7);
		
		
		// Transporte 8
		Transp t8 = new Transp();
		t8.setDestino("JARINU x C. LARGO");
		t8.setViacao("VIAÇÃO FENIX");
		ArrayList<String> h8 = new ArrayList<String>();
		h8.add("tagDIAS ÚTEIS");h8.add("06:25");h8.add("07:30");h8.add("08:30");h8.add("09:30");h8.add("10:20");h8.add("11:10");h8.add("11:30");h8.add("12:30");h8.add("13:20");
		h8.add("14:10");h8.add("15:10");h8.add("16:00");h8.add("16:30");h8.add("17:10");h8.add("18:00");h8.add("18:40");h8.add("19:50");h8.add("20:40");h8.add("21:45");
		h8.add("tagSÁBADO");h8.add("07:30");h8.add("08:30");h8.add("09:30");h8.add("10:20");h8.add("11:10");h8.add("11:30");h8.add("12:20");h8.add("13:10");h8.add("14:10");
		h8.add("15:20");h8.add("16:00");h8.add("16:30");h8.add("17:20");h8.add("18:00");h8.add("18:30");h8.add("19:50");h8.add("20:40");h8.add("21:45");
		h8.add("tag:::DOMINGO:::");h8.add("07:30");h8.add("09:30");h8.add("11:40");h8.add("12:00");h8.add("14:00");h8.add("15:30");h8.add("17:35");h8.add("19:50");h8.add("21:45");
		t8.setHorarios(h8);
		
		
		// Transporte 8
		Transp t9 = new Transp();
		t9.setDestino("C. LARGO x JARINU");
		t9.setViacao("VIAÇÃO FENIX");
		ArrayList<String> h9 = new ArrayList<String>();
		h9.add("tagDIAS ÚTEIS");h9.add("04:45");h9.add("05:40");h9.add("05:50");h9.add("07:15");h9.add("08:15");h9.add("09:15");h9.add("10:15");h9.add("11:10");h9.add("11:50");
		h9.add("12:10");h9.add("13:15");h9.add("14:05");h9.add("15:00");h9.add("16:00");h9.add("16:50");h9.add("17:15");h9.add("18:00");h9.add("18:20");h9.add("19:30");
		h9.add("20:40");h9.add("21:30");h9.add("22:30");
		h9.add("tagSÁBADO");h9.add("04:45");h9.add("05:45");h9.add("06:30");h9.add("07:15");h9.add("08:15");h9.add("09:15");h9.add("10:15");h9.add("11:10");h9.add("12:00");h9.add("12:10");h9.add("13:10");h9.add("14:00");h9.add("15:00");h9.add("16:10");h9.add("16:50");h9.add("17:20");
		h9.add("18:10");h9.add("18:50");h9.add("19:20");h9.add("20:40");h9.add("21:30");
		h9.add("tag:::DOMINGO:::");h9.add("06:00");h9.add("08:15");h9.add("10:15");h9.add("12:30");h9.add("14:50");h9.add("16:20");h9.add("18:30");h9.add("20:35");h9.add("22:30");
		t9.setHorarios(h9);
	
		
		
		lista.add(t6);lista.add(t7);lista.add(t8);lista.add(t9);lista.add(t);lista.add(t1);lista.add(t2);lista.add(t3);lista.add(t4);lista.add(t5);
		
		
		return lista;
		
		
	}

}
