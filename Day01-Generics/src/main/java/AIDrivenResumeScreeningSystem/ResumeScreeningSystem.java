package AIDrivenResumeScreeningSystem;
import java.util.List;

public class ResumeScreeningSystem {

    // Wildcard method to process a list of resumes for various job roles
    public static void processResumes(List<? extends JobRole> resumes) {
        for (JobRole resume : resumes) {
            resume.printRole();
        }
    }

    public static void main(String[] args) {
        // Create resumes for different job roles
        Resume<SoftwareEngineer> softwareEngineerResume = new Resume<>(new SoftwareEngineer());
        Resume<DataScientist> dataScientistResume = new Resume<>(new DataScientist());
        Resume<ProductManager> productManagerResume = new Resume<>(new ProductManager());

        // Process each resume
        softwareEngineerResume.processResume();
        dataScientistResume.processResume();
        productManagerResume.processResume();

        // Use wildcard method to process a list of resumes
        List<JobRole> resumesList = List.of(
                softwareEngineerResume.getJobRole(),
                dataScientistResume.getJobRole(),
                productManagerResume.getJobRole()
        );
        processResumes(resumesList);
    }
}
