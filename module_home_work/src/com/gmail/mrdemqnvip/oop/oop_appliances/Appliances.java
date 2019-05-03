package com.gmail.mrdemqnvip.oop.oop_appliances;

public abstract class Appliances {
    private String typeApp;
    private String brandName;
    private String principOper;

    public Appliances(String typeApp, String brandName, String principOper) {
        this.typeApp = typeApp;
        this.brandName = brandName;
        this.principOper = principOper;
    }

    public String getTypeApp() {
        return typeApp;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getPrincipOper() {
        return principOper;
    }

    @Override
    public String toString() {
        return "Appliances{" +
                "typeApp='" + typeApp + '\'' +
                ", brandName='" + brandName + '\'' +
                ", principOper='" + principOper + '\'' +
                '}';
    }

    public void work() {
        System.out.println("App is working");
    }
}
