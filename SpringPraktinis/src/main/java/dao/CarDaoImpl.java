package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import entity.Car;
import mapper.CarMapper;

public class CarDaoImpl implements CarDao{

	public final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public CarDaoImpl (JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public List<Car> getAll() {
		String sql = "SELECT * FROM cars"; 
		return jdbcTemplate.query(sql, new CarMapper());
	}

	@Override
	public void save(Car car) {
		String sql = "INSERT INTO cars (name, year, model, type, transmission) VALUES (?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, car.getName(), car.getYear(), car.getModel(), car.getType(), car.getTransmission());
		
	}

	@Override
	public Car getById(int id) {
		String sql = "SELECT * FROM cars WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, new CarMapper(), id);
	}

	@Override
	public void update(Car car) {
		String sql = "UPDATE cars SET name = ?, year = ?, model = ?, type = ?, transmission = ? WHERE id = ?";
		jdbcTemplate.update(sql, car.getName(), car.getYear(), car.getModel(), car.getType(), car.getTransmission(), car.getId());
	}

	@Override
	public void delete(int id) {
		String sql = "DELETE FROM cars WHERE id = ?";
		jdbcTemplate.update(sql, id);
	}

}
