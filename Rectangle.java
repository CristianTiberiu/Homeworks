package geometry;

public class Rectangle extends Shape {
	int width = 10;
	int height = 50;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle(String text, String material, int width, int height) {
		super(text, material);
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(String text, String material) {
		super(text, material);
	}

	public void displayRectangleHeight() {
		System.out.println("Rectangle height is: " + height);
	}

	@Override
	public void getSize() {
		System.out.println(width * height);
	}

	@Override
	public String toString() {
		return "Rectangle: height is " + this.height + ", width is: " + this.width + " " + super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (height != other.height)
			return false;
		if (width != other.width)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + height;
		result = prime * result + width;
		return result;
	}

}
