package ua.nure.pashneva.SummaryTask4.db.entity;

public enum  OrderStatus {
    ACCEPTED,
    EXPECT_SERVICE_PAYMENT,
    EXPECT_DAMAGE_PAYMENT,
    COMPLETED;

    public static OrderStatus getCarStatus(int ordinal) {
        return OrderStatus.values()[ordinal - 1];
    }

    public static int getOrderStatusOrdinal(String name) {
        OrderStatus orderStatus = OrderStatus.valueOf(name) ;
        return orderStatus.ordinal() + 1;
    }

    public static int getOrderStatusOrdinal(OrderStatus orderStatus) {
        return orderStatus.ordinal() + 1;
    }

    public String getName() {
        return name().toLowerCase();
    }
}
