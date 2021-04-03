package org.formacion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Para las soluciones de estos ejercicios utiliza streams, las operaciones
 * intermedias que necesites y una operación terminal con una estructura
 * mutante.
 */
public class ReduccionesUtil {

	/**
	 * Devuelve una coleccion con los Strings de la lista original con: - los nulls
	 * eliminados del resultado - el resto pasado a mayúsculas.
	 * 
	 * Es decir, si pasamos {"a",null,"b",null} debe devolver {"A","B"}
	 * 
	 */
	public Collection<String> obtenSinNulosYMayusculas(List<String> original) {
		/*
		 * Otra posible solución
		 * 
		 * List<String> listFiltered = original.stream().filter(it -> it !=null).collect(Collectors.toList());
		 * 
		 * return listFiltered.stream().map(it -> it.toUpperCase()).collect(Collectors.toList());
		 */

		Collection<String> col = new ArrayList<>();
		original.stream().filter(it -> it != null).map(it -> it.toUpperCase()).forEach(it -> col.add(it));

		return col;
	}

	/**
	 * Devolver un array de dos enteros. En la posicion 0 con el numero de pares
	 * encontrado en la lista de numeros y en la posicion 1 el numero de impares
	 * 
	 * Por ejemplo, si numeros es { 0, 1, 2, 4 } debe devolver [3,1]
	 */
	public int[] paresImpares(List<Integer> numeros) {

		/*
		 * Ir acumulando en la posicion 0 el recuento de pares y en la posicion 1 el
		 * recuento de impares
		 */
		int[] acumular = { 0, 0 };

		/*
		 * Otra posible solución
		 * 
		 * numeros.stream().forEach(num -> {
		 *  if (num % 2 == 0) { 
		 *  	acumular[0] = acumular[0] + 1; 
		 *	} else { 
		 *  	acumular[1] = acumular[1] + 1; } 
		 *	});
		 */

		numeros.stream().forEach(it -> acumular[it % 2] += 1);

		return acumular;

	}

}
