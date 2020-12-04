package br.inatel.cdg.annotation.reading;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

//Nessa classe você deverá implementar a sua solução
//Adicionalmente você também deverá criar
//a anotação NumberToSum como parte da solução

public class AnnotationReader<T> {

	private int sum;
	private Class<?> clazz;

	public AnnotationReader(Class<?> clazz) {
		this.clazz = clazz;
	}

	public void readAnnotations() {
		// Reset sum
		sum = 0;

		// Iterate over class fields
		for (Field field : clazz.getDeclaredFields()) {
			if (!field.isAnnotationPresent(NumberToSum.class))
				continue;

			sum += field.getAnnotation(NumberToSum.class).value();
		}

		// Iterate over class methods
		for (Method method : clazz.getDeclaredMethods()) {
			if (!method.isAnnotationPresent(NumberToSum.class))
				continue;

			sum += method.getAnnotation(NumberToSum.class).value();
		}
	}

	public int getTotalSum() {
		return sum;
	}

}