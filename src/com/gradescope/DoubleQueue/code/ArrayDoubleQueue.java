/*
            Team Members:
            - Nathan Goller-Deitsch
            - Adrian Colaianni
            - Russell Welch
            - Eden Sharp
         */

        package com.gradescope.DoubleQueue.code;

/**ArrayDoubleQueueContract
 * Array implementation for the Double queue.
 *
 * @invariant: queueMaxSize > 0
 *
 * @corresponds: max_queue_size = queueMaxSize
 *
 */
public class ArrayDoubleQueue implements IDoubleQueue
{
    private Double[] queue;
    private int queueMaxSize;
    private int index;

    /**ArrayDoubleQueueConstructorContact
     * Constructor for the arrayListDouble queue.
     *
     * @param maxSize max size of the array
     *
     * @pre maxSize > 0
     *
     * @post queueMaxSize = maxSize AND self = new Double[queueMaxSize].
     *
     */
    public ArrayDoubleQueue(int maxSize)
    {
        this.queue = new Double[maxSize];
        this.index = 0;
        this.queueMaxSize = maxSize;
    }

    /**enqueueContact
     * Enqueue adds an item to the queue.
     *
     * @param val the Double to be added
     *
     * @pre |self| < queueMaxSize
     *
     * @post [self = #self with val added to left-most unoccupied index] AND queueMaxSize = #queueMaxSize
     *
     */
    @Override
    public void enqueue(Double val)
    {
        if (this.index + 1 < this.queueMaxSize) {
            this.queue[this.index++] = val;
        }
    }

    //Note: The below 3 functions intentionally do not have contracts. You do not need to add them.

    @Override
    public Double dequeue()
    {
        if (this.index > 0) {
            return this.queue[--this.index];
        }

        return null;
    }

    @Override
    public int length()
    {
        return this.index;
    }

    public String toString()
    {
        String str = "";

        for (int i = 0; i < index; i++) {
            str += this.queue[i];
            if (i != index-1) {
                str += ", ";
            }
        }

        return str;
    }

    //-----------------Ignore the functions below this line-----------------------
    public int getQueueMaxSize()
    {
        return this.queueMaxSize;
    }

    public Double[] getQueue()
    {
        return this.queue;
    }
}