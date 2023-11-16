CREATE TABLE IF NOT EXISTS quote (
	id SERIAL PRIMARY KEY,
	quote_text varchar(300) NOT NULL
);

COPY quote FROM 'D:/Notes_For_Jobs/projects/QuotesGeneratorWebApplication/quotes.txt' (DELIMITER('/'));