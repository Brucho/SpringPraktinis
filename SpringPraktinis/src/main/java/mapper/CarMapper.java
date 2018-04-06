package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import entity.Car;


public class CarMapper implements RowMapper<Car> {

	@Override
	public Car mapRow(ResultSet rs, int rowNum) throws SQLException {
		Car car = new Car();
		car.setId(rs.getInt("id"));
		car.setName(rs.getString("name"));
		car.setYear(rs.getInt("year"));
		car.setModel(rs.getString("model"));
		car.setType(rs.getString("type"));
		car.setTransmission(rs.getString("transmission"));
		
		return car;
	}

}