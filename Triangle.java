package geometry;

public class Triangle extends Shape {
	private int base = 23;
	private int height = 11;

	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	public Triangle(String text, String material, int base, int height) {
		super(text, material);
		this.base = base;
		this.height = height;
	}
	
	public Triangle(String text, String material) {
		super(text, material);
	}

	public void displayTriangleHeight() {
		System.out.println("Triangle height is: " + height);
	}

	@Override
	public void getSize() {
		System.out.println(base * height / 2);
	}

	@Override
	public String toString() {
		return "Triangle: height is " + this.height + ", base is: " + this.base + " " + 
					super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		if (base != other.base)
			return false;
		if (height != other.height)
			return false;
		return true;
	}
	
	 @Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + base;
		result = prime * result + height;
		return result;
	}
}
