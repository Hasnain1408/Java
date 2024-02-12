
public class Password {
    String Value;
    int length;

    public Password(String s) {
        Value = s;
        length = s.length();
    }

    public int CharType(char C) {
        int val;

        // Char is Uppercase Letter
        if ((int) C >= 65 && (int) C <= 90)
            val = 1;

        // Char is Lowercase Letter
        else if ((int) C >= 97 && (int) C <= 122) {
            val = 2;
        }

        // Char is Digit
        else if ((int) C >= 48 && (int) C <= 57) {
            val = 3;
        }

        // Char is Symbol
        else {
            val = 4;
        }

        return val;
    }

    int UpperCount=0;
    int LowerCount=0;
    int DigitCount=0;
    int SymbolCount=0;

    public int PasswordStrength() {
        String s = this.Value;
        boolean UsedUpper = false;
        boolean UsedLower = false;
        boolean UsedNum = false;
        boolean UsedSym = false;
        int type;
        int Score = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            type = CharType(c);

            if (type == 1) {
                UpperCount++;
                UsedUpper = true;
            }
            else if (type == 2){
                LowerCount++;
                UsedLower = true;
            }
            else if (type == 3){
                DigitCount++;
                UsedNum = true;
            }
            else {
                SymbolCount++;
                UsedSym = true;
            }
        }

        if (UsedUpper) Score += 1;
        if (UsedLower) Score += 1;
        if (UsedNum) Score += 1;
        if (UsedSym) Score += 1;

        if (s.length() >= 8) Score += 1;
        if (s.length() >= 16) Score += 1;

        return Score;
    }

    public String calculateScore() {
        int Score = this.PasswordStrength();

        System.out.println();
        System.out.println("Uppercase Letters : "+UpperCount);
        System.out.println("Lowercase Letters : "+LowerCount);
        System.out.println("Digits : "+DigitCount);
        System.out.println("Symbols : "+SymbolCount);
        System.out.println();

        if (Score == 6) {
            return "This is a very good password :) Check the Useful Information section to make sure it satisfies the guidelines.";
        } else if (Score >= 4) {
            return "This is a good password :) but you can still do better.";
        } else if (Score >=3) {
            return "This is a medium password :/ try making it better.";
        } else {
            return "This is a weak password :( definitely find a new one.";
        }
    }

    @Override
    public String toString() {
        return Value;
    }
}
