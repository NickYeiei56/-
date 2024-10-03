import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What your name? : ");
        String name = scanner.nextLine();
     
        System.out.println(" if you platium text = Platinum" );
        System.out.println(" if you platium text = Gold" );
        System.out.println(" if you platium text = Silver" );
        System.out.println(" if you platium text = Notype" );
        System.out.println("memberis ?");
        String memberis = scanner.nextLine();


        System.out.println("Price is ?");
        int Totol = scanner.nextInt();
        scanner.close();
    
        switch (memberis) {
            case "Platinum":
            MemberCard platinuCard = new Platinum(name, Totol);
            System.out.println("Platinum info");
            platinuCard.display();
                break;

            case "Gold" :
            MemberCard goldCard = new GoldCrad(name, Totol);
            System.out.println("Gold info");
            goldCard.display();
            

            break;

            case "Silver" :
            MemberCard silverCard = new SilverCard(name, Totol);
            System.out.println("Silver info");
            silverCard.display();
            
                break;         
            
            case "Notype":
            MemberCard noCard = new MemberCard(name, Totol);
            System.out.println("not member");
            noCard.display();
        }
    }
}    


