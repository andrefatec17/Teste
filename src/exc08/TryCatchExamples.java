package exc08;
public class TryCatchExamples {
	public static void main(String[] args) {
		try {
			lancaException();
		} catch (NullPointerException e1) {
			System.out.println("deu nullPointer");
			fazAlgumaCoisa();
		} finally{
			finaliza();
		}
	}
	
	@SuppressWarnings("null")
	public static void lancaException(){
		char[] lancaExpt = null;
		System.out.println(lancaExpt[0]);

	}
	
	@SuppressWarnings("null")
	public static void fazAlgumaCoisa() {
		int i = (Integer) null;
		System.out.println(i);
	}
	
	public static void finaliza(){
		System.out.println("Executa mesmo com exceção!");

	}
	
}
