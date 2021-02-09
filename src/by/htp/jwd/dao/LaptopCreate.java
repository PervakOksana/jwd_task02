package by.htp.jwd.dao;

import java.util.ArrayList;

import by.htp.jwd.entity.Laptop;
import by.htp.jwd.entity.Thing;

public class LaptopCreate implements Creater{

	public  ArrayList<Thing> laptops = new ArrayList<>();
	
	@Override
	public ArrayList<Thing> execute(String data) {
		Laptop laptop = new Laptop();

		String[] lines = data.split(" : ");

		String[] linef = lines[1].split(", ");
		

		for (int i = 0; linef.length > i; i++) {
			String[] linefd = linef[i].split("=");
			if (linefd[0].equalsIgnoreCase("batteryCapacity")) {
				laptop.setBatteryCapacity(Double.parseDouble(linefd[1]));

			}
			if (linefd[0].equalsIgnoreCase("os")) {
				laptop.setOs(linefd[1]);

			}
			if (linefd[0].equalsIgnoreCase("memoryRom")) {
				laptop.setMemoryRom(Double.parseDouble(linefd[1]));

			}
			if (linefd[0].equalsIgnoreCase("systemMemory")) {
				laptop.setSystemMemory(Double.parseDouble(linefd[1]));

			}
			if (linefd[0].equalsIgnoreCase("cpu")) {
				laptop.setCpu(Double.parseDouble(linefd[1]));

			}
			if (linefd[0].equalsIgnoreCase("displayInchs")) {
				laptop.setDisplayInchs(Double.parseDouble(linefd[1]));

			}
			if (linefd[0].equalsIgnoreCase("price")) {
				laptop.setPrice(Double.parseDouble(linefd[1]));

			}
		}
		laptops.add(laptop);
		return laptops;
	}

	

}
