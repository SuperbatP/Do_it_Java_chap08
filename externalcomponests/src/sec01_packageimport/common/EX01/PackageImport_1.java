package sec01_packageimport.common.EX01;
//다른 패키지에 있는 클래스를 가져와 활용하는 방법 1. 클래스의 풀네임 사용
public class PackageImport_1 {
public static void main(String[] args) {
	//풀네임을 넣어서 객체 생성
	sec01_packageimport.common.A a= new sec01_packageimport.common.A();
	//멤버활용 
	System.out.println(a.m);
	System.out.println(a.n);
	a.print();
}
}
