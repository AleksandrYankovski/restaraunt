package dao;

public interface DAOFactory {

    public UserDAO getUserDAO();

    public OrderDAO getOrderDAO();

    public ProductDAO getProductDAO();

    public OrderToProductDAO getOrderToProductDAO();

    public DiscontCardDAO getDiscontCardDAO();

}
