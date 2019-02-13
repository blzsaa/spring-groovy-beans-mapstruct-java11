package hu.blzsaa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  private CarMapper carMapper;

  @Autowired
  public HelloController(CarMapper carMapper) {
    this.carMapper = carMapper;
  }

  @GetMapping("/hello")
  public CarDto hello() {
    Car car = new Car();
    car.setAutomatic(true);
    car.setModel("asd");
    return carMapper.carToCarDto(car);
  }
}
