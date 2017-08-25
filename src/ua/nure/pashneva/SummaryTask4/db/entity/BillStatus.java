package ua.nure.pashneva.SummaryTask4.db.entity;

public enum  BillStatus {
    NOT_PAID,
    SERVICE_PAID,
    DAMAGE_PAID,
    PAID;

    public static BillStatus getBillStatus(int ordinal) {
        return BillStatus.values()[ordinal - 1];
    }

    public static int getBillStatusOrdinal(String name) {
        BillStatus billStatus = BillStatus.valueOf(name) ;
        return billStatus.ordinal() + 1;
    }

    public static int getBillStatusOrdinal(BillStatus billStatus) {
        return billStatus.ordinal() + 1;
    }

    public String getName() {
        return name().toLowerCase();
    }
}
