package preview.instance_of;

public class InstanceOfMain {

    public static void featureDemo() {
        oldWay(new Trainee());
        oldWay(new Associate());
        oldWay(new Manager());

        newWay(new Trainee());
        newWay(new Associate());
        newWay(new Manager());
    }

    private static void oldWay(Employee employee) {

        if(employee instanceof Manager) {
            ((Manager)employee).manageTeam();
        } else if (employee instanceof Associate) {
            ((Associate)employee).doAssignedWork();
        } else if (employee instanceof Trainee) {
            ((Trainee)employee).getTrained();
        }
    }

    private static void newWay(Employee employee) {
        /**
         * 1. notice the use of reference in if condition
         */

        if(employee instanceof Manager m && !m.isOnProbation()) {
            /**
             * this below condition will not work
             * if(employee instanceof Manager m || !m.isOnProbation()) {
             * because RHS of OR || will only run when instanceof returns false
             * thus variable m does not get defined
             */

            m.manageTeam();
        } else if (employee instanceof Associate a) {
            /**
             * 3. this will not work
             * m.isOnProbation();
             * because the scope has ended
             */
            a.doAssignedWork();
        } else if (employee instanceof Trainee t) {
            t.getTrained();
        }
    }
}
