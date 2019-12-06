package org.javabrains.model;

public class Circle {

	private String name;

	public String getName() {
		System.out.println("getter run");
		return name;
	}

	public void setName(String name) {
		System.out.println("setter run");
		this.name = name;
	
	}

	public void throwAnError(String Name) throws Exception {
			throw(new Exception());
	}
	
	public String valueInValueOut(String Name) {
		name ="bob";
		return name;
	}
	
	public String aroundAdvice() {
		String name ="Cat";
		System.out.println("aroundAdvice Method run");
		return name;
	}
}
