package ca.sait.calculators.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Determines the next age of the person.
 *
 * @author Azmat
 */
public class AgeCalculatorServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String ageInput = request.getParameter("age");

        if (ageInput != null) {
            try {
                int age = Integer.parseInt(ageInput);

                age += 1;

                String message = String.format("You will be %d after your next birthday.", age);

                request.setAttribute("message", message);
            } catch (NumberFormatException ex) {

                request.setAttribute("message", "You must enter a number");

            }

        } else {
            request.setAttribute("message", "You must give your current age.");

        }

        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);

    }
}
