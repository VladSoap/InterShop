package ua.ishop.dao.impl;

import org.apache.log4j.Logger;
import ua.ishop.dao.ProductDao;
import ua.ishop.model.Product;
import ua.ishop.util.DbConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao {
    private static final Logger logger = Logger.getLogger(ProductDaoImpl.class);

    @Override
    public void save(Product product) {
        Connection connection = DbConnector.getConnection();
        String sql = "INSERT INTO product (name, price, description) VALUES (?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, product.getName());
            ps.setDouble(2, product.getPrice());
            ps.setString(3, product.getDescription());

            ps.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public List<Product> getProducts() {
        Connection connection = DbConnector.getConnection();
        String sql = "SELECT * FROM product ORDER BY product_id";

        List<Product> productList = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Product product = new Product(
                        rs.getLong("product_id"),
                        rs.getString("name"),
                        rs.getDouble("price"),
                        rs.getString("description"));
                productList.add(product);
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return productList;
    }

    @Override
    public Product findProductByName(String name) {
        Connection connection = DbConnector.getConnection();
        String sql = "SELECT * FROM product WHERE name = ?";

        Product product = null;
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                product = new Product(
                        rs.getLong("product_id"),
                        rs.getString("name"),
                        rs.getDouble("price"),
                        rs.getString("description"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return product;
    }

    @Override
    public Product getProductById(long productId) {
        Connection connection = DbConnector.getConnection();
        String sql = "SELECT * FROM product WHERE product_id = ?";

        Product product = null;
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setLong(1, productId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                product = new Product(
                        rs.getLong("product_id"),
                        rs.getString("name"),
                        rs.getDouble("price"),
                        rs.getString("description"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return product;
    }

    @Override
    public void updateProduct(Product product) {
        String sql = "UPDATE product SET name = ?, price = ?, description = ? WHERE product_id = ?";
        try {
            Connection connection = DbConnector.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, product.getName());
            ps.setDouble(2, product.getPrice());
            ps.setString(3, product.getDescription());

            ps.executeUpdate();
        } catch (SQLException sqlException) {
            throw new RuntimeException(sqlException);
        }
    }

    @Override
    public void deleteProductById(long productId) {
        String sql = "DELETE FROM product WHERE product_id = ?";
        try {
            Connection connection = DbConnector.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setLong(1, productId);
            ps.executeUpdate();
        } catch (SQLException sqlException) {
            throw new RuntimeException(sqlException);
        }
    }
}

