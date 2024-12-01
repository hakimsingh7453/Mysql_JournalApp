package com.mysql.journalapp.Model;
import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class JournalEntry {

    @Id
    private Long id;
    @Column
    private String title;
    @Column
    private String content;
    @Column
    private LocalDate registerTiming=LocalDate.now();
}
