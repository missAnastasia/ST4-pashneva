package ua.nure.pashneva.SummaryTask4.db.entity;

public enum Role {
    ADMIN, CLIENT, MANAGER;

    public static Role getRole(User user) {
        int roleId = user.getRoleId();
        return Role.values()[roleId - 1];
    }

    public static int getRoleOrdinal(String name) {
        Role role = Role.valueOf(name) ;
        return role.ordinal();
    }

    public String getName() {
        return name().toLowerCase();
    }

}
