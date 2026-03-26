package ex05;
/*
num,name,kor,eng,mat
번호,이름,국어,영어,수학
1,사나,70,80,90
2,모모,0,70,100
3,쯔위,70,90,90
4,정연,80,90,70
5,원영,90,90,89
6,유진,100,100,100
*/
//입력:번호,이름,국어,영어,수학
//출력:번호 이름 국어 영어 수학 총점 평균 등급
// 모든 Field는 private
//생성자, Getter/Setter, toString 만들어서 작업

class Score {
	//input
		private int num; // == this.num
		private String name;
		private int kor;
		private int eng;
		private int mat;
	//output	
		private int tot;
		private double avg;
		private char grade;

		public Score() {}
		public Score(int num, String name, int kor, int eng, int mat) {
			this();
			this.num = num;
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.mat = mat;
			getTot();
			getAvg();
			getGrade();
		}	
		//Num
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
		//Name
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		//Kor
		public int getKor() {
			return kor;
		}
		public void setKor(int kor) {
			this.kor = kor;
		}
		//Eng
		public int getEng() {
			return eng;
		}
		public void setEng(int eng) {
			this.eng = eng;
		}
		//Mat
		public int getMat() {
			return mat;
		}
		public void setMat(int mat) {
			this.mat = mat;
		}
		//Tot
		public int getTot() {
			this.tot = this.kor + this.eng + this.mat;
			return tot;
		}
		//Avg
		public double getAvg() {
			this.avg = (this.kor + this.eng + this.mat) / 3.0;
			return avg;
		}
		//Grade
		public void getGrade() {
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
		}
		//Method Override - toString
		@Override
		public String toString() {
			return "Score [번호=" + num + ", 이름=" + name + ", 국어=" + kor + ", 영어=" + eng + ", 수학=" + mat + ", 총점="
					+ tot + ", 평균=" + avg + ", 등급=" + grade + "]";
		}
	}
	public class TestScore {
		public static void main(String[] args) { 
			Score sc1 = new Score(1,"사나",70,80,90);
			System.out.println(sc1);
			Score sc2 = new Score(2,"모모",0,70,100);
			System.out.println(sc2);
			Score sc3 = new Score(3,"쯔위",70,90,90);
			System.out.println(sc3);
			Score sc4 = new Score(4,"정연",80,90,70);
			System.out.println(sc4);
			Score sc5 = new Score(5,"원영",90,90,89);
			System.out.println(sc5);
			Score sc6 = new Score(6,"유진",100,100,100);
			System.out.println(sc6);	
		}
	}
