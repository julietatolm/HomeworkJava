package org.hw08_24;

public class Game {

    public static void main(String[] args) {
        Player player1 = new Player("One", "red");
        Player player2 = new Player("Two", "blue");
        Player opponent;
        Player player;

        Game game = new Game();

        int firstMove = game.generateFirstMove();
        if (firstMove == 1) {
            player = player1;
            opponent = player2;
        } else {
            player = player2;
            opponent = player1;
        }

        while(opponent.health != 0) {
            game.beat(player, opponent);
            Player change = player;
            player = opponent;
            opponent = change;
        }

        System.out.println("Game Winner's name: " + player.name);
        System.out.println("Hit quantity = " + (player1.hitQuantity+ player2.hitQuantity));
        System.out.println("Player 1 acquired hits number: " + player1.acquiredHitCounter);
        System.out.println("Player 2 acquired hits number: " + player2.acquiredHitCounter);
        System.out.println("Player 1 acquired Super power: " + player1.acquiredSuperPowerCounter);
        System.out.println("Player 2 acquired Super power: " + player2.acquiredSuperPowerCounter);

    }

    public int generateFirstMove() {
        double a = Math.random();
        if (a < 0.5) {
            return 1;
        }
        return 2;
    }

    public void beat(Player opponent, Player player) {
        player.hitQuantity++;
        double a = Math.random();
        if (a < 0.5 && opponent.superPower == 0) {
            opponent.health -= 10;
            player.acquiredHitCounter++;
            addHit(player);
            Stage.printStageColor(player);
        }
        else if (a < 0.5 && opponent.superPower > 0) {
            player.acquiredHitCounter++;
            opponent.superPower -= 1;
            Stage.printStageColor(player);
            addHit(player);
        } else if (a >= 0.5) {
            player.acquiredHitCounterInRow = 0;
        }
    }

    public void addHit (Player player) {
        player.acquiredHitCounterInRow++;
        if (player.acquiredHitCounterInRow == 2) {
            player.superPower++;
            player.acquiredSuperPowerCounter++;
        } else if (player.acquiredHitCounterInRow == 4) {
            player.superPower += 2;
            player.acquiredHitCounterInRow = 0;
            player.acquiredSuperPowerCounter += 2;
        }
    }
}
