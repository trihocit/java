package com.example.BT_Tuan4_8.model;



import jakarta.persistence.*;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;

@Setter
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Ten Giao vien khong duoc de trong")
    @Length(max = 100, message = "Ten giao viên khong duoc vuot qua 100 ky tu")
    private String lectureName;
    @NotBlank(message = "Dia chi khong duoc de trong")
    private String place;
    @FutureOrPresent(message = "Ngay bat dau phai lon hon hoac bang ngay hien tai")
    private LocalDate startDate;


}
