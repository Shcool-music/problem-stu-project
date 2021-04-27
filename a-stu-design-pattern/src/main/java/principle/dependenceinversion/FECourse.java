package principle.dependenceinversion;

public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("learn FE course");
    }
}
