package di2;

public class MessagBeanImpKr implements MessagBean {

	@Override
	public void sayHello(String name) {
		System.out.println("안녕하세요 " + name + " 님!!!");
	}

}
