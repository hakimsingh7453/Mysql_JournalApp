package com.mysql.journalapp.Repository;


import com.mysql.journalapp.Model.JournalEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalRepository extends JpaRepository<JournalEntry,Long> {
}
