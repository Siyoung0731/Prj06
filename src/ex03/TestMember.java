package ex03;


// this < extends < super
class Member {
	//Field
	int id;
	String name;
	String email;
	
	//Constructor
	public Member() {}
	
	public Member(String msg) { //기본
		System.out.println(msg + "객체 생성");
	}
	public Member(int id, String name, String email) { //인자
//		super(); : 부모 클래스 -> parent class, super() : 부모 클래스의 기본 생성자를 호출
		this("msg"); // 기본생성자인 Member() 호출함. this : 나 자신
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	//Override Methods
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
}

public class TestMember {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.id = 1;
		m1.name = "alice";
		m1.email = "alice@lol.com";
		System.out.println(m1);
		
		Member m2 = new Member(2, "rise", "rise@lol.com");
		System.out.println(m2);
	}

}
