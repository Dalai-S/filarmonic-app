package philharmonic.dao;

import philharmonic.model.Order;
import philharmonic.model.User;

import java.util.List;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
