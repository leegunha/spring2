package di;

public class MainEntry {
	public static void main(String[] args) {  //
		MessageBean bean = new MessageBean();  
		int a = 30;
		System.out.println("=====================");
		bean.sayHello("doyeon");
		System.out.println("=====================");
		show();
		show();
		System.out.println("main method call!!!");	
		show();
	}
	
	public static void show() {
		System.out.println("show method call~~~");
	}
	
}
