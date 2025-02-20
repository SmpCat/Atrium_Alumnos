package com.atrium.controlador;

import java.util.Arrays;
import java.util.List;

/**
 * Clase que contiene Constantes del Programa
 * @author Sergio S�nchez Garc�a
 * @version 2.0
 */
public class Constantes {
	
	// Porcentajes de Descuento
	public static final Double PORCENTAJE_CERO = 0.0; 
	public static final Double PORCENTAJE_DIEZ = 10.0; 
	public static final Double PORCENTAJE_CIEN = 100.0; 

	
	// Porcentaje IVA predeterminado
	public static final Double PORCENTAJE_IVA = 16.00;

	// Variables
	public static final String USUARIO = "usuario"; 
	public static final String RESOURCE = "javax.faces.resource";
	public static final String IDIOMA_DEFECTO = "idioma_por_defecto";

	// Valores de precio
	public static final Double VALOR_CERO = 0.00;
	
	// Lista de Art�culos con Descuento
	public static final List<Integer> LISTA_ARTICULOS_DESCUENTO =  Arrays.asList(1,2,3,4,5,6,7,8,9,10); 

}
