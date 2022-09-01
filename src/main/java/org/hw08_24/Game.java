package org.hw08_24;

public class Game {

    public static void main(String[] args) {
        PlayerType1 player1 = new PlayerType1("One", "red");
        PlayerType2 player2 = new PlayerType2("Two", "blue");

        Game game = new Game();

        game.playGame(player1, player2, game);

        game.printStatistics(player1, player2);
    }



    private void playGame(Player player1, Player player2, Game game) {
        int PlayerTurn = game.generateFirstMove(player1, player2);
        while(player1.health != 0 && player2.health != 0) {
            if (PlayerTurn == 1) {
                game.beat(player1, player2);
                PlayerTurn = 2;
            }
            else  {
                game.beat(player2, player1);
                PlayerTurn = 1;
            }
        }
    }

    private void printStatistics(Player player1, Player player2) {
        System.out.println();
        if (player1.health == 0) {
            System.out.println("Game Winner's name: " + player2.name);
        } else {
            System.out.println("Game Winner's name: " + player1.name);
        }
        System.out.println();
        System.out.println("Total hits quantity = " + (player1.hitQuantity + player2.hitQuantity));
        System.out.println("Player 1 total successful hits number: " + player1.acquiredHitCounter);
        System.out.println("Player 2 total successful hits number: " + player2.acquiredHitCounter);
        System.out.println("Player 1 acquired Super power: " + player1.acquiredSuperPowerCounter);
        System.out.println("Player 2 acquired Super power: " + player2.acquiredSuperPowerCounter);
    }

    public int generateFirstMove(Player player1, Player player2) {
        double a = Math.random();
        if (a < 0.5) {
            return 1;
        }
        return 2;
    }

    public void beat(Player player, Player opponent) {
        player.hitQuantity++;
        double a = Math.random();
        if (a < 0.5 ) {
            if (opponent.superPower == 0) {
                decreaseHealth(opponent);
                addHitInRow(player);
                Stage.printStageColor(player);
            } else if (opponent.superPower > 0) {
                decreaseSuperPower(opponent);
                addHitInRow(player);
            }
        } else {
            player.acquiredHitCounterInRow = 0;
        }
    }

    public void decreaseHealth(Player opponent) {
        opponent.health -= 10;
    }

    public void decreaseSuperPower(Player opponent) {
        opponent.superPower -= 1;
    }

    public void addHitInRow (Player player) {
        player.acquiredHitCounter++;
        player.acquiredHitCounterInRow++;
        Beatable.CheckHits(player);
    }

}
