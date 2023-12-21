package Lab14;

public class Testik {
    public static void main(String[] args) {
        WaitList<Integer> waitList = new BoundedWaitList<Integer>(3);
        waitList.add(2);
        waitList.add(6);
        waitList.add(4);
        waitList.add(5);
        System.out.println(waitList);
        UnfairWaitList<Integer> unfairwaitList = new UnfairWaitList<Integer>();
        unfairwaitList.add(2);
        unfairwaitList.add(6);
        unfairwaitList.add(4);
        unfairwaitList.add(5);
        unfairwaitList.moveToBack(4);
        System.out.println(unfairwaitList);
    }
}