package com.practice.creationalPattern.factoryDesignPattern;

import com.practice.creationalPattern.factoryDesignPattern.beans.Computer;
import com.practice.creationalPattern.factoryDesignPattern.factory.ComputerFactory;
import com.practice.creationalPattern.factoryDesignPattern.factory.ComputerType;

public class ComputerClient {

	public static void main(String[] args) {

		Computer pc = ComputerFactory.createComputer(ComputerType.PC, "1GB", "256GB", "Intel Core 2 Duo");

		Computer server = ComputerFactory.createComputer(ComputerType.SERVER, "32GB", "1TB", "AMD Ryzen 7 2700X");
	}

}