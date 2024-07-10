package com.workintech.jpa_services.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "instructor_detail", schema = "fsweb")
public class InstructorDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "hobby")
    private String hobby;

    @Column(name = "channel_url")
    private String channelUrl;

    //2yönlü olursa Bi-directional
    //Tek taraflı da olabilir.
    //Instruct0r detail sildiğimde instractor silinmediğinden aşağıdaki
    //mappedBy >> kim tarafından, hangi obje tarafından bağlandığını gösterir
    @OneToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,
            CascadeType.PERSIST,CascadeType.REFRESH}, mappedBy = "instructorDetail")
    private Instructor instructor;
}
