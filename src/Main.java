import java.lang.reflect.Array;
import java.util.*;

/*Rules
* [1]- top player--> position 1
* [2] if 2 players have equal scores, they recive the same ranking number
*i.e [100,90,90,80] --> ranks: 1,2,2 and 3
* */
public class Main {
    public static void main(String[] args) {

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //VALUES OF THE LEADERBOARD
        Scanner scan = new Scanner(System.in);


        int numberOfPlayers = scan.nextInt(); //n =  NUMBER OF PLAYERS IN THE LEADER BOARD

        //SETTING UP THE VALUES GIVEN IN AN ARRAY

        int ScoresOfPlayers[] = new int[numberOfPlayers]; //ARRAY HOLDING ALL THE VALUES FOR ALL PLAYERS

        for (int i = 0; i < numberOfPlayers; i++) {
            ScoresOfPlayers[i] = scan.nextInt();
        }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //IF TWO ELEMENTS ON THE LEADERBOARD ARE THE SAME THEY HAVE THE SAME RANKING
    //ALGORITHM THAT CALCULATES THE N OF POSITIONS IN THE RANKING

        int FnumberOfRanks = numberOfPlayers; //number of elements  in the leader board

      Arrays.sort(ScoresOfPlayers);

      for (int i = 0; i<ScoresOfPlayers.length;i++){

          try {
              if (ScoresOfPlayers[i] == ScoresOfPlayers[i + 1]) {
                  FnumberOfRanks--;
              }
          }catch (Exception e){
              break;
          }
      }


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // VALUES OF ALICE


        int AliceNumberOfPlays = scan.nextInt();


        int AliceScores[] = new int[AliceNumberOfPlays];


        //positioning each element entered into an array
        for (int i = 0; i < AliceNumberOfPlays; i++) {
            AliceScores[i] = scan.nextInt();
        }


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //OUTPUT



        for (int c = 0 ; c<FnumberOfRanks;c++){

            System.out.println(Operation(FnumberOfRanks,AliceScores,ScoresOfPlayers,c));
        }



    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //data handling/result calculation method


        public static int Operation (int Count, int AliceScores[], int Scores[], int g ){

        int Position = Count;

        for (int i = 0; i< Scores.length; i++){

            if (AliceScores[g] > Scores [i]) {
                Position--;
            } }
            return Position;
        }
}
