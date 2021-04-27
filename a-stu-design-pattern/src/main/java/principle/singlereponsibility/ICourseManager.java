package principle.singlereponsibility;

public interface ICourseManager {

    //管理课程
    void studyCourse();//学习课程

    void refundCourse();//退课程，那么久获取不到课程信息了
}
