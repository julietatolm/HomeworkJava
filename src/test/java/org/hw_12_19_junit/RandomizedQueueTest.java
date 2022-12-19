package org.hw_12_19_junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomizedQueueTest {
    static RandomizedQueue randomizedQueue;
    static RandomizedQueue randomizedEmptyQueue;

    @BeforeAll
    static void init() {
        randomizedEmptyQueue = new RandomizedQueue();

        randomizedQueue = new RandomizedQueue();
        randomizedQueue.enqueue("new two");
        randomizedQueue.enqueue("new tree");
        randomizedQueue.enqueue("new four");
        randomizedQueue.enqueue("new five");
    }

    @AfterEach
    void refillQueue() {
        randomizedQueue = new RandomizedQueue();
        randomizedQueue.enqueue("new two");
        randomizedQueue.enqueue("new tree");
        randomizedQueue.enqueue("new four");
        randomizedQueue.enqueue("new five");
    }

    @AfterEach
    void setToZeroQueue() {
        randomizedEmptyQueue = new RandomizedQueue();
    }

    // is the randomized queue empty?
//    public boolean isEmpty()
    @Test
    void isEmptyReturnsCorrectStatement() {
        assertTrue(randomizedEmptyQueue.isEmpty());
        assertFalse(randomizedQueue.isEmpty());
    }

    // return the number of items on the randomized queue
//    public int size()
    @Test
    void sizeReturnsCorrectStatement() {
        assertTrue(randomizedEmptyQueue.size() == 0);
        assertTrue(randomizedQueue.size() == 4);
    }

    // add the item
//    public void enqueue(Item item)
    @Test
    void enqueueAddsNewElement() {
        randomizedEmptyQueue.enqueue("ONE");
        assertTrue(randomizedEmptyQueue.size()==1);
        assertEquals("ONE", randomizedEmptyQueue.sample());
    }

    //    // return a random item (but do not remove it)
//    public Item sample()
    @Test
    void sampleReturnsRandomElementAndDoesntRemove() {
        randomizedEmptyQueue.enqueue("ONE");
        Object sample = randomizedEmptyQueue.sample();
        assertEquals(sample, randomizedEmptyQueue.sample());
    }

    //    // remove and return a random item
//    public Item dequeue()
    @Test
    void dequeueRemovesAndReturnsElement() {
        Object a = "ONE";
        randomizedEmptyQueue.enqueue(a);
        assertEquals(a, randomizedEmptyQueue.dequeue());
        assertTrue(randomizedEmptyQueue.size()==0);
    }

    //    // return an independent iterator over items in random order
//    public Iterator<Item> iterator()
    @Test
    void iteratorWorks() {
        assertFalse(randomizedEmptyQueue.iterator().hasNext());
        assertTrue(randomizedQueue.iterator().hasNext());
        assertNotEquals(randomizedQueue.iterator().next(), randomizedQueue.iterator().next());
    }
}