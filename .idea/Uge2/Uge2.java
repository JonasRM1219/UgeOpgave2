public class Uge2 {

        // Opgave 1: Rabatberegning
        System.out.println("Opgave 1: Rabatberegning");
        double totalPrice = 850.0;
        double finalPrice = 0.0;

        if (totalPrice > 1000) {
            finalPrice = totalPrice * 0.8;
            System.out.println("Du får Rabat (20%)");
        } else {
            finalPrice = totalPrice;
            System.out.println("Ingen rabat");
        }

        System.out.println("Oprindelig pris: " + totalPrice + " kr");
        System.out.println("Slutpris: " + finalPrice + " kr");

        // Opgave 2: BMI-beregning
        System.out.println("\n Opgave 2: BMI-beregning ");
        double weight = 68.0;
        double height = 175.0;

        double heightInMeters = height / 100.0;
        double BMI = weight / (heightInMeters * heightInMeters);
        System.out.println("Vægt: " + weight + " kg");
        System.out.println("Højde: " + height + " cm");
        System.out.println("BMI: " + String.format("%.2f", BMI));

        if (BMI > 25) {
            System.out.println("Status: Overweight");
        } else if (BMI >= 18.5) {
            System.out.println("Status: Normal weight");
        } else {
            System.out.println("Status: Underweight");
        }

        // Opgave 3: Tidshilsner
        System.out.println("\n Opgave 3: Tidshilsner");
        int hour = 8;
        System.out.println("Nuværende time: " + hour);

        if (hour >= 4 && hour < 9) {
            System.out.println("God Morgen!");
        } else if (hour >= 9 && hour < 12) {
            System.out.println("God Formiddag!");
        } else if (hour >= 12 && hour <= 17) {
            System.out.println("God Eftermiddag!");
        } else if (hour >= 18 && hour <= 21) {
            System.out.println("God Aften!");
        } else {
            System.out.println("Godnat!");
        }

        // Opgave 5: Shipping eligibility
        System.out.println("\n Opgave 5: Shipping eligibility");
        double orderPrice = 600.0;
        boolean isMember = true;
        double shippingCost;

        if (orderPrice > 500 || (isMember && orderPrice > 200)) {
            shippingCost = 0.0;
            System.out.println("Gratis fragt!");
        } else {
            shippingCost = 50.0;
            System.out.println("Fragt: 50 kr");
        }

        System.out.println("Ordrepris: " + orderPrice + " kr");
        System.out.println("Medlemsstatus: " + (isMember ? "Medlem" : "Ikke medlem"));
        System.out.println("Fragtomkostning: " + shippingCost + " kr");
        System.out.println("Total beløb: " + (orderPrice + shippingCost) + " kr");

        // Opgave 8: Insurance premium calculator
        System.out.println("\n Opgave 8: Insurance premium calculator");
        int age = 45;
        int accidents = 1;
        boolean riskZone = true;
        int basePremium = 5000;
        int highRiskSurcharge = 2000;
        int totalPremium = basePremium;

        boolean isYoung = age < 25;
        boolean isElderly = age > 70;
        boolean hasManyAccidents = accidents > 2;

        boolean isHighRisk = isYoung || isElderly || hasManyAccidents || riskZone;

        if (isHighRisk) {
            totalPremium += highRiskSurcharge;
            System.out.println("Høj risiko fundet! Tillæg: " + highRiskSurcharge + " kr");
        }

        System.out.println("Alder: " + age + " år");
        System.out.println("Antal ulykker: " + accidents);
        System.out.println("Risikozone: " + (riskZone ? "Ja" : "Nej"));
        System.out.println("Base præmie: " + basePremium + " kr");
        System.out.println("Slutpræmie: " + totalPremium + " kr");

        // Opgave 10: Restaurant menu pricing
        System.out.println("\n Opgave 10: Restaurant menu pricing");
        String item = "steak";
        int quantity = 3;
        double itemPrice = 0.0;

        switch (item.toLowerCase()) {
            case "burger":
                itemPrice = 89.0;
                break;
            case "pizza":
                itemPrice = 95.0;
                break;
            case "salad":
                itemPrice = 65.0;
                break;
            case "pasta":
                itemPrice = 79.0;
                break;
            case "steak":
                itemPrice = 145.0;
                break;
            default:
                System.out.println("Fejl: '" + item + "' findes ikke på menuen");
                itemPrice = 0.0;
        }

        if (itemPrice > 0) {
            double orderTotal = itemPrice * quantity;
            System.out.println("Restaurant Menu Bestilling");
            System.out.println("---------------------------");
            System.out.println("Vare: " + item);
            System.out.println("Enhedspris: " + itemPrice + " kr");
            System.out.println("Antal: " + quantity);
            System.out.println("Samlet pris: " + orderTotal + " kr");

            if (orderTotal > 150) {
                System.out.println("Ikke kvalificeret til Rabat");
            }
        }

        // Opgave 15: Savings goal
        System.out.println("\n Opgave 15: Savings goal");
        double savings = 0.0;
        double monthlyDeposit = 750.0;
        double goal = 15000.0;
        int months = 0;

        System.out.println("Opsparingsmål: " + goal + " kr");
        System.out.println("Månedlig indbetaling: " + monthlyDeposit + " kr");
        System.out.println("\nOpsparingsforløb:");

        while (savings < goal) {
            savings += monthlyDeposit;
            months++;
            System.out.println("Måned " + months + ": " + savings + " kr");
        }

        System.out.println("\nMål nået efter " + months + " måneder");

        // Opgave 20: Savings calculator
        System.out.println("\n Opgave 20: Savings calculator");
        double monthlySavings = 1250.0;
        double totalSavings = 0.0;

        System.out.println("Måned | Samlet opsparing");
        System.out.println("------|-------------------");

        for (int month = 1; month <= 12; month++) {
            totalSavings += monthlySavings;
            System.out.println(String.format("%3d   | %10.2f kr", month, totalSavings));
        }

        System.out.println("\nSamlet efter 1 år: " + totalSavings + " kr");

        // Opgave 24: Grade statistics
        System.out.println("\n Opgave 24: Grade statistics");
        int[] scores = {88, 76, 92, 81, 65, 94, 79, 85};

        System.out.print("Karakterer: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i]);
            if (i < scores.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        double average = (double) sum / scores.length;

        int min = scores[0];
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) min = scores[i];
            if (scores[i] > max) max = scores[i];
        }

        int countAbove80 = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > 80) {
                countAbove80++;
            }
        }

        System.out.println("\n KARAKTERSTATISTIK");
        System.out.println("Gennemsnit: " + String.format("%.2f", average));
        System.out.println("Højeste: " + max);
        System.out.println("Laveste: " + min);
        System.out.println("Antal over 80: " + countAbove80);
        System.out.println("Antal karakterer: " + scores.length);

        // Opgave 27: Shopping cart total
        System.out.println("\n Opgave 27: Shopping cart total ");
        double[] prices = {349.95, 199.50, 129.99, 79.25, 45.75};

        System.out.print("Varer i indkøbskurv: ");
        for (int i = 0; i < prices.length; i++) {
            System.out.print(prices[i] + " kr");
            if (i < prices.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        double cartTotal = 0.0;
        for (double price : prices) {
            cartTotal += price;
        }

        System.out.println("Samlet pris: " + cartTotal + " kr");

        if (cartTotal > 1000) {
            System.out.println("Gratis fragt! (over 1000 kr)");
        }
    }
}
