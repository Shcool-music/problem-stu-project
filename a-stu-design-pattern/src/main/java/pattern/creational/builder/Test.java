package pattern.creational.builder;

public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        Course course = coach.makeCourse("java","ppt","视频","手记","问答");
        System.out.println(course);
    }
}
