package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import org.springframework.validation.BindingResult;

import entity.Car;
import service.CarService;

@Controller
@RequestMapping("/")
public class CarController {
	
	@Autowired
	public CarService carService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/carsList")
	public String carsList() {
		return "carsList";
	}
	
	@GetMapping("/cars")
	//Model need for working between view and controller
	public String getAllUsers(Model model) {
		model.addAttribute("cars", carService.getAll());
		return "carsList";
	}
	
	@GetMapping("/car/{id}")
	public String getById(@PathVariable("id") int id, Model model) {
		model.addAttribute("car", carService.getById(id));
		return "showCar";
	}

	@GetMapping("/update/{id}")
	public String update(@PathVariable("id") int id, Model model) {
		model.addAttribute("car", carService.getById(id));
		return "editCars";
	}
	
	@PostMapping("/updateCar")
	public String updateCar(@ModelAttribute("car") Car car) {
		carService.update(car);
		return "redirect:/car/" + car.getId();
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id) {
		carService.delete(id);
		return "redirect:/cars";
	}

	@PostMapping("/addCar")
	public String addCar(@Valid Car car, BindingResult bindingResult, Model model) {
		if (!bindingResult.hasErrors()) {
            model.addAttribute("noErrors", true);
            carService.save(car);
        }
        return "createCar";
	}
	
	@GetMapping("/addCar")
	public String createCarPage(Model model) {
		model.addAttribute("car", new Car());
		return "createCar";
	} 
		
}
