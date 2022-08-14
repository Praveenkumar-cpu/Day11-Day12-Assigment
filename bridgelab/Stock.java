package bridgelab;


import java.util.ArrayList;
import java.util.Scanner;

public class Stock {

    public void enterStockDetails(StockPortFolio spf) {

        ArrayList<String> shar_name = new ArrayList<>();
        ArrayList<Double> shar_nos = new ArrayList<>();
        ArrayList<Double> shar_price = new ArrayList<>();

        System.out.println("Enter the number of companies whose stocks you want to enter");
        Scanner sc = new Scanner(System.in);
        int no_stocks = sc.nextInt();

        for (int i = 0; i < no_stocks; i++) {
            System.out.println("Enter the name of share: ");
            Scanner sc1 = new Scanner(System.in);
            String sharename = sc1.next();
            shar_name.add(sharename);
            spf.setShar_price(shar_price);
            spf.setShar_name(shar_name);

            System.out.println("Enter the number of share: ");
            Scanner sc2 = new Scanner(System.in);
            double noofshares = sc2.nextInt();
            shar_nos.add(noofshares);
            spf.setNoOfShares(noofshares);
            spf.setShar_nos(shar_nos);

            System.out.println("Enter the price of share: ");
            Scanner sc3 = new Scanner(System.in);
            double shareprice = sc3.nextInt();
            shar_price.add(shareprice);
            spf.setShar_price(shar_price);
            spf.setShar_price(shar_price);

        }
    }
        public void stockValue(StockPortFolio spf){
            enterStockDetails(spf);
            double stock_tot_val = 0;

            System.out.println("StockName  StockValue");

            for (int i = 0; i < spf.getShar_price().size(); i++) {

                double share_num = (double) spf.getShar_nos().get(i);
                double share_price = (double) spf.getShar_price().get(i);
                String share_name = (String) spf.getShar_name().get(i);

                stock_tot_val += share_num * share_price;

                System.out.println(share_name + "     " + share_num * share_price);
            }
            System.out.println("The total value of all the stocks = " + stock_tot_val);
        }


        public static void main(String[] args)
        {
            StockPortFolio stockpfol = new StockPortFolio();
            Stock sc = new Stock();
            sc.stockValue(stockpfol);


        }


}

