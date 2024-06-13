package br.com.logica;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class StringData {
	public static void main(String[] args){
		
		//System.out.println(nome.toLowerCase());
		//System.out.println(nome.toUpperCase());
		//System.out.println(nome.length());
		
		//String nome2 = "rhawann";
		//System.out.println(nome.equalsIgnoreCase(nome2));
		
		//Olá, {NOME}. Hoje é (dia-da-semana}, BOM DIA.
		//ISO 8601 - representa o padrão de data e hora para o mundo inteiro
		// O java representa esse padrão através do LocalDate
		String nome = "Rhawann";
		LocalDate hoje = LocalDate.now();
		Locale brasil = new Locale("pt", "BR");
		String saudacao;
		LocalDateTime agora = LocalDateTime.now();
		
		//System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
		//System.out.println(hoje.getDayOfMonth());
		//System.out.println(hoje.getDayOfYear());
		
		String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
		if(agora.getHour() >= 0 && agora.getHour()< 12) 
		{
			saudacao = "bom dia";
		}
		else if(agora.getHour() >= 12 && agora.getHour()< 18)
		{
			saudacao = "boa tarde";
		}
		else
		{
			saudacao = "boa noite";
		}
		
		System.out.printf("Olá, %s. Hoje é %s, %s. %n ", nome, diaSemana, saudacao.toUpperCase());
	}
}
