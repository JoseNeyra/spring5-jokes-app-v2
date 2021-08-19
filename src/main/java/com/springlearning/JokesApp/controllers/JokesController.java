package com.springlearning.JokesApp.controllers;

import com.springlearning.JokesApp.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jose- on 8/19/2021
 **/

@Controller
public class JokesController {

    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping("/")
    public String getJokes(Model model){
        String chuckNorrisQuote = jokesService.getJoke();
        model.addAttribute("joke", chuckNorrisQuote);
        return "index";
    }
}
