package de.test;

class NonFinalFieldConstructorExample {

	private Integer parameters = 5;

	public Integer getParameters() {
		return parameters;
	}

}

public class MainWithoutError {
	public static void main(String[] args) {
		NonFinalFieldConstructorExample example = new NonFinalFieldConstructorExample();
		System.out.println(example.getParameters());
	}
}
