package week04.khkim;

public class Circle {
	int radius;
	void set(int r) {
		radius = r;
	}
	double getArea() {
		return 3.14*radius*radius;
	}
	public Circle(int r) {
		radius = r;
	}
}
