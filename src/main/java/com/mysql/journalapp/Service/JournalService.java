package com.mysql.journalapp.Service;

import com.mysql.journalapp.Model.JournalEntry;
import com.mysql.journalapp.Repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JournalService {

    @Autowired
    private JournalRepository journalRepository;

    public boolean save(JournalEntry journalEntry){
        try{
            if(journalEntry!=null){
                journalRepository.save(journalEntry);
                return true;
            }
            return false;
        }
        catch (Exception e){
            return false;
        }
    }

}
