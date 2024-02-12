package weblogin;

public class EncryptionUtil extends AuthenticationInfo{

    public EncryptionUtil ( String url , String userName , String password ) {
        super ( url , userName , password );
    }

    public String encrypt() {
        String pass = super.getPassword ();
        String temp = pass.substring (2 ) + pass.substring ( 0,2);
         return  temp;
    }

    public String decrypt() {
        String pass = super.getPassword ();
        String temp =pass.substring ( pass.length ()-2) + pass.substring (0,pass.length ()-2) ;
        return  temp;
    }
}
