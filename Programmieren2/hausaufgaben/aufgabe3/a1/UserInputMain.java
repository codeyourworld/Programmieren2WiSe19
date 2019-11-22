package aufgabe3.a1;

public class UserInputMain {

	public static void main(String[] args) {
		String fileName = "userInput.txt";
		SaveUserInput userInput = new SaveUserInput();
		if(userInput.isReadOption()) {
			System.out.println(userInput.readText(fileName));
		} else {
			userInput.writeText(fileName, userInput.getUserInput());
		}
		userInput.close();
	}
}
