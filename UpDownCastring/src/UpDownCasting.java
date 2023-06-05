
public class UpDownCasting {

	public static void print(Person p) {
		if(p instanceof Person) {
			System.out.println(p.id + p.name);
		}if(p instanceof Student) {
			Student s = (Student)p;
			System.out.println(s.department);
		}if(p instanceof Researcher) {
			Researcher r = (Researcher)p;
			System.out.println(r.part);
		}if(p instanceof Professor){
			Professor f = (Professor)p;
			System.out.println(f.subject);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor res = new Professor();
		res.id = 123;
		res.name = "Cho Woo Bhin";
		res.part = "자바 연구실";
		res.subject = "자바";
		print(res);
	}

}
