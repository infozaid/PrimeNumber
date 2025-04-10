package com.mobiliser.test;

public class Customer {

    private Character dbBolSpare5;

    public Boolean getBolSpare5() {
        return this.dbBolSpare5 == null ? null : this.dbBolSpare5.equals('Y');
    }

    public void setBolSpare5(Boolean bolSpare5) {
        this.dbBolSpare5 = bolSpare5 == null ? null : Character.valueOf((char)(bolSpare5 ? 'Y' : 'N'));
    }
}
