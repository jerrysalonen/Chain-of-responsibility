package chainofresponsibility;

/**
 * @author Jerry Salonen
 */
public class HeadOfDepartment extends RaiseHandler {
    private final float IS_ALLOWED = 5.0f;

    public void processRaise(RaiseRequest r) {
        if (r.getRaisePct() <= IS_ALLOWED) {
            float newSalary = r.getCurrSalary() * (1 + (r.getRaisePct() / 100));
            System.out.println("Raise granted by head of department. New salary: " + newSalary);
        } else if (successor != null) {
            successor.processRaise(r);
        } else {
            System.out.println("No superiors could grant the raise.");
        }
    }
}
