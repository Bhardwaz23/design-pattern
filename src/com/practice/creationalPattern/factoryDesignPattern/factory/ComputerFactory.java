package com.practice.creationalPattern.factoryDesignPattern.factory;

import com.practice.creationalPattern.factoryDesignPattern.beans.Computer;
import com.practice.creationalPattern.factoryDesignPattern.beans.PC;
import com.practice.creationalPattern.factoryDesignPattern.beans.Server;

public class ComputerFactory {

public static Computer createComputer(ComputerType type, String ram, String hdd, String cpu) {

	Computer comp = null;
	switch (type) {
	case PC:
		comp = new PC(ram, hdd, cpu);
		break;
	case SERVER:
		comp = new Server(ram, hdd, cpu);
		break;
	}

	return comp;
}
}