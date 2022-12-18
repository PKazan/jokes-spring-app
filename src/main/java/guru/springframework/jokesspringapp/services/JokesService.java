package guru.springframework.jokesspringapp.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.*;

@Service
public class JokesService {

    private final ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();

    public String getJoke() {
        return quotes.getRandomQuote();
    }
}
