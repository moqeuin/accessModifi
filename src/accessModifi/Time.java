package accessModifi;

public class Time {
	// 인스턴스를 생성해도 직접적으로 인스턴스 변수를 조작하지 못하도록한다.
	private int hour;
	private int minute;
	private int second;
	
	public Time() {}
	
	// 모든 setter는 값의 제한을 두어서 값의 범위를 넘지 못하도록 한다.
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour < 0 || hour > 24) {
			return;
		}
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute <0 || minute > 60) {
			return;
		}
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second <0 || second >60) {
		this.second = second;
		}
	}
	
	
}
