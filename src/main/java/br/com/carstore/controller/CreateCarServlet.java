package br.com.carstore.controller;

import br.com.carstore.db.CarDao;
import br.com.carstore.model.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-car")
public class CreateCarServlet extends HttpServlet {

    private CarDao carDao = new CarDao();
    private Car car = new Car();

    // 1.Post
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String carId = request.getParameter("id");
        String carName = request.getParameter("car-name");

        carDao = new CarDao();
        car = new Car(carId, carName);

        if (carId == null || carId.isEmpty())
        {
            carDao.createCar(car);
        }
        else
        {
            carDao.updateCar(car);
        }

        response.sendRedirect("/find-all-cars");
    }
}