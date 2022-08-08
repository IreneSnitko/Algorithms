public class CalculationReceiptForPurchase {

    private String getReceiptData(double num, int diff, String value_1, String value_2) {
        final String ERROR = "The value is incorrect!";
        String out;

        if (num >= 0 && num <= 99999.99) {
            out = String.valueOf((int) num)
                    .concat(value_1)
                    .concat(String.valueOf(diff))
                    .concat(value_2);
        } else {
            out = ERROR;
        }

        return out;
    }

    private String getPrice(double productPrice) {
        final String DOLLARS = "$ ";
        final String CENTS = "c.";

        int diff = ((int) (productPrice * 100) - (int) productPrice * 100);

        return getReceiptData(productPrice, diff, DOLLARS, CENTS);
    }

    private String getWeight(double productWeight) {
        final String KG = "kg ";
        final String G = "g";

        int diff = (int) (productWeight * 1000 - ((int)productWeight) * 1000);

        return getReceiptData(productWeight, diff, KG, G);
    }

    public String getReceipt(String goodName, double productPrice, double productWeight) {
        String LN = "\n";
        final String pNameIsEmpty = "The product name is empty or values are incorrect!";

        StringBuilder receipt = new StringBuilder();

        if (
            goodName != null
            && goodName.length() != 0
            && productPrice > 0 && productWeight > 0
            ) {
            receipt
                    .append("Product name: ").append(goodName).append(LN)
                    .append("Price per 1 kg of goods: ").append(getPrice(productPrice)).append(LN)
                    .append("Quantity: ").append(getWeight(productWeight)).append(LN)
                    .append("Total: ").append(getPrice(productPrice * productWeight));
        }
        else {
            receipt
                    .append(pNameIsEmpty);
        }

        return receipt.toString();
    }
}
