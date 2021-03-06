package com.sw.reservation.users;

import com.sw.reservation.core.Core;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class User {

    @Id
    private Long studentId;
    private String type;
    private String password;
    private String name;
    private Integer count;

    @OneToMany(mappedBy = "studentId")
    private List<Core> core = new ArrayList<>();

}