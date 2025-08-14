public class DomainApplication {

    public static void main(String[] args) {

       // B = Registration Price (e.g., 100.00)
//    C = Renewal Price (e.g., 100.00)
//    D = Transfer Price (e.g., 50.00)
//    F = Markup % (e.g., 50.00%)
//    G = Fixed Price (optional, used if Price Preference is "Fixed") (e.g., 100.00)
//    H = No. of Renewal Years (e.g., 2) (User-defined)
//    J = Discount (e.g., 10.00%)
//    M = Annual Markup Decrease (e.g., 5.00%)
//    N = Minimum Markup (e.g., 15.00%)

        //    I Markup Price (Strike Through) B * (1 + F)
//    K Final Consumer Price I - (I * J)
//    L Price per Selected Years (Strike Through) (C * (1 + F)) * H
//    O Markup for Selected Years max(F * (1 - M)^H, N)
//    P Price Per Year Final C * (1 + O * J)
//    Q Final Price with Renewals (C * (1 + O) * (1 - J)) * H
    DomainPriceCalculator.DomainPriceResult res = DomainPriceCalculator.calculatePrice
            (100, 100,
                    50, 0.50,
                    100, 2, 0.10, 0.05, 0.15);

        System.out.println("Markup Price: " + res.markupPrice);
        System.out.println("Final Consumer Price: " + res.finalConsumerPrice);
        System.out.println("Price per Selected Years: " + res.pricePerSelectedYears);
       // System.out.println("Markup for Selected Years: "  );
        System.out.println("Price Per Year Final: " + res.pricePerFinalYear);
        System.out.println("Final Price with Renewals: " + res.finalPriceWithRenewals);

    }
}
