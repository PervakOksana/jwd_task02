package by.htp.jwd.main;


import java.util.Scanner;
import by.htp.jwd.controller.Controller;




public class Main {

	public static void main(String[] args) {
		
		Controller controller = new Controller();
		try (Scanner scanner = new Scanner(System.in)) {
			String time = "Ñontinuation";
			
			System.out.println("1 Show all goods [write down as \"1\"] \n"
					+ "Choose only one category: \n"
					+ "2 Laptop [write down as \"2\"] \n"
					+ "3 Oven [write down as \"3\"] \n"
					+ "4 Refrigerator [write down as \"4\"]\n"
					+ "Find the lowest price: \n"
					+ "5 Laptop [write down as \"5\"] \n"
					+ "6 Oven [write down as \"6\"] \n"
					+ "7 Refrigerator [write down as \"7\"]\n"
					+ "Exit [write down as \"Exit\"]  \n");
			while (time == "Ñontinuation") {
				System.out.println("Change command: ");
				System.out.print(">>");
				String line = "";
				if (scanner.hasNextLine()) {
					line = scanner.nextLine();
				} else {
					System.out.println("Wrong");
				}
				if (line.equals("Exit")) {
					time = line;
				}
				if (!line.equals("Exit")) {
					
					
				System.out.println(controller.doAction(line));
				}
			
			}
		}
	

	}
}
