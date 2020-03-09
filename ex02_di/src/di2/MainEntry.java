package di2;

public class MainEntry {
	public static void main(String[] args) {
		MessagBeanImpEn en = new MessagBeanImpEn();
		en.sayHello("Spring");
		
		MessagBeanImpKr kr = new MessagBeanImpKr();
		kr.sayHello("스프링");
	}
}
