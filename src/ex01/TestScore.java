package ex01;

/*
num, name, kor, eng, mat
번호,이름,국어,영어,수학
1,사나,70,80,90
2,모모,0,70,100
3,쯔위,70,90,90
4,정연,80,90,70
5,원영,90,90,89
6,유진,100,100,100
*/

class Score {
//입력:번호,이름,국어,영어,수학
//		0	name kor  eng mat 
//출력:번호 이름 국어 영어 수학 총점 = tot 평균 = avg 등급 = grade
	// Field - 전역 변수
	// 입력
	int num;
	String name;
	int kor;
	int eng;
	int mat;
	
	//출력
	int tot;
	double avg;
	char grade;
	
	// Constructor - STS 에서 우클릭 시 Source : alt + shift + s-> Generate using Fields
	// Score() -> n, na, k, e, m - 지역변수
	// this 사용 이유 : 지역 변수와 전역 변수의 충돌 예방
	public Score(int num, String name, int kor, int eng, int mat) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
		//계산
		getTot();
		getAvg();
		getGrade();
	}

	private void getTot() {
		this.tot = this.kor + this.eng + this.mat;
	}
	private void getAvg() {
		this.avg = (this.kor + this.eng + this.mat) / 3.0;
	}
	private void getGrade() {
		//switch - boolean, int, String 등 등 가능
		int v = (int) this.avg / 10;
		switch (v) {
		case 10, 9:
			this.grade = 'A';
			break;
		case 8:
			this.grade = 'B';
			break;
		case 7:
			this.grade = 'C';
			break;
		case 6:
			this.grade = 'D';
			break;
		case 5:
			this.grade = 'E';
			break;
		default:
			this.grade = 'F';
			break;
		}
//		if(90 <= this.avg && this.avg <= 100) {
//			this.grade = 'A';
//		} else {
//			if (80 <= this.avg && this.avg < 90) {
//				this.grade = 'B';
//			} else {
//				if(70 <= this.avg && this.avg < 80) {
//					this.grade = 'C';
//				} else {
//					if(60 <= this.avg && this.avg < 70) {
//						this.grade = 'D';
//					} else {
//							this.grade = 'F';
//						}
//					}					
//				}				
//			} 
		}
	// Method
	void disp() {
		String fmt = "%d %s %d %d %d %d %.2f %c\n";
		System.out.printf(fmt, num,name,kor,eng,mat, tot, avg, grade);
	}
	static void title() {
		String title = "번호 이름 국어 영어 수학 총점 평균 등급";
		System.out.println(title);
	}
}

public class TestScore {

	public static void main(String[] args) { 
//		Score sc1 = new Score(); 기본 생성자가 없고 다른 생성자만 존재할 때 new Score(); 에러, The constructor Score() is undefined
		Score.title();
		
		Score sc1 = new Score(1, "사나", 70, 80, 90);
		sc1.disp();
		
		Score sc2 = new Score(2,"모모",0,70,100);
		sc2.disp();
		
		Score sc3 = new Score(5,"원영",100,100,100);
		sc3.disp();
	}

}
