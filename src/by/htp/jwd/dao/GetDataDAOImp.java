package by.htp.jwd.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import by.htp.jwd.entity.Thing;

public class GetDataDAOImp implements GetDataDAO {

	public String process() {
		String data = "";
		try (FileInputStream fin = new FileInputStream("D://IT//EPAM//20210202//notes.txt")) {

			int i = -1;
			while ((i = fin.read()) != -1) {

				data = data + ((char) i);
			}
		} catch (IOException ex) {

			System.out.println(ex.getMessage());
		}
		return data;
	}

	@Override
	public ArrayList<Thing> getDataOver() {
		String data = process();
		OvenCreate ovenCreate = new OvenCreate();
		String[] lines = data.split("\n");

		for (int i = 0; lines.length > i; i++) {
			String[] words = lines[i].split(" : ");

			if (words[0].matches("^[a-zA-Z0-9!]*$") & "oven".equals(words[0])) {
				ovenCreate.execute(lines[i]);
			}
		}
		return ovenCreate.ovens;
	}

	@Override
	public ArrayList<Thing> getDataLaptop() {

		String data = process();
		LaptopCreate laptopCreate = new LaptopCreate();
		String[] lines = data.split("\n");

		for (int i = 0; lines.length > i; i++) {
			String[] words = lines[i].split(" : ");

			if (words[0].matches("^[a-zA-Z0-9!]*$") & "laptop".equals(words[0])) {
				laptopCreate.execute(lines[i]);

			}
		}
		return laptopCreate.laptops;
	}

	@Override
	public ArrayList<Thing> getDataRefrigerator() {

		String data = process();
		RefrigeratorCreate refrigeratorCreate = new RefrigeratorCreate();
		String[] lines = data.split("\n");

		for (int i = 0; lines.length > i; i++) {
			String[] words = lines[i].split(" : ");

			if (words[0].matches("^[a-zA-Z0-9!]*$") & "refrigerator".equals(words[0])) {
				refrigeratorCreate.execute(lines[i]);

			}
		}
		return refrigeratorCreate.refrigerators;

	}

	@Override
	public ArrayList<Thing> getDataAll() {

		ArrayList<Thing> things = new ArrayList<>();
		ArrayList<Thing> ovens = getDataOver();
		ArrayList<Thing> laptops = getDataLaptop();
		ArrayList<Thing> refrigerators = getDataRefrigerator();

		things.addAll(ovens);
		things.addAll(laptops);
		things.addAll(refrigerators);

		return things;
	}

}
