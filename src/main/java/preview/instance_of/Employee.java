package preview.instance_of;

public interface Employee {

    default boolean isOnProbation() {
        return false;
    }
}
