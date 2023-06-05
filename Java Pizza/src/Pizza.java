
public class Pizza {
	private double radius;
	private String toping;
	private String pizza_name;
	
	public Pizza(double radius, String toping, String pizza_name) {
		this.radius = radius;
		this.toping = toping;
		this.pizza_name = pizza_name;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setToping(String toping) {
		this.toping = toping;
	}
	public String getToping() {
		return toping;
	}
	public void setPizzaName(String pizza_name) {
		this.pizza_name = pizza_name;
	}
	public String getPizzaName() {
		return pizza_name;
	}
	
}
