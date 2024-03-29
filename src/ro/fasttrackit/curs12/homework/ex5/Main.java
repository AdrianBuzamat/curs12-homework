package ro.fasttrackit.curs12.homework.ex5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CarShop carShop = new CarShop(List.of(
                new Car("Mercedes A180", 10, 165000, 6000),
                new Car("Volvo S60", 2, 15000, 36000),
                new Car("Opel Zafira", 12, 265000, 620),
                new Car("BMW X3", 4, 65000, 36000),
                new Car("Honda CR-V", 4, 165000, 10400),
                new Car("Opel Zafira", 11, 165000, 820),
                new Car("Volvo S60", 3, 25000, 32000),
                new Car("Mercedes A180", 11, 185000, 5800),
                new Car("Fiat Punto", 14, 465000, 600)));

        System.out.println(carShop.getCarList());
        System.out.println(numberOfSameCars(carShop));
        System.out.println(kmOfSameCars(carShop));
        System.out.println(carsByRangeKm(carShop, new CarRange(1, 50000)));
        System.out.println(carsByRangePrice(carShop, new CarRange(500, 5000)));

    }

    public static Map<String, Integer> numberOfSameCars(CarShop carShop) {
        Map<String, Integer> result = new HashMap<>();
        for (Car car : carShop.getCarList()) {
            result.put(car.name(), countSameCar(carShop, car.name()));
        }
        return result;
    }

    public static Map<String, Integer> kmOfSameCars(CarShop carShop) {
        Map<String, Integer> result = new HashMap<>();
        for (Car car : carShop.getCarList()) {
            result.put(car.name(), sumKmSameCar(carShop, car.name()));
        }
        return result;
    }

    public static Map<CarRange, List<Car>> carsByRangeKm(CarShop carShop, CarRange range) {
        Map<CarRange, List<Car>> result = new HashMap<>();
        CarRange kmRange = new CarRange(range.lowLimit(), range.highLimit());
        List<Car> carList = new ArrayList<>();
        for (Car car : carShop.getCarList()) {
            if (car.km() > kmRange.lowLimit() & car.km() < kmRange.highLimit()) {
                carList.add(car);
            }
        }
        result.put(kmRange, carList);
        return result;
    }

    public static Map<CarRange, List<Car>> carsByRangePrice(CarShop carShop, CarRange range) {
        Map<CarRange, List<Car>> result = new HashMap<>();
        CarRange priceRange = new CarRange(range.lowLimit(), range.highLimit());
        List<Car> carList = new ArrayList<>();
        for (Car car : carShop.getCarList()) {
            if (car.price() > priceRange.lowLimit() & car.price() < priceRange.highLimit()) {
                carList.add(car);
            }
        }
        result.put(priceRange, carList);
        return result;
    }

    public static int countSameCar(CarShop carShop, String carName) {
        int result = 0;
        for (Car car : carShop.getCarList()) {
            if (carName.equalsIgnoreCase(car.name())) {
                result++;
            }
        }
        return result;
    }

    public static int sumKmSameCar(CarShop carShop, String carName) {
        int result = 0;
        for (Car car : carShop.getCarList()) {
            if (carName.equalsIgnoreCase(car.name())) {
                result += car.km();
            }
        }
        return result;
    }
}
