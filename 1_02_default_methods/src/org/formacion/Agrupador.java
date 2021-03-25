package org.formacion;

import java.util.Collection;

public interface Agrupador {

	void add(Object elemento);

	int numeroElementos();

	default void addAll(Collection col) {
		for (Object obj : col) {
			add(obj);
		}
	}

}
