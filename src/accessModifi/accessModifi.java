package accessModifi;

public class accessModifi {

	public static void main(String[] args) {
		// 객체지향의 캡슐화
		
		Time time = new Time();
		
		time.setHour(25); // 직접적인 조작을 하지 못하도록 setter을 이용해서 조건을 걸어둔다.
		int hour = time.getHour(); 
		System.out.println(hour); // 0, 0 ~ 24로 제한을 두었기 때문에 기본값인 0이 출력된다. 
		
	}
}

