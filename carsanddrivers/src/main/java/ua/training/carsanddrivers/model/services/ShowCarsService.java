package ua.training.carsanddrivers.model.services;

import java.util.List;

import ua.training.carsanddrivers.model.dao.DAOFactory;
import ua.training.carsanddrivers.model.dao.GenericDAO;
import ua.training.carsanddrivers.model.entity.Car;

public class ShowCarsService {
	
	public List<Car> getCars() {
		try (GenericDAO<Car> carDAO = DAOFactory.getInstance().createCarDAO()) {
			return carDAO.getAll(true);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}

}
