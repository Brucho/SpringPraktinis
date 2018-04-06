package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.CarDao;
import entity.Car;

@Service
public class CarServiceImpl implements CarService{
	
	@Autowired
	public CarDao carDao;

	@Override
	public List<Car> getAll() {
		return carDao.getAll();
	}

	@Override
	public void save(Car car) {
		carDao.save(car);
	}

	@Override
	public Car getById(int id) {
		return carDao.getById(id);
	}

	@Override
	public void update(Car car) {
		carDao.update(car);
	}

	@Override
	public void delete(int id) {
		carDao.delete(id);
	}
}