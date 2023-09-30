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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String carName = request.getParameter("car-name");

        car.setName(carName);

        carDao.createCar(car);

        request.getRequestDispatcher("index.html").forward(request, response);
    }

}