public class Rectangle{
	private String name;
	private int width;  //사각형의 너비
	private int height; //사각형의 높이
	public Rectangle() { // 생성자 메소드
		
	}
	public Rectangle(int width, int height, String name) { //오버로딩을 하여 생성자 메소드를 하나 더 만들었다.
		this.width = width;
		this.height = height;
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setWidth(int w) { //public 으로 setter를 만들어 다른 클래스에서도 private요소에 접근 할 수 있게 한다.
		width = w;
	}
	public int getWidth() {
		return width;
	}
	
	public void setHeight(int h) {
		height = h;
	}
	public int getHeight() {
		return height;
	}
	
	public int getArea() {    //사각형의 넓이 반환
		return width * height;
	}
}
