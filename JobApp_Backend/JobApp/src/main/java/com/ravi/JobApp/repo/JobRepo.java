package com.ravi.JobApp.repo;

import com.ravi.JobApp.model.JobPost;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer>{
	
	List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);
}






//Code used without JPA
//@Repository
//public class JobRepo {
//
//
//    // ArrayList to store JobPost objects
//    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
//
//            new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2, List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),
//            new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3, List.of("HTML", "CSS", "JavaScript", "React")),
//            new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4, List.of("Python", "Machine Learning", "Data Analysis")),
//            new JobPost(4, "Network Engineer", "Design and implement computer networks for efficient data communication", 5, List.of("Networking", "Cisco", "Routing", "Switching")),
//            new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android", 3, List.of("iOS Development", "Android Development", "Mobile App"))
//    ));
//
//    // method to return all JobPosts
//    public List<JobPost> getAllJobs() {
//        return jobs;
//    }
//
//    // method to save a job post object into arrayList
//    public void addJob(JobPost job) {
//        jobs.add(job);
//        System.out.println(jobs);
//
//    }
//    
//    //Method to fetch a job by postId
//    public JobPost getJob(int postId) {
//    	for(JobPost job : jobs) {
//    		if(job.getPostId() == postId) {
//    			return job;
//    		}
//    			
//    	}
//    	return null;
//    }
//
//	public void updateJob(JobPost jobPost) {
//		for(JobPost job : jobs) {
//			if (job.getPostId() == jobPost.getPostId()){
//				job.setPostProfile(jobPost.getPostProfile());
//				job.setPostDesc(jobPost.getPostDesc());
//				job.setReqExperience(jobPost.getReqExperience());
//				job.setPostTechStack(jobPost.getPostTechStack());
//			}
//		}
//		
//	}
//
//	public void deleteJob(int postId) {
//		for(JobPost job : jobs) {
//			if(job.getPostId() == postId) {
//				jobs.remove(job);
//			}
//			
//		}
//		
//	}
//}