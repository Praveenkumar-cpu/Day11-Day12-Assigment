package bridgelab;

import java.util.ArrayList;

public class StockPortFolio {


        private String shareName;

        private double sharePrice;

        private double noOfShares;

    private ArrayList<String> shar_name = new ArrayList<>();
    private ArrayList<Double> shar_nos = new ArrayList<>();
    private ArrayList<Double> shar_price = new ArrayList<>();

    public String getShareName() {
        return shareName;
    }

    public void setShareName(String shareName) {
        this.shareName = shareName;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }

    public double getNoOfShares() {
        return noOfShares;
    }

    public void setNoOfShares(double noOfShares) {
        this.noOfShares = noOfShares;
    }

    public ArrayList<String> getShar_name() {
        return shar_name;
    }

    public void setShar_name(ArrayList<String> shar_name) {
        this.shar_name = shar_name;
    }

    public ArrayList<Double> getShar_nos() {
        return shar_nos;
    }

    public void setShar_nos(ArrayList<Double> shar_nos) {
        this.shar_nos = shar_nos;
    }

    public ArrayList<Double> getShar_price() {
        return shar_price;
    }

    public void setShar_price(ArrayList<Double> shar_price) {
        this.shar_price = shar_price;
    }
}



