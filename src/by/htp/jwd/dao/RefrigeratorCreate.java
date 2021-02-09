package by.htp.jwd.dao;

import java.util.ArrayList;
import by.htp.jwd.entity.Refrigerator;
import by.htp.jwd.entity.Thing;

public class RefrigeratorCreate implements Creater{

	public  ArrayList<Thing> refrigerators = new ArrayList<>();
	@Override
	public ArrayList<Thing> execute(String data) {
		
		
		Refrigerator refrigerator = new Refrigerator();

		String[] lines = data.split(" : ");

		String[] linef = lines[1].split(", ");
		

		for (int i = 0; linef.length > i; i++) {
			String[] linefd = linef[i].split("=");
			if (linefd[0].equalsIgnoreCase("powerConsumption")) {
				refrigerator.setPowerConsumption(Double.parseDouble(linefd[1]));

			}
			if (linefd[0].equalsIgnoreCase("weigh")) {
				refrigerator.setWeigh(Double.parseDouble(linefd[1]));

			}
			if (linefd[0].equalsIgnoreCase("freezerCapacity")) {
				refrigerator.setFreezerCapacity(Double.parseDouble(linefd[1]));

			}
			if (linefd[0].equalsIgnoreCase("overallCapacity")) {
				refrigerator.setOverallCapacity(Double.parseDouble(linefd[1]));

			}
			if (linefd[0].equalsIgnoreCase("height")) {
				refrigerator.setHeight(Double.parseDouble(linefd[1]));

			}
			if (linefd[0].equalsIgnoreCase("width")) {
				refrigerator.setWidth(Double.parseDouble(linefd[1]));

			}
			if (linefd[0].equalsIgnoreCase("price")) {
				refrigerator.setPrice(Double.parseDouble(linefd[1]));

			}
		}
		refrigerators.add(refrigerator);
		return refrigerators;
	}

	
}
