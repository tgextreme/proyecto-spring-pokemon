package com.example.demo;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;


import java.nio.charset.StandardCharsets;

@Controller
public class PokemonController {

    @GetMapping("/pokemons")
    public String listPokemons(Model model) {
    	RestTemplate restTemplate = new RestTemplate();
        String url = "https://pokeapi.co/api/v2/pokemon?limit=100&offset=0"; // Límite más razonable para el ejemplo

        Response response = restTemplate.getForObject(url, Response.class);

        if (response != null) {
            model.addAttribute("pokemons", Arrays.asList(response.getResults()));
        }

        return "pokemons"; // Nombre de la plantilla HTML
    	
    	
    	/*RestTemplate restTemplate = new RestTemplate();
        String url = "https://pokeapi.co/api/v2/pokemon?limit=100000&offset=0";

        // Asume una clase de respuesta que contiene un array de Pokemon
        Response response = restTemplate.getForObject(url, Response.class);

        model.addAttribute("pokemons", response.getResults());
        return "pokemons"; // Nombre de la plantilla HTML
        */
    }
    @GetMapping("/index2")
    public String index2(@RequestParam("url") String url, Model model) throws RestClientException, UnsupportedEncodingException {
        RestTemplate restTemplate = new RestTemplate();
        System.out.println(URLDecoder.decode(url, StandardCharsets.UTF_8.name()));
        PokemonDetails pokemonDetails = restTemplate.getForObject(URLDecoder.decode(url, StandardCharsets.UTF_8.name()), PokemonDetails.class);

        model.addAttribute("pokemon", pokemonDetails);
        return "pokemonInfo";
    }

    // Clase interna para manejar la respuesta
    public static class Response {
        private Pokemon[] results;

        public Pokemon[] getResults() {
            return results;
        }

        public void setResults(Pokemon[] results) {
            this.results = results;
        }
    }
}
