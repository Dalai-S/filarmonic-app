package philharmonic.service.impl;

import philharmonic.dao.RoleDao;
import philharmonic.exception.DataProcessingException;
import philharmonic.service.RoleService;
import philharmonic.model.Role;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public void add(Role role) {
        roleDao.add(role);
    }

    @Override
    public Role getRoleByName(Role.RoleName roleName) {
        return roleDao.getRoleByName(roleName).orElseThrow(
                () -> new DataProcessingException("Role with name " + roleName + " not found"));
    }
}
