package service;

import java.util.List;

import entity.Car;

public interface CarService {
	
	List<Car> getAll();
	
	void save(Car car);
	
	Car getById(int id);
	
	void update(Car Car);
	
	void delete (int id);

}
