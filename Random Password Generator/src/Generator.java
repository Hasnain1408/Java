import java.util.Scanner;

public class Generator {


    Alphabet alphabet;

     Scanner scanner=new Scanner ( System.in );

    public Generator() {


    }

     public Generator(boolean IncludeUpper, boolean IncludeLower, boolean IncludeNum, boolean IncludeSym) {
        alphabet = new Alphabet(IncludeUpper, IncludeLower, IncludeNum, IncludeSym);
     }




    public void mainLoop() {
        System.out.println("\n\n    ---------!!!Random Password Generator!!!---------   ");
        printMenu();

        String userOption = "-1";

        while (!userOption.equals("4")) {

            userOption = scanner.next();

            switch (userOption) {
                case "1" -> {
                    requestPassword();
                    printMenu();
                }
                case "2" -> {
                    checkPassword();
                    printMenu();
                }
                case "3" -> {
                    printUsefulInfo();
                    printMenu();
                }
                case "4" -> printQuitMessage();
                default -> {
                    System.out.println();
                    System.out.println("Kindly select one of the available commands");
                    printMenu();
                }
            }
        }
    }


    private void requestPassword() {
        boolean IncludeUpper = false;
        boolean IncludeLower = false;
        boolean IncludeNum = false;
        boolean IncludeSym = false;

        boolean correctParams;

        System.out.println();
        System.out.println("Hello, welcome to the Password Generator : " );
        System.out.println("Answer the following questions by 'Yes' or 'No' ");

            do {
                String input = null;
                correctParams = false;

                do {
                    try {
                        System.out.println ( "Do you want Lowercase letters \"abcd...\" to be used? " );
                        input = scanner.next ( );
                        if (PasswordRequestError ( input )) {
                            throw new MyException ( "You have entered something incorrect ! let's go over it again. \n" );
                        }
                    }
                    catch(MyException e){
                        System.out.println(e.getMessage());
                    }
                } while (!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no"));

                if (isInclude(input)) IncludeLower = true;

                do {
                    try {
                        System.out.println ( "Do you want Lowercase letters \"abcd...\" to be used? " );
                        input = scanner.next ( );
                        if (PasswordRequestError ( input )) {
                            throw new MyException ( "You have entered something incorrect ! let's go over it again. \n" );
                        }
                    }
                    catch(MyException e){
                        System.out.println(e.getMessage());
                    }
                } while (!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no"));

                if (isInclude(input)) IncludeUpper = true;

                do {
                    try {
                        System.out.println ( "Do you want Lowercase letters \"abcd...\" to be used? " );
                        input = scanner.next ( );
                        if (PasswordRequestError ( input )) {
                            throw new MyException ( "You have entered something incorrect ! let's go over it again. \n" );
                        }
                    }
                    catch(MyException e){
                        System.out.println(e.getMessage());
                    }
                } while (!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no"));

                if (isInclude(input)) IncludeNum = true;

                do {
                    try {
                        System.out.println ( "Do you want Lowercase letters \"abcd...\" to be used? " );
                        input = scanner.next ( );
                        if (PasswordRequestError ( input )) {
                            throw new MyException ( "You have entered something incorrect ! let's go over it again. \n" );
                        }
                    }
                    catch(MyException e){
                        System.out.println(e.getMessage());
                    }
                } while (!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no"));

                if (isInclude(input)) IncludeSym = true;

                //No Pool Selected
                if (!IncludeUpper && !IncludeLower && !IncludeNum && !IncludeSym) {
                    System.out.println("You have selected no characters to generate your " +
                            "password, at least one of your answers should be Yes\n");
                    correctParams = true;
                }

            } while (correctParams);



        System.out.println("Great! Now enter the length of the password");
        int length = scanner.nextInt();

        final Generator generator = new Generator(IncludeUpper, IncludeLower, IncludeNum, IncludeSym);
        final Password password = generator.GeneratePassword(length);

        System.err.println("Your generated password -> " + password);
    }

    private boolean PasswordRequestError(String i) {
        return (!i.equalsIgnoreCase("yes") && !i.equalsIgnoreCase("no") );
    }

    private boolean isInclude(String Input) {
        return Input.equalsIgnoreCase ( "yes" );
    }

    private Password GeneratePassword(int length) {
         StringBuilder pass = new StringBuilder( );

        int alphabetLength = alphabet.getAlphabet().length();
        String alpha=alphabet.getAlphabet();

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * alphabetLength);
            pass.append(alpha.charAt(index));
        }

        return new Password(pass.toString());
    }

    private void checkPassword() { 
        String input;

        System.out.print("\nEnter your password:");
        input = scanner.next();

        final Password p = new Password(input);

        System.out.println(p.calculateScore());
    }


    private void printUsefulInfo() {
        System.out.println();
        System.out.println("1.Use a minimum password length of 8 or more characters if permitted.");
        System.out.println("2.Include lowercase and uppercase alphabetic characters, numbers and symbols if permitted.");
        System.out.println("3.Avoid using the same password twice (e.g., across multiple user accounts and/or software systems).");
        System.out.println("4.Avoid character repetition, scanner patterns, dictionary words, letter or number sequences." );
        System.out.println("5.Avoid using information that the user's colleagues and/or " +
                "acquaintances might know to be associated with the user.");
        System.out.println("6.Do not use passwords which consist wholly of any simple combination of the aforementioned weak components.");
    }



    private void printMenu() {
        System.out.println();
        System.out.println("Enter 1 - Password Generator");
        System.out.println("Enter 2 - Password Strength Check");
        System.out.println("Enter 3 - Useful Information");
        System.out.println("Enter 4 - Quit");
        System.out.print("Choice:");
    }


    private void printQuitMessage() {
        System.out.println("Closing the program..............\n");
        System.out.println ( );
        System.out.println ( "           Good Bye!" );
    }

}
