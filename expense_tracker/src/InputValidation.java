public class InputValidation {
    
    // Method to validate the amount
    public static boolean isValidAmount(double input) {
        try {
            return input > 0 && input < 1000;
        } catch(NumberFormatException e) {
            return false;
        }
    }
    
    // Method to validate the category
    public static boolean isValidCategory(String category) {
        String[] validCategories = {"food", "travel", "bills", "entertainment", "other"};
        for(String validCategory : validCategories) {
            if(validCategory.equalsIgnoreCase(category)) {
                return true;
            }
        }
        return false;
    }
}
