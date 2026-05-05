package com.example.movietickets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/book")
public class MovieTicketsServlet extends HttpServlet {
    private String[] movies = {"Avengers", "Inception", "Interstellar"};
    private int[] prices = {250, 200, 220};

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.getWriter().println("<h2>🎬 Welcome to Movie Tickets App 🎟️</h2>");
        resp.getWriter().println("<ul>");
        for (int i = 0; i < movies.length; i++) {
            resp.getWriter().println("<li>" + movies[i] + " - Rs." + prices[i] + "</li>");
        }
        resp.getWriter().println("</ul>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        int choice = Integer.parseInt(req.getParameter("movie"));
        int tickets = Integer.parseInt(req.getParameter("tickets"));
        int totalCost = tickets * prices[choice - 1];

        resp.setContentType("text/html");
        resp.getWriter().println("You booked " + tickets + " tickets for " + movies[choice - 1]);
        resp.getWriter().println("<br>Total cost: Rs." + totalCost);
    }
}
