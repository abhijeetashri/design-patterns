package com.design.pattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class CarDriver {

	public static void main(String[] args) throws CloneNotSupportedException {
		List<Car> cars = new ArrayList<>();

		Car car = new MarutiSwift("Blue", 5, "1200cc", false);
		System.out.println(car);
		cars.add(car);

		car = new ToyotaCorolla("White", 5, "1200cc", false);
		System.out.println(car);
		cars.add(car);

		cloneAndCompare(cars, new ArrayList<>());
	}

	private static void cloneAndCompare(List<Car> cars, List<Car> clonedCars) throws CloneNotSupportedException {
		for (Car aCar : cars) {
			clonedCars.add(aCar.clone());
		}

		for (int i = 0; i < cars.size(); i++) {
			if (cars.get(i) != clonedCars.get(i)) {
				System.out.println(i + ": Cars are different objects (yay!)");
				if (cars.get(i).equals(clonedCars.get(i))) {
					System.out.println(i + ": And they are identical (yay!)");
				} else {
					System.out.println(i + ": But they are not identical (booo!)");
				}
			} else {
				System.out.println(i + ": Car objects are the same (booo!)");
			}
		}
	}
}
