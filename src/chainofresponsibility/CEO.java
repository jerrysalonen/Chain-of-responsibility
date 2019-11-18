package chainofresponsibility;

/**
 * @author Jerry Salonen
 */
public class CEO extends RaiseHandler {
    private final float IS_ALLOWED = 200.0f; // joku raja sentää

    public void processRaise(RaiseRequest r) {
        if (r.getRaisePct() <= IS_ALLOWED) {
            float newSalary = r.getCurrSalary() * (1 + (r.getRaisePct() / 100));
            System.out.println("Raise granted by the CEO. New salary: " + newSalary);
        } else {
            System.out.println("No superiors could grant the raise.");
        }
    }
}
