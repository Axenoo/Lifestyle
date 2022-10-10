import java.util.Scanner;

public class scoreCounter {

    int score;
    String name;
    public static int chosenGame=0;
    public static int point=0;
    public scoreCounter(int newScore, String playerName){
        score=newScore;
        name=playerName;
    }

    public static void main(String[] args) {
        scoreCounter player1 = new scoreCounter(0,"name1");
        scoreCounter player2 = new scoreCounter(0, "name2");
        Scanner choice = new Scanner(System.in);
        Scanner getPoint = new Scanner(System.in);
        Scanner getName = new Scanner(System.in);
        while(chosenGame!=4){
            displayGames();
            chosenGame=choice.nextInt();
            choice(chosenGame);
            System.out.println("Enter name of player 1");
            player1.name = getName.nextLine();
            System.out.println("Enter name of player 2");
            player2.name = getName.nextLine();
            if(chosenGame==1){
                player1.score=0;
                player2.score=0;
                while(true){
                    updateScoreboard(player1.score, player1.name, player2.score, player2.name);
                    point= getPoint.nextInt();
                    if(point==1){
                        player1.score+=1;
                    }else if(point==2){
                        player2.score+=1;
                    }
                    if(player1.score==25||player2.score==25){
                        break;
                    }
                }
                if(player1.score>player2.score){
                    System.out.println("Congratulations!!!"+player1.name+" wins!");
                }else{
                    System.out.println("Congratulations!!!"+player2.name+" wins!");
                }
            }
            if(chosenGame==2){
                player1.score=0;
                player2.score=0;
                while(true){
                    updateScoreboard(player1.score, player1.name, player2.score, player2.name);
                    point= getPoint.nextInt();
                    if(point==1){
                        player1.score+=1;
                    }else if(point==2){
                        player2.score+=1;
                    }
                    if(player1.score==11||player2.score==11){
                        break;
                    }
                }
                if(player1.score>player2.score){
                    System.out.println("Congratulations!!!"+player1.name+" wins!");
                }else{
                    System.out.println("Congratulations!!!"+player2.name+" wins!");
                }
            }
            if(chosenGame==3){
                player1.score=0;
                player2.score=0;
                while(true){
                    updateScoreboard(player1.score, player1.name, player2.score, player2.name);
                    point= getPoint.nextInt();
                    if(point==1){
                        player1.score+=2;
                    }else if(point==2){
                        player2.score+=2;
                    }
                    if(player1.score==50 || player2.score==50){
                        break;
                    }
                }
                if(player1.score>player2.score){
                    System.out.println("Congratulations!!!"+player1.name+" wins!");
                }else{
                    System.out.println("Congratulations!!!"+player2.name+" wins!");
                }
            }
        }
    }

    public static void displayGames(){
        System.out.println("Choose action (number):");
        System.out.println("1: Volleyball");
        System.out.println("2: Table tennis");
        System.out.println("3: Basketball");
        System.out.println("4: Quit");
    }

    public static void choice(int choice){
        switch(choice){
            case 1:
                System.out.println("You are playing volleyball");
                break;
            case 2:
                System.out.println("You are playing table tennis");
                break;
            case 3:
                System.out.println("You are playing basketball");
                break;
            case 4:
                System.exit(0);
                break;
            default :
                System.out.println("Choose correct action!");
                break;
        }
    }

    public static void updateScoreboard(int newScore1, String playerName1, int newScore2, String playerName2){
        System.out.println("------------------------------------");
        System.out.println("|"+playerName1+": "+newScore1+" | "+newScore2+" :"+playerName2+"|");
        System.out.println("------------------------------------");
    }
}