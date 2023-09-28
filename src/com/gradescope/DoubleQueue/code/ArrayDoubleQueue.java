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
    private int back;
	private int front;

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
        this.back = maxSize-1;
		this.front = 0;
        this.queueMaxSize = maxSize;
    }

    /**enqueueContact
     * Enqueue adds an item to the queue.
     *
     * @param val the Double to be added
     *
     * @pre |self| < queueMaxSize
     *
     * @post [self = #self with val added to left-most unoccupied back] AND queueMaxSize = #queueMaxSize
     *
     */
    @Override
    public void enqueue(Double val)
    {
        if (this.front - this.back + this.queueMaxSize == 2) {
			// Queue is full
			return;
        }
		this.back = (this.back + 1) % this.queueMaxSize;
		this.queue[this.back] = val;
    }

    //Note: The below 3 functions intentionally do not have contracts. You do not need to add them.

    @Override
    public Double dequeue()
    {
        if (this.front - this.back == 1) {
			// Queue is empty
			return null;
        }
		Double val = this.queue[this.front];

		this.front = (this.front + 1) % this.queueMaxSize;

		return val;
    }

    @Override
    public int length()
    {
        return Math.abs(this.front - this.back);
    }

    public String toString()
    {
        String str = "";

        for (int i = this.front; i != this.back; i = (i + 1) % this.queueMaxSize) {
            str += "[" + this.queue[i] + "]";
            if (i != this.back-1) {
                str += " ";
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
