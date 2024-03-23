package bitlab.sprinttask2javaspring.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table (name = "APPLICATION_REQUEST")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApplicationRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "user_name", length = 200)
    private String userName;

    @Column(name = "course_name", length = 200)
    private String courseName;

    @Column(name = "commentary")
    private String commentary;

    @Column(name = "phone")
    private String phone;

    @Column(name = "handled")
    private Boolean handled;
}
