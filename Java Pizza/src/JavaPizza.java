
public class JavaPizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pizza pizza = new Pizza(20, "버섯", "통큰피자");
		System.out.println(pizza.getPizzaName() + "의 토핑은 " + pizza.getToping() + "이고 피자 이름은 " + pizza.getPizzaName() + "입니다");;
	}

}
