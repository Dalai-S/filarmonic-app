package philharmonic.util;

import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import philharmonic.model.Role;
import philharmonic.model.User;
import philharmonic.service.RoleService;
import philharmonic.service.UserService;

@Component
public class DataInitializer {
    private final RoleService roleService;
    private final UserService userService;

    public DataInitializer(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public void inject() {
        Role user = new Role();
        user.setName(Role.RoleName.USER);
        Role admin = new Role();
        admin.setName(Role.RoleName.ADMIN);

        roleService.add(user);
        roleService.add(admin);

        User userUser = new User();
        userUser.setEmail("user@domain.com");
        userUser.setPassword("12345678");
        userUser.setRoles(Set.of(roleService.getRoleByName(Role.RoleName.USER)));
        userService.add(userUser);

        User userAdmin = new User();
        userAdmin.setEmail("admin@domail.com");
        userAdmin.setPassword("12345678");
        userAdmin.setRoles(Set.of(roleService.getRoleByName(Role.RoleName.ADMIN)));
        userService.add(userAdmin);
    }
}