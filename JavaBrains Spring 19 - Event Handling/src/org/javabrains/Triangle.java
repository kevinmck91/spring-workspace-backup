package org.javabrains;

public class Triangle implements Shape{
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	//Getter and Setter
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	//Getter and Setter
	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	//Getter and Setter
	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw(){
		System.out.println("triangle drawing : ");
		System.out.println("PointA = (" + getPointA().getX() + "," + getPointA().getY() + ")"  );
		System.out.println("PointB = (" + getPointB().getX() + "," + getPointB().getY() + ")"  );
		System.out.println("PointC = (" + getPointC().getX() + "," + getPointC().getY() + ")"  );		
	}


}
