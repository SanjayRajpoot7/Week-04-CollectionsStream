package MultilevelUniversityManagementSystem;
import java.util.List;

public class UniversityCourseManagement {
    public static void evaluateCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            course.evaluate();
        }
    }

    public static void main(String[] args) {
        // Create specific course types
        Course<ExamCourse> examCourse = new Course<>("Math 101", new ExamCourse());
        Course<AssignmentCourse> assignmentCourse = new Course<>("History 202", new AssignmentCourse());
        Course<ResearchCourse> researchCourse = new Course<>("Physics 303", new ResearchCourse());

        // Evaluate each course
        examCourse.evaluateCourse();
        assignmentCourse.evaluateCourse();
        researchCourse.evaluateCourse();

        // Use wildcard to evaluate a list of courses
        List<CourseType> allCourses = List.of(examCourse.getCourseType(), assignmentCourse.getCourseType(), researchCourse.getCourseType());
        evaluateCourses(allCourses);
    }
}
