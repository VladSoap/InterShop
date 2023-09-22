package ua.ishop.controller;


import ua.ishop.factory.ProductServiceFactory;
import ua.ishop.model.Product;
import ua.ishop.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/product")
public class AllProductsServlet extends HttpServlet {


    private static final ProductService productService = ProductServiceFactory.getProductService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> products = productService.getProducts();

        req.setAttribute("allProducts", products);
        req.getRequestDispatcher("/products.jsp").forward(req, resp);
    }


}