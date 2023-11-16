package com.project.quotegenerator.controllers;

import com.project.quotegenerator.entites.Quote;
import com.project.quotegenerator.services.QuoteService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Slf4j
@AllArgsConstructor
@RestController
public class QuoteController {

    private final QuoteService quoteService;

    @GetMapping()
    public String index(){
        return quoteService.findQuote();
    }
}
