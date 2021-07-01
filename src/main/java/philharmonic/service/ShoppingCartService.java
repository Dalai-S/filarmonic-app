package philharmonic.service;

import philharmonic.model.ShoppingCart;
import philharmonic.model.MovieSession;
import philharmonic.model.User;

public interface ShoppingCartService {
    void addSession(MovieSession movieSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clear(ShoppingCart shoppingCart);
}
