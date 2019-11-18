package chainofresponsibility;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Supervisor su = new Supervisor();
        HeadOfDepartment hod = new HeadOfDepartment();
        CEO ceo = new CEO();

        Scanner sc = new Scanner(System.in);

        su.setSuccessor(hod);
        hod.setSuccessor(ceo);

        System.out.println("Current salary: ");
        float currSalary = Integer.parseInt(sc.nextLine());

        System.out.println("Raise percentage proposal: ");
        float raisePct = Integer.parseInt(sc.nextLine());

        su.processRaise(new RaiseRequest(raisePct, currSalary));
    }
}
