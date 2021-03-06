package nl.gettoworktogether.manytomany.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Student {

    @Id
    Long id;

    @ManyToMany
    @JoinTable(
            name = "course_like",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
    Set<Course> likedCourses = new HashSet<>();

    // standard constructors
    // getters, and setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Set<Course> getLikedCourses() { return likedCourses; }
    public void setLikedCourses(Set<Course> likedCourses) { this.likedCourses = likedCourses; }

}