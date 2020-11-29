package br.inatel.cdg.example;

import br.inatel.cdg.annotation.reading.CustomAnnotation1;

//Você deverá criar a CustomAnnotation1 como parte da solução
public class ExampleClass1 {

	@CustomAnnotation1(1)
	private int field1;
	
	@CustomAnnotation1(2)
	private int field2;
	
	@CustomAnnotation1(3)
	private int field3;
	
	public void method1() {
		System.out.println("Example Class 1");
	}
	
}