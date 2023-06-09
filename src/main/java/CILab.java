public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        if (myString == null || myString.isEmpty()) {
            return true;
        }

        int numOfCapitalLetters = 0;

        for (char c : myString.toCharArray()) {
            if (Character.isUpperCase(c)) {
                numOfCapitalLetters++;
            }
        }

        // All letters are uppercase
        if (numOfCapitalLetters == myString.length()) {
            return true;
        }

        // All letters are lowercase
        if (numOfCapitalLetters == 0) {
            return true;
        }

        // Only the first letter is uppercase
        return numOfCapitalLetters == 1 && Character.isUpperCase(myString.charAt(0));
    }

}

