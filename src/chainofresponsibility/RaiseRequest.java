package chainofresponsibility;

/**
 * @author Jerry Salonen
 */
public class RaiseRequest {
    float raisePct;
    float currSalary;

    public RaiseRequest(float raisePct, float currSalary) {
        this.raisePct = raisePct;
        this.currSalary = currSalary;
    }

    public float getRaisePct() {
        return raisePct;
    }

    public void setRaisePct(int raisePct) {
        this.raisePct = raisePct;
    }

    public float getCurrSalary() {
        return currSalary;
    }

    public void setCurrSalary(int currSalary) {
        this.currSalary = currSalary;
    }
}
