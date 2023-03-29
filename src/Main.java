import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String response, final_response;
        Scanner ler = new Scanner(System.in);
        AleatoryNumber start = new AleatoryNumber();
        System.out.println("Do you want to generate random numbers for the lottery?");
        System.out.println("* YES");
        System.out.println("* NO\n");
        response = ler.nextLine();
        System.out.println(" ");
        final_response = response.toLowerCase();
        if(final_response.equals("yes") || final_response.equals("sim")){
            start.Generate();
        } else if (final_response.equals("não") || final_response.equals("no") || final_response.equals("nao")){
            System.out.println("Goodbye!");
            ler.close();
        } else {
            System.out.println("Something wrong in your response!");
            ler.close();
        }
    }
}