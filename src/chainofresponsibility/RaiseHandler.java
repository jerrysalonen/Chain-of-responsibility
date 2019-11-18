package chainofresponsibility;

/**
 * @author Jerry Salonen
 */
abstract class RaiseHandler {
    protected RaiseHandler successor;

    public void setSuccessor(RaiseHandler successor) {
        this.successor = successor;
    }

    abstract public void processRaise(RaiseRequest r);
}
