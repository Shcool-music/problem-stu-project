package pattern.creational.builder.v2;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Course course = Course.<String>builder().buildCourseArticle("手记").buildCourseName("java课程").buildCoursePPT("PPT").buildCourseQA("QA").get();
        System.out.println(course);

        //immutableSet的使用
        Set<String> set = ImmutableSet.<String>builder().add("a").add("b").build();
        System.out.println("immutableSet的使用");
    }
}
