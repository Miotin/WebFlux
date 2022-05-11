package com.example.demo.handler;

import com.example.demo.dao.EntriesRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class EntriesHandler {
    private final EntriesRepository entriesRepository;
    @Autowired
    public EntriesHandler(EntriesRepository entriesRepository) {
        this.entriesRepository = entriesRepository;
    }

}
