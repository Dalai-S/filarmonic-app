package philharmonic.service;

import philharmonic.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
