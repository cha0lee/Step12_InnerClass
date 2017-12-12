package test.mypac;

public class Factory {
	//Car car = new Car();
	
	/*class MyCar extends Car{
		@Override
		public void drive() {
			System.out.println("빨리 달려요.");
		}
	}
	
	public Car car = new MyCar();
	*/
	//익명 inner class
	public Car car = new Car() {
		@Override
		public void drive() {
			// TODO Auto-generated method stub
			super.drive();
		}
	};
	
	//멤버 필드에 있는 Car 객체를 사용하는 메소드
	public void useCar() {
		car.drive();
	}

}
