package philharmonic.service;

import philharmonic.model.ShoppingCart;
import philharmonic.model.Order;
import philharmonic.model.User;

import java.util.List;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
