package di2;

public class MessagBeanImpEn implements MessagBean {

	@Override
	public void sayHello(String name) {
		System.out.println("Hello " + name + " sir!!!");
	}

}
