package dao;

import java.util.List;

import entity.Car;

public interface CarDao {

	List<Car> getAll();
	
	void save(Car car);
	
	Car getById(int id);
	
	void update(Car car);
	
	void delete (int id);
}
