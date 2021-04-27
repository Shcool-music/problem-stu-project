package principle.singlereponsibility;

public interface ICourse {
    //获取课程信息
    String getCourseName();

    byte[] getCourseVideo();


    //管理课程
    void studyCourse();//学习课程

    void refundCourse();
    //课程,那么就获取不到课程信息了
}
