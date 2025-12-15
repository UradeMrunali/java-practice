public class DomainPriceCalculator {

//    B = Registration Price (e.g., 100.00)
//    C = Renewal Price (e.g., 100.00)
//    D = Transfer Price (e.g., 50.00)
//    F = Markup % (e.g., 50.00%)
//    G = Fixed Price (optional, used if Price Preference is "Fixed") (e.g., 100.00)
//    H = No. of Renewal Years (e.g., 2) (User-defined)
//    J = Discount (e.g., 10.00%)
//    M = Annual Markup Decrease (e.g., 5.00%)
//    N = Minimum Markup (e.g., 15.00%)
//    Output Values to be Calculated:
//    Column Name Formula
//    I Markup Price (Strike Through) B * (1 + F)
//    K Final Consumer Price I - (I * J)
//    L Price per Selected Years (Strike Through) (C * (1 + F)) * H
//    O Markup for Selected Years max(F * (1 - M)^H, N)
//    P Price Per Year Final C * (1 + O * J)
//    Q Final Price with Renewals (C * (1 + O) * (1 - J)) * H

    public static class DomainPriceResult{
        double markupPrice;
        double finalConsumerPrice;
        double pricePerSelectedYears;
        double markupForSelectedYears;
        double pricePerFinalYear;
        double finalPriceWithRenewals;
    }
    public static DomainPriceResult calculatePrice(
            double registrationPrice,
            double renewalPrice, double transferPrice,
            double markupDiscount, double fixedPrice,
            double noOfRenewalYears, double discount,
            double annualMarkupDecrease, double minimumMarkup ) {

        DomainPriceResult result = new DomainPriceResult();
        result.markupPrice = registrationPrice * (1 + markupDiscount);
        result.finalConsumerPrice = result.markupPrice - (result.markupPrice * discount);
        result.pricePerSelectedYears = (renewalPrice * (1 + markupDiscount )) * noOfRenewalYears;
      //  result .markupForSelectedYears = max(markupDiscount * (1 - annualMarkupDecrease) ^ noOfRenewalYears , minimumMarkup);
        result.markupForSelectedYears = Math.max(markupDiscount * Math.pow(1 - annualMarkupDecrease, noOfRenewalYears), minimumMarkup);
        result.pricePerFinalYear = renewalPrice * (1 + result.markupForSelectedYears * discount);
        result.finalPriceWithRenewals = ( renewalPrice * (1 + result.markupForSelectedYears) * (1 - discount)) * noOfRenewalYears;
        return result;
    }
}
