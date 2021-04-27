package principle.dependenceinversion;

public class Problem {

    ICourse iCourse;


    public Problem() {

    }

    public Problem(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyYaoCourse(ICourse iCourse) {
        iCourse.studyCourse();
    }

    public void studyYaoCourseByConstruction() {
        iCourse.studyCourse();
    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }
}
