package ua.nure.pashneva.SummaryTask4.db.entity;

public enum CarStatus {
    FREE,
    BUSY,
    DAMAGED;

    public static CarStatus getCarStatus(int ordinal) {
        return CarStatus.values()[ordinal - 1];
    }

    public static int getCarStatusOrdinal(String name) {
        CarStatus carStatus = CarStatus.valueOf(name) ;
        return carStatus.ordinal() + 1;
    }

    public static int getCarStatusOrdinal(CarStatus carStatus) {
        return carStatus.ordinal() + 1;
    }

    public String getName() {
        return name().toLowerCase();
    }
}
