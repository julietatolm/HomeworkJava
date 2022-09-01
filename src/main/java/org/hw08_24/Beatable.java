package org.hw08_24;

public interface Beatable {

    static void CheckHits(Player player) {
        if (player.acquiredHitCounterInRow == player.minHitsToGetSuperPower) {
            player.superPower++;
            player.acquiredSuperPowerCounter++;
            player.acquiredHitCounterInRow=0;
        }
    }

}
