public class correctPassword extends Exception {
    public correctPassword(String password) throws WrongPasswordException {
        String correctPassword = "password";

        if(!password.equals(correctPassword)) {
            throw new WrongPasswordException("Incorrect Password");
        }
    }

}
