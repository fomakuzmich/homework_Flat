package by.epam.homeworkFlat.main;

import by.epam.homeworkFlat.bean.Flat;
import by.epam.homeworkFlat.bean.House;
import by.epam.homeworkFlat.logic.FlatLogic;
import by.epam.homeworkFlat.view.OutputToConsole;

public class Main {

	public static void main(String[] args) {
		
		FlatLogic fl = new FlatLogic();
		OutputToConsole otc = new OutputToConsole();
		
		Flat one = new Flat(1, 80, 1, 2);
		Flat two = new Flat(2, 125.5, 1, 3);
		Flat three = new Flat(3, 45.4, 2, 1);
		Flat four = new Flat(4, 54.6, 2, 1);
		Flat five = new Flat(5, 80, 3, 2); 
		Flat six = new Flat(6, 125.5, 3, 3);
		Flat seven = new Flat(7, 45.4, 4, 1);
		Flat eight = new Flat(8, 54.6, 4, 1);
		Flat nine = new Flat(9, 80, 5, 2);
		Flat ten = new Flat(10, 125.5, 5, 3);
		Flat eleven = new Flat(11, 45.4, 6, 1);
		Flat twelve = new Flat(12, 54.6, 6, 1);
		
		Flat thirteen = new Flat(1, 142.5, 1, 2);
		Flat fourteen = new Flat(2, 85.5, 1, 1);
		Flat fifteen = new Flat(3, 85.5, 1, 1);
		Flat sixteen = new Flat(4, 67, 1, 1);
		
		Flat seventeen = new Flat(1, 80, 1, 3);
		Flat eighteen = new Flat(2, 25.5, 1, 1);
		Flat nineteen = new Flat(3, 45.4, 1, 2);
		Flat twenty = new Flat(4, 54.6, 1, 2);
		Flat twenty1 = new Flat(5, 80, 2, 3); 
		Flat twenty2 = new Flat(6, 25.5, 2, 1);
		Flat twenty3 = new Flat(7, 45.4, 2, 2);
		Flat twenty4 = new Flat(8, 54.6, 2, 2);
		Flat twenty5 = new Flat(9, 80, 3, 3);
		Flat twenty6 = new Flat(10, 25.5, 3, 1);
		Flat twenty7 = new Flat(11, 45.4, 3, 2);
		Flat twenty8 = new Flat(12, 54.6, 3, 2);
		
		Flat twenty9 = new Flat(1, 70, 1, 2);
		Flat thirty = new Flat(2, 80.5, 1, 3);
		Flat thirty1 = new Flat(3, 85.5, 1, 3);
		Flat thirty2 = new Flat(4, 70, 2, 2);
		Flat thirty3 = new Flat(5, 80.5, 2, 3);
		Flat thirty4 = new Flat(6, 85.5, 2, 3);
		Flat thirty5 = new Flat(7, 70, 3, 2);
		Flat thirty6 = new Flat(8, 80.5, 3, 3);
		Flat thirty7 = new Flat(9, 85.5, 3, 3);
		Flat thirty8 = new Flat(10, 236, 4, 5);
		
		House elite = new House("Central", 1, 10, true, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve);
		House commercial = new House("Central", 2, 5, false, thirteen, fourteen, fifteen, sixteen);
		House cheaper = new House("Suburban", 37, 35, true, seventeen, eighteen, nineteen, twenty, twenty1, twenty2, twenty3, twenty4, twenty5, twenty6, twenty7, twenty8);
		House middle = new House("Budgetary", 10, 15, true, twenty9, thirty, thirty1, thirty2, thirty3, thirty4, thirty5, thirty6, thirty7, thirty8);
		
		otc.flatToConsole(fl.byNuberOfRooms(2, elite));
		
		otc.flatToConsole(fl.byNuberOfRooms(2, fl.byFloor(1, 2, cheaper)));
		
		otc.flatToConsole(fl.byArea(100, commercial));
		
		otc.flatToConsole(fl.byNuberOfRooms(2, middle, cheaper));
		
		otc.flatToConsole(fl.byFloor(1, 2, fl.byNuberOfRooms(3, fl.byArea(80, elite, commercial, cheaper, middle))));
		
	}

}
