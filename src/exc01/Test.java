package exc01;


public class Test implements Runnable{

	public void run() {
		System.out.println("Qual � a m�sica?");
		throw new RuntimeException("Opa, temos um problema! ");
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Test test = new Test();

		Thread t = new Thread(test);
		t.start();
		System.out.println("Executou o Final do M�todo");
		t.stop();
	}

}
