package pattern.creational.builder.v2;

import com.google.common.collect.ImmutableSet;

public class Course {

    private String courseName;

    private String coursePPT;

    private String courseVideo;

    private String courseArticle;

    private String courseQA;

    public Course(CourseBuilder builder) {
        this.courseName = builder.courseName;
        this.coursePPT = builder.coursePPT;
        this.courseVideo = builder.courseVideo;
        this.courseArticle = builder.courseArticle;
        this.courseQA = builder.courseQA;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }

    public static <E> CourseBuilder<E> builder() {
        return new CourseBuilder<E>();
    }

    public static class CourseBuilder<E> {

        private String courseName;

        private String coursePPT;

        private String courseVideo;

        private String courseArticle;

        private String courseQA;

        public CourseBuilder buildCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public CourseBuilder buildCoursePPT(String coursePPT) {
            this.coursePPT = coursePPT;
            return this;
        }

        public CourseBuilder buildCourseVideo(String courseVideo) {
            this.courseVideo = courseVideo;
            return this;
        }

        public CourseBuilder buildCourseArticle(String courseArticle) {
            this.courseArticle = courseArticle;
            return this;
        }

        public CourseBuilder buildCourseQA(String courseQA) {
            this.courseQA = courseQA;
            return this;
        }

        public Course get() {
            return new Course(this);
        }
    }

}
