/*
    Team Members:
    - Nathan Goller-Deitsch
    - Adrian Colaianni
    - Russell Welch
    - Eden Sharp
 */

package com.gradescope.DoubleQueue.code;

/**IDoubleQueueContract
 *
 *
 *@initialization Ensures: self != null
 *
 *@defines: self: Object
 *
 *@constraints: The queue is initialized and is empty
 *
 */
public interface IDoubleQueue
{

    //This function's contracts are in the individual classes
    public void enqueue(Double val);

    /**dequeueContract
     *
     *
     *@return The first element in the queue
     *
     *@pre The queue is not empty
     *
     *@post The first element in the queue is removed and returned
     *
     */
    public Double dequeue();

    /**lengthContract
     *
     *
     *@return The amount of elements in the queue
     *
     *@pre None
     *
     *@post None
     *
     */
    public int length();

    /**toStringContract
     *
     * can be used for example to print the status of the queue to the command line.
     *
     *@return representation of the queue as a string
     *
     *@pre None
     *
     *@post Nothing changes about the state of the queue
     *
     */
    public String toString();
}
