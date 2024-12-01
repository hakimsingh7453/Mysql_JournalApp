package com.mysql.journalapp.Controller;

import com.mysql.journalapp.Model.JournalEntry;
import com.mysql.journalapp.Service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class JournalController {

    @Autowired
    private JournalService journalService;

    @PostMapping("/add")
    public boolean save(@RequestBody JournalEntry journalEntry){
        return journalService.save(journalEntry);
    }
}
