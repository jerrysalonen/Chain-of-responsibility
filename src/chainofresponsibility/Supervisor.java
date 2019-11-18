package chainofresponsibility;

/**
 * @author Jerry Salonen
 */
class Supervisor extends RaiseHandler {
    private final float IS_ALLOWED = 2.0f;

    public void processRaise(RaiseRequest r) {
        if (r.getRaisePct() <= IS_ALLOWED) {
            float newSalary = r.getCurrSalary() * (1 + (r.getRaisePct() / 100));
            System.out.println("Raise granted by supervisor. New salary: " + (int) newSalary);
        } else if (successor != null) {
            successor.processRaise(r);
        } else {
            System.out.println("No superiors could grant the raise.");
        }
    }
}
