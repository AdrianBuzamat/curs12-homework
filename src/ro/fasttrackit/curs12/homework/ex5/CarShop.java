package ro.fasttrackit.curs12.homework.ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CarShop {
    private final List<Car> carList;

    public CarShop (List<Car> carList){
        this.carList=carList == null?
                new ArrayList<>():
                new ArrayList<>(carList);
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void addCarToList (Car car){
        carList.add(car);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarShop carShop = (CarShop) o;
        return Objects.equals(carList, carShop.carList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carList);
    }
}
