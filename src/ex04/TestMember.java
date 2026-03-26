package ex04;

import java.util.jar.Attributes.Name;

class Member {
	// Field : private 으로 선언
	// Access Modifier(public, private, protected, package) 를 안붙이면 package level
	// package level 변수 : 같은 폴더에서 변수 공유 가능
	private int id;
	private String name;
	private String email;
	
	//Constructor
	public Member() {}	
	public Member(int id, String name, String email) {
		this();
		this.setId(id);
		this.setName(name);
		this.setEmail(email);
	}
	//Override Method
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	//캡슐화 - getter/setter 함수
	//getter : 외부에서 객체의 데이터를 읽을 때 사용하는 메서드(return 값 필요)
	//setter : 외부에서 객체의 데이터를 수정할 때 사용하는 메서드(매개변수 필요)
	// Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	// Name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// Email
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}

public class TestMember {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.setId(1);
		m1.setName("alice");
		m1.setEmail("alice@lol.com");
		System.out.println(m1);
		System.out.println("m1의 이름: " + m1.getName());
				
		Member m2 = new Member(2, "rise", "rise@lol.com");
		System.out.println(m2);
		m2.setEmail("rise@lolol.com"); // not visible
		System.out.println(m2);
		System.out.println("m2의 아이디: " + m2.getId());
		System.out.println("m2의 이름: " + m2.getName());
		System.out.println("m2의 이메일: " + m2.getEmail());
	}
}


