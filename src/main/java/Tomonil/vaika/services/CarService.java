package Tomonil.vaika.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Tomonil.vaika.repo.CarRepository;

@Service
public class CarService {
	@Autowired
	private CarRepository carR;

	public CarService() {
		super();
	}

	public CarService(CarRepository carR) {
		super();
		this.carR = carR;
	}

	public CarRepository getCarR() {
		return carR;
	}

	public void setCarR(CarRepository carR) {
		this.carR = carR;
	}
	
	public String getCommentButton(long idCar) {
		String val = "<a href=\"/add-comment?idCar="+idCar+"\">\r\n" + 
				"                                    <p>here to comment</p>\r\n" + 
				"                                </a>";
		return val;
	}
	
}
