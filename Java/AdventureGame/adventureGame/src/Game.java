import java.util.Scanner;

public class Game {

   protected Scanner scanner=new Scanner(System.in);

    public void start()
    {
        System.out.println("---------   Welcome to Adventure Game   ---------");
        System.out.print("Enter your name:");
        String playerName=scanner.nextLine();
        Player player=new Player(playerName);
        player.selectChar();
        player.printInfo();
        Location loc=null;
        boolean showMenu=true;
        while(true){
            System.out.println("---------Locations---------");
            System.out.println("1-Safe House");
            System.out.println("2-Tool Store");
            System.out.println("3-Forest");
            System.out.println("4-River");
            System.out.println("5-Cave");
            System.out.println("6-Mine");
            System.out.println("----------------------------");
            System.out.print("Select a location:");
            int selectloc=scanner.nextInt();
            switch (selectloc){
                case 1:
                {
                    loc=new SafeHouse(player);

                    break;
                }
                case 2:
                {
                    loc=new ToolStore(player);

                    break;
                }
                case 3:
                {
                    loc=new Forest(player);
                break;
                }
                case 4:
                {
                    loc=new River(player);
                    break;
                }
                case 5:
                {
                    loc=new Cave(player);
                    break;
                }
                case 6:
                {
                    loc=new Mine(player);
                    break;
                }

                default:
                    loc=new SafeHouse(player);
                    break;
            }


            if(loc.onLocation()==false)
            {
                System.out.println();
                break;
            }
        }

    }
}
