package Tomonil.vaika.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
		@Id
		private long IdCar;
		private String Image;
		private String Name;
		public Car(long idCar, String image, String name) {
			super();
			IdCar = idCar;
			Image = image;
			Name = name;
		}
		public Car() {
			super();
		}
		public long getIdCar() {
			return IdCar;
		}
		public void setIdCar(long idCar) {
			IdCar = idCar;
		}
		public String getImage() {
			return Image;
		}
		public void setImage(String image) {
			Image = image;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}

		
}
