/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
    	Car car = new Car("v8����", "��������̥");
    	System.out.println(car.start());
    	
    	SportsCar sportsCar = new SportsCar("v12", "������̥", "�ѺϽ��ſ�β��");
    	System.out.println(sportsCar.start());
    	System.out.println(sportsCar.speedOn());
    	
    	Truck truck = new Truck("v8", "������̥", "����10�ֻ��ĳ���");
    	System.out.println(truck.start());
    	System.out.println(truck.load());
    }
}
