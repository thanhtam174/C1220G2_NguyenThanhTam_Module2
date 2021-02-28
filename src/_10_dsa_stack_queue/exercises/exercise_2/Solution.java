package _10_dsa_stack_queue.exercises.exercise_2;

public class Solution {
    private static class Node {
        public int data;
        public Node link;
    }

    private static class Queue {
        Node front;
        Node rear;
    }

    public static void enQueue(Queue queue, int value) {
        Node temp = new Node();
        temp.data = value;
        if (queue.front == null) {
            queue.front = queue.rear = temp;
        } else {
            queue.rear.link = temp;
        }
        queue.rear = temp;
        queue.rear.link = queue.front;
    }

    public static void deQueue(Queue queue) {
        if (queue.front == null) {
            return;
        }
        if (queue.front == queue.rear) {
            queue.front = queue.rear = null;
        } else {
            queue.front = queue.front.link;
            queue.rear.link = queue.front;
        }
    }

    public static void displayQueue(Queue queue) {
        Node temp = queue.front;
        System.out.println(" Elements in Circular Queue are: ");
        while (temp.link != queue.front) {
            System.out.print(temp.data + " ");
            temp = temp.link;
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.front = q.rear = null;
        enQueue(q, 14);
        enQueue(q, 22);
        enQueue(q, 6);
        displayQueue(q);
        deQueue(q);
        displayQueue(q);
        enQueue(q, 9);
        enQueue(q, 20);
        displayQueue(q);

    }
}
