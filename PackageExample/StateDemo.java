package PackageExample;

public class StateDemo {
    public static void main(String[] args) {

        Package pkg = new Package();
        //package ordered ; default state
        pkg.printStatus();

        pkg.nextState();
        //orderedState->deliveredState ; package delivered
        pkg.printStatus();

        pkg.nextState();
        //deliveredState->ReceivedState ; package received
        pkg.printStatus();

        pkg.nextState();
        //receivedState->nothing ; print out "package received"
        pkg.printStatus();
    }
}
