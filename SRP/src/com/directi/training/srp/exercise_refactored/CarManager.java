package com.directi.training.srp.exercise_refactored;

public class CarManager {

    private final CarDb _carDb;
    private final CarComparatorStrategy _carComparisonStrategy;
    private final CarFormatterStrategy _carFormatterStrategy;

    public CarManager(CarDb _carDb, CarComparatorStrategy _carComparisonStrategy, CarFormatterStrategy _carFormatterStrategy) {
        this._carDb = _carDb;
        this._carComparisonStrategy = _carComparisonStrategy;
        this._carFormatterStrategy = _carFormatterStrategy;
    }

    public Car getFromDb(final String carId) {
        return _carDb.getCar(carId);
    }

    public String getCarsNames() {
        return _carFormatterStrategy.format(this._carDb.getCars());
    }

    public Car getBestCar() {
        return _carComparisonStrategy.compare(this._carDb.getCars());
    }
}