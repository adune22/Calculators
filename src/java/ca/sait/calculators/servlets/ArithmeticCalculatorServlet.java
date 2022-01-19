package ca.sait.calculators.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Arithmetic calculator
 *
 * @author Azmat
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstNum = request.getParameter("first");
        String secondNum = request.getParameter("second");

        if (firstNum != null && secondNum != null) {
            try {
                int first = Integer.parseInt(firstNum);

                int second = Integer.parseInt(secondNum);

                int result = 0;
                String operator = request.getParameter("btn");
                if (operator.equals("+")) {
                    result = first + second;
                }
                if (operator.equals("-")) {
                    result = first - second;
                }
                if (operator.equals("*")) {
                    result = first * second;
                }
                if (operator.equals("%")) {
                    result = (first / second) * 100;
                }

                request.setAttribute("result", result);

            } catch (NumberFormatException ex) {
                request.setAttribute("result", "invalid");

            }

        } else {
            request.setAttribute("result", "invalid");

        }

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

    }
}
