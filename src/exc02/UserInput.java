package exc02;

public class UserInput {

	public static class TextInput {
		StringBuilder values = new StringBuilder();
		public void add(char c) {
			values.append(c);
		}
		public String getValue() {
			return values.toString();
		}
	}
	public static class NumericInput extends TextInput {
		public void add(char c) {
			if (isNumeric(String.valueOf(c))) {
				super.add(c);
			}
		}
		public static boolean isNumeric(String str) {
			//return str.matches("-?\\d+(\\.\\d+)?");
			return str.matches("[\\d]");
		}
	}
	public static void main(String[] args) {
		TextInput input = new NumericInput();
		input.add('1');
		input.add('a');
		input.add('0');
		input.add('1');
		System.out.println(input.getValue());
	}
}
