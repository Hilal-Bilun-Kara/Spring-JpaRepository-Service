package com.workintech.jpa_services.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "student", schema = "fsweb")

public class Student {
        //Hata mesajı fırlatmadığı için exception globalHandler yapıyoruz

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @Column(name = "first_name")
        @NotNull
        @NotBlank
        @Size(min = 3, max = 45)
        //Veritabanına bağlı kal
        private String firstName;

        @Column(name = "last_name")
        @NotNull
        @NotBlank
        @Size(min = 2, max = 45)
        private String lastName;

        @Column(name = "salary")
        @Min(200)
        private Integer salary;

        @Column(name = "email")
        @Size(min = 10, max = 50)
        @Email
        private String email;

        @Enumerated(EnumType.STRING)
        @NotNull
        private Gender gender;
        //ORDINAL index tutat
}
