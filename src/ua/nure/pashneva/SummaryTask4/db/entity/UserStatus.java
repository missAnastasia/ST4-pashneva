package ua.nure.pashneva.SummaryTask4.db.entity;

public enum  UserStatus {
    UNBLOCKED, BLOCKED;

    public static UserStatus getUserStatus(int ordinal) {
        return UserStatus.values()[ordinal - 1];
    }

    public static int getUserStatusOrdinal(String name) {
        UserStatus userStatus = UserStatus.valueOf(name) ;
        return userStatus.ordinal() + 1;
    }

    public static int getUserStatusOrdinal(UserStatus userStatus) {
        return userStatus.ordinal() + 1;
    }

    public String getName() {
        return name().toLowerCase();
    }
}
