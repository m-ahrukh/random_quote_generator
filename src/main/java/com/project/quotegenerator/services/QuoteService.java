package com.project.quotegenerator.services;

import com.project.quotegenerator.QuoteGeneratorApplication;
import com.project.quotegenerator.dtos.QuoteDTO;
import com.project.quotegenerator.entites.Quote;
import com.project.quotegenerator.reositories.QuoteRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
@Slf4j
@AllArgsConstructor
public class QuoteService {

    private final QuoteRepository repository;
    private final ModelMapper mapper;
    public String findQuote() {
        Random random = new Random();
        long id = random.nextInt(repository.findAll().size());
        Optional<Quote> optionalQuote = repository.findById(id);
        Quote quote = optionalQuote.get();
        return mapper.map(quote, QuoteDTO.class).getQuote();
    }
}
