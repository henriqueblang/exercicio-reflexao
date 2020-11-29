package br.inatel.cdg.example;

import br.inatel.cdg.annotation.reading.CustomAnnotation1;

//Você deverá criar a CustomAnnotation1 como parte da solução
public class ExampleClass2 {

	@CustomAnnotation1(4)
	private int field4;
	
	@CustomAnnotation1(5)
	private int field5;
	
	@CustomAnnotation1(6)
	private int field6;
	
	@CustomAnnotation1(7)
	public void method2() {
		System.out.println("Example Method With Annotation");
	}
	
	public void method3() {
		System.out.println("Example Method Without Annotation");
	}
	
}