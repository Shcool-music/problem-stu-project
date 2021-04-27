package principle.openclose;

public class Test {

    public static void main(String[] args) {
        ICourse javaCourse = new JavaCourse(96, "design for java", 355d);
        System.out.println(javaCourse.toString());


        ICourse iCourse = new JavaDiscountCourse(96, "design for java", 355d);
        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse) iCourse;
        System.out.println("discount price:" + iCourse.getPrice() + ",origin price:" + javaDiscountCourse.getOriginPrice());
    }
}
