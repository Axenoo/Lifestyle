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
                    System.out.println("To add points choose left side(1) or right side(2)");
                    point= getPoint.nextInt();
                    if(point==1){
                        player1.score+=1;
                    }else if(point==2){
                        player2.score+=1;
                    }else if(point==3){
                        break;
                    }
                    if(player1.score==25||player2.score==25){
                        break;
                    }
                }
                checkWinner(player1.score, player1.name, player2.score, player2.name);
            }
            if(chosenGame==2){
                player1.score=0;
                player2.score=0;
                while(true){
                    updateScoreboard(player1.score, player1.name, player2.score, player2.name);
                    System.out.println("To add points choose left side(1) or right side(2)");
                    point= getPoint.nextInt();
                    if(point==1){
                        player1.score+=1;
                    }else if(point==2){
                        player2.score+=1;
                    }else if(point==3){
                        break;
                    }
                    if(player1.score==11||player2.score==11){
                        break;
                    }
                }
                checkWinner(player1.score, player1.name, player2.score, player2.name);
            }
            if(chosenGame==3){
                player1.score=0;
                player2.score=0;
                while(true){
                    updateScoreboard(player1.score, player1.name, player2.score, player2.name);
                    System.out.println("To add points choose left side(1) or right side(2)");
                    point= getPoint.nextInt();
                    if(point==1){
                        player1.score+=2;
                    }else if(point==2){
                        player2.score+=2;
                    }else if(point==3){
                        break;
                    }
                }
                checkWinner(player1.score, player1.name, player2.score, player2.name);
            }
        }
    }
    //Function below displays all the games available
    public static void displayGames(){
        System.out.println("Choose action (number):");
        System.out.println("1: Volleyball");
        System.out.println("2: Table tennis");
        System.out.println("3: Basketball");
        System.out.println("4: Quit");
    }
    //This method informs user about his choice and the score target of the game
    public static void choice(int choice){
        switch(choice){
            case 1:
                System.out.println("You are playing volleyball. The score target is 25. If you want to leave the game press 3.");
                break;
            case 2:
                System.out.println("You are playing table tennis. The score target is 11. If you want to leave the game press 3.");
                break;
            case 3:
                System.out.println("You are playing basketball. The score target is unlimited. If you want to leave the game press 3.");
                break;
            case 4:
                System.exit(0);
                break;
            default :
                System.out.println("Choose correct action!");
                break;
        }
    }
    //This method displays current state of the game
    public static void updateScoreboard(int newScore1, String playerName1, int newScore2, String playerName2){
        System.out.println("------------------------------------");
        System.out.println("|"+playerName1+": "+newScore1+" | "+newScore2+" :"+playerName2+"|");
        System.out.println("------------------------------------");
    }
    //This method checks if there is a winner of the game
    public static void checkWinner(int newScore1, String name1, int newScore2, String name2){
        if(newScore1>newScore2){
            System.out.println("Congratulations!!!"+name1+" wins!");
        }else if(newScore1<newScore2){
            System.out.println("Congratulations!!!"+name2+" wins!");
        }else if(newScore1==newScore2){
            System.out.println("It's a draw");
        }
    }
}