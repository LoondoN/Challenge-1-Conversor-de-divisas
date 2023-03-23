package Conversor;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		
		Object[] options= {"Convertir divisas", "Convertir Temperatura", "Salir"};
		
		int elige = JOptionPane.showOptionDialog(null, "Que vamos a convertir", "Conversor", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null,options,options[0]);
		
		if(elige == 2) {
			JOptionPane.showMessageDialog(null, "Programa cerrado");
			System.exit(0);
		}
		if(elige == 0) {
			DecimalFormat formateoDivisa = new DecimalFormat("#.##");
			boolean continuarPrograma = true;
			while(continuarPrograma) {
				String [] opciones = {"COP a Euro","COP a USD", "COP a Libras Esterlinas", "COP a Yen", "COP a Won", "Euro a COP", "USD a COP", "Libras Esterlinas a COP", "Yen a COP", "Won a COP" };
				String cambio = (String) JOptionPane.showInputDialog(null, "Elija una opcion: ","Conversor de moneda", JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);
				String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir:");
				
			    double cop = 0.00;
				
				try {
					cop = Double.parseDouble(input);
				}catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Valor no valido");
				}
				
				if(cambio.equals("COP a Euro")){
					double euro = cop*0.00019;
					JOptionPane.showMessageDialog(null, cop + " Pesos Colombianos son: " + formateoDivisa.format(euro) + " Euros.");
				}else if(cambio.equals("COP a USD")) {
					double dolares = cop*0.00021;
					JOptionPane.showMessageDialog(null, cop + " Pesos Colombianos son: " + formateoDivisa.format(dolares) + " USD.");	
				}else if(cambio.equals("COP a Libras Esterlinas")) {
					double libEsterlinas = cop*0.00017;
					JOptionPane.showMessageDialog(null, cop + " Pesos Colombianos son: " + formateoDivisa.format(libEsterlinas) + " Libras Esterlinas.");	
				}else if(cambio.equals("COP a Yen")) {
					double yen = cop*0.028;
					JOptionPane.showMessageDialog(null, cop + " Pesos Colombianos son: " + formateoDivisa.format(yen) + " Yen.");	
				}else if(cambio.equals("COP a Won")) {
					double won = cop*0.27;
					JOptionPane.showMessageDialog(null, cop + " Pesos Colombianos son: " + formateoDivisa.format(won) + " Won.");	
				}
				else if(cambio.equals("Euro a COP")){
					double euro = cop*5197.87;
					JOptionPane.showMessageDialog(null, cop + " Euros son: " + formateoDivisa.format(euro) + " Pesos Colombianos.");
				}
				else if(cambio.equals("USD a COP")) {
					double dolares = cop*4773;
					JOptionPane.showMessageDialog(null, cop + " Dolares son: " + formateoDivisa.format(dolares) + " Pesos Colombianos.");	
				}
				else if(cambio.equals("Libras Esterlinas a COP")) {
					double libEsterlinas = cop*5871.91;
					JOptionPane.showMessageDialog(null, cop + " Libras Esterlinas son: " + formateoDivisa.format(libEsterlinas) + " Pesos Colombianos.");	
				}
				else if(cambio.equals("Yen a COP")) {
					double yen = cop*36.51;
					JOptionPane.showMessageDialog(null, cop + " Yenes son: " + formateoDivisa.format(yen) + " Pesos Colombianos.");	
				}
				else if(cambio.equals("Won a COP")) {
					double won = cop*3.71;
					JOptionPane.showMessageDialog(null, cop + " Wones son: " + formateoDivisa.format(won) + " Pesos Colombianos.");	
				}
				
				int confirma = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "Confirmar", JOptionPane.YES_NO_CANCEL_OPTION);
				if(confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION) {
					continuarPrograma = false;
					JOptionPane.showMessageDialog(null, "Programa finalizado");
				}
				
			}
		}
		
		if(elige == 1) {
			boolean seguirPrograma = true;
			while(seguirPrograma) {
				String[] opciones = {"Celcius a Fahrenheit", "Fahrenheit a Celcius"};
				int opcion = JOptionPane.showOptionDialog(null, "Elija una opcion: ","Conversor de temperatura", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null,opciones,opciones[0]);
				String valorNominal = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir:");
				
				double valor = 0.0;
				
				try {
					valor = Double.parseDouble(valorNominal);
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Valor no valido");
					System.exit(0);
				}
				
				double resultado = 0;
				
				if(opcion == 0) {
					resultado = (valor * 9/5)+32;
					JOptionPane.showMessageDialog(null, valor + " Grados Celcius son: " + resultado + " Grados Fahrenheit.");
				}else if(opcion == 1 ){
					resultado = (valor - 32) * 5/9;
					JOptionPane.showMessageDialog(null, valor + " Grados Fahrenheit son: " + resultado + " Grados Celcius.");
				}
				int continuar = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "Confirmar", JOptionPane.YES_NO_CANCEL_OPTION);
				if(continuar == JOptionPane.NO_OPTION || continuar == JOptionPane.CANCEL_OPTION) {
					seguirPrograma = false;
					JOptionPane.showMessageDialog(null, "Programa finalizado");
				}
			}
		}
		
	}
	
}
