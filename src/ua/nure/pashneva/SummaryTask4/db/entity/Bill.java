package ua.nure.pashneva.SummaryTask4.db.entity;

import java.math.BigDecimal;

public class Bill {
    private int id;
    private BigDecimal mainCost;
    private BigDecimal damageCost;
    private BillStatus billStatus;

    public Bill(BigDecimal mainCost, BigDecimal damageCost, BillStatus billStatus) {
        this.mainCost = mainCost;
        this.damageCost = damageCost;
        this.billStatus = billStatus;
    }

    public Bill() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getMainCost() {
        return mainCost;
    }

    public void setMainCost(BigDecimal mainCost) {
        this.mainCost = mainCost;
    }

    public BigDecimal getDamageCost() {
        return damageCost;
    }

    public void setDamageCost(BigDecimal damageCost) {
        this.damageCost = damageCost;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }
}
