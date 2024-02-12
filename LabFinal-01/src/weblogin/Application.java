package weblogin;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
     private ArrayList<AuthenticationInfo>infos;
     public  Application(){
         infos = new ArrayList<> ();
     }

    Scanner sc = new Scanner ( System.in );


    String url,uname,pass;
    private void Start ()
    {
        System.out.println ("1. New Login Info\t2. View Login Info\t3. Exit" );
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                sc.nextLine ();
                System.out.print ("URL : " );
                url=sc.next ();
                System.out.print ("Name :" );
                uname=sc.next ();
                System.out.print("Pass :" );
                pass=sc.next ();

                AuthenticationInfo logininfo = new AuthenticationInfo(url,uname,pass);
                createLoginRecord(logininfo);

                System.out.println("Login info created and stored.");
                Start();

            case 2:
                sc.nextLine ();
                System.out.print("Enter URL : ");
                String url = sc.nextLine ();
                AuthenticationInfo result = viewLoginRecord (url);
                if(result != null) {
                    System.out.println("URL : " + result.getUrl());
                    System.out.println("Name :" + result.getUserName());
                    System.out.println("Pass :" + result.getPassword());
                }
                else System.out.println("URL not Matched!!");

               Start();

            case 3:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid choice. Please try again.");
               Start();
        }

    }


    private  void createLoginRecord (AuthenticationInfo logininfo ) {
        EncryptionUtil p = new EncryptionUtil(logininfo.getUrl(), logininfo.getUserName(), logininfo.getPassword());

        p.setPassword ( p.encrypt (  ) );
        infos.add ( p );

    }
    private AuthenticationInfo viewLoginRecord (String url){

        for(AuthenticationInfo i : infos)
        {
            if(i.getUrl ().equals(url) ){
                EncryptionUtil p = new EncryptionUtil(i.getUrl(),i.getUserName(), i.getPassword());

                i.setPassword(p.decrypt() );

                return i;
            }
        }
    return  null;
    }

    public static void main(String[] args) {

        Application app = new Application();
        app.Start();

    }

}
