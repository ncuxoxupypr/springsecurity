package web.dao;

import web.model.Role;

import java.util.List;

public interface RoleDao {
    Role getRoleByName(String role);
    List<Role> list_roles();
}
