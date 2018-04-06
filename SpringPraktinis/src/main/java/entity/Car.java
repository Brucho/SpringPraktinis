package entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

public class Car {

	private int id;

	@Pattern(regexp="[A-Za-z]{5,15}+", message="Klaidingai ivestas pavadinimas!")
	private String name;

	@Min(value = 1900, message = "Metai turi buti ne mazesni kaip 1900-ieji")
	@Max(value = 2019, message = "Metai turi buti ne didesni kaip 2019-ieji")
	private int year;
	
	@Pattern(regexp="[A-Za-z]{5,15}+", message="Klaidingai ivestas modelis!")
	private String model;
	
	@Pattern(regexp="[A-Za-z]+", message="Klaidingai ivestas tipas!")
	private String type;
	
	@Pattern(regexp="[A-Za-z]+", message="Klaidingai ivestas pavaru dezes tipas!")
	private String transmission;

	
	public Car () {
	}

	public Car(int id, String name, int year, String model, String type, String transmission) {
		this.id = id;
		this.name = name;
		this.year = year;
		this.model = model;
		this.type = type;
		this.transmission = transmission;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
}
