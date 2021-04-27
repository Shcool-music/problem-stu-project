package principle.dependenceinversion;

public class Test {

//    public static void main(String[] args) {
//        Problem problem = new Problem();
//        problem.studyFECourse();
//        problem.studyJavaCourse();
//    }

//    public static void main(String[] args) {
//        Problem problem = new Problem();
//        problem.studyYaoCourse(new JavaCourse());
//        problem.studyYaoCourse(new FECourse());
//        problem.studyYaoCourse(new PythonCourse());
//    }


//    public static void main(String[] args) {
//        Problem problem = new Problem(new JavaCourse());
//        problem.studyYaoCourseByConstruction();
//    }

    public static void main(String[] args) {
        Problem problem = new Problem();
        problem.setiCourse(new JavaCourse());
        problem.studyYaoCourseByConstruction();
        problem.setiCourse(new PythonCourse());
        problem.studyYaoCourseByConstruction();
    }

}
