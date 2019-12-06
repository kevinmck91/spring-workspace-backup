package org.javabrains;

public class Triangle {
	
	private String type;
	private int height;
	private String temp;
	
	//constructor using string
	public Triangle(String type){
		this.type = type;
	}
	
	//constructor using int
	public Triangle(int height){
		this.height = height;
		}
	
	//constructor using both String and int
	public Triangle(String type, int height){
		this.type = type;
		this.height = height;
		System.out.println("dual constructor run");
	}
	
	
	//setter
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public int getHeight() {
		return height;
	}

	public void draw(){
		System.out.println(getType() + " triangle drawn");
		System.out.println("The Height is " + getHeight());
	}




}
