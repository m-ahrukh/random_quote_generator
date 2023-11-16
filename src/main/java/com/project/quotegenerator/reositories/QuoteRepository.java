package com.project.quotegenerator.reositories;

import com.project.quotegenerator.entites.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuoteRepository extends JpaRepository<Quote, Long> {
}
