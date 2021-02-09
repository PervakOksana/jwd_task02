package by.htp.jwd.dao;

import java.util.ArrayList;

import by.htp.jwd.entity.Oven;
import by.htp.jwd.entity.Thing;

public class OvenCreate implements Creater  {

	public  ArrayList<Thing> ovens = new ArrayList<>();
	
	
	public  ArrayList<Thing> execute(String data) {
		
		Oven oven = new Oven();

		String[] lines = data.split(" : ");

		String[] linef = lines[1].split(", ");

		for (int i = 0; linef.length > i; i++) {
			String[] linefd = linef[i].split("=");
			if (linefd[0].equalsIgnoreCase("powerConsumption")) {
				oven.setPowerConsumption(Double.parseDouble(linefd[1]));

			}
			if (linefd[0].equalsIgnoreCase("weight")) {
				oven.setWeigh(Double.parseDouble(linefd[1]));

			}
			if (linefd[0].equalsIgnoreCase("capacity")) {
				oven.setCapacity(Double.parseDouble(linefd[1]));

			}
			if (linefd[0].equalsIgnoreCase("depth")) {
				oven.setDepth(Double.parseDouble(linefd[1]));

			}
			if (linefd[0].equalsIgnoreCase("height")) {
				oven.setHeight(Double.parseDouble(linefd[1]));

			}
			if (linefd[0].equalsIgnoreCase("width")) {
				oven.setWidth(Double.parseDouble(linefd[1]));

			}
			if (linefd[0].equalsIgnoreCase("price")) {
				oven.setPrice(Double.parseDouble(linefd[1]));

			}
		}
		ovens.add(oven);
		return ovens;
		
		
	}
	
}
