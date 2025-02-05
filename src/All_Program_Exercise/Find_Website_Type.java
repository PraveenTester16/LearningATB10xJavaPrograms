package All_Program_Exercise;

import java.util.Scanner;

public class Find_Website_Type {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the website");
        String userWebsite = scanner.nextLine();

        switch (userWebsite){

            case  ".com" :
                System.out.println("The website type is: Commercial website");
                break;

            case ".org" :
                System.out.println("The website type is: Non-profit organization");
                break;

            case ".edu" :
                System.out.println("The website type is: Educational institution");
                break;

            case  ".gov":
                System.out.println("The website type is: Government website");
                break;

            case ".net" :
                System.out.println("The website type is: Network-related website");
                break;

            case ".info":
                System.out.println("The website type is: Informational website");
                break;

            case  ".xyz":
                System.out.println("unknown domain");
                break;

            default:
                System.out.println("Invalid one");
                break;
        }
    }
}
