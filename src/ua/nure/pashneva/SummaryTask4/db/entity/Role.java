package ua.nure.pashneva.SummaryTask4.db.entity;

public enum Role {
    ADMIN, CLIENT, MANAGER;

    public static Role getRole(int ordinal) {
        return Role.values()[ordinal - 1];
    }

    public static int getRoleOrdinal(String name) {
        Role role = Role.valueOf(name) ;
        return role.ordinal() + 1;
    }

    public static int getRoleOrdinal(Role role) {
        return role.ordinal() + 1;
    }

    public String getName() {
        return name().toLowerCase();
    }

}
