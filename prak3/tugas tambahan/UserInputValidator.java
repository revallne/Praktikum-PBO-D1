public class UserInputValidator {
    public static void validateUsername(String username) {
        //assert username.matches("^[a-zA-Z][a-zA-Z0-9_]{4,19}$") :
        //"Invalid username. Username must start with a letter, and can only contain letters, numbers, and underscores (_). It must be between 5 and 20 characters long.";

        assert username.matches("^[a-zA-Z][a-zA-Z0-9_]+") : "Invalid username";
        // assert username.matches("{4,19}$") : "karakter kurang/lebih";
        // assert !username.matches("^[a-zA-Z][a-zA-Z0-9_]{4,19}$") : "Invalid username";
        assert username.length() > 5 : "Username must be at least 5 characters long";
        assert username.length() < 20 : "Username must be at most 20 characters long";


        //assert !username.matches("[a-zA-Z][a-zA-Z0-9_]") : "Invalid username";
        //assert Character.isLetter(username.charAt(1)) : "Invalid username";
        //assert username.length() <= 5 : "Username must be at least 5 characters long";
        //assert username.length() < 20 : "Username must be at most 20 characters long";

        // assert username.matches("[a-zA-Z][a-zA-Z0-9_]") : 
        //     if (username.length()<5){
        //         System.out.println("Username must be at least 5 characters long");
        //     }
        //     else if(username.length()>20){
        //         System.out.println("Username must be at most 20 characters long");
        //     }
        //     else {
        //         System.out.println("Invalid username");
        //     }
    }
    
    public static void validateEmail(String email) {
        assert email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$") :
            "Invalid email address";
        //assert email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}") : "Invalid email address";
    }
    
    public static void validateAge(int age) {
        assert age >= 17 && age <= 99: "Age must be between 17 and 99";
    }
    
}
