package preview.record;

public class RecordMain {

    public static void featureDemo() {
        Student s = new Student(1, "Ankit", "Yadav");
        System.out.println(s.firstName() + " " + s.lastName());
    }
}
