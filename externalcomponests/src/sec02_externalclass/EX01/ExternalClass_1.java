package sec02_externalclass.EX01;
//외부 클래스 정의 public 설정 불가능-다른 패키지에서 사용 불가능
class A{
	int m=3;
	int n=4;
	void print() {
		System.out.println(m+", "+n);}//void print end
}//class A end

public class ExternalClass_1 {//java 파일 이름과 같은 클래스 최대1개 존재
public static void main(String[] args) {
	A a=new A();
	a.print();
	
}
}
