package com.springapp.mvc;

/**
 * Created by Alejandro on 29-08-2017.
 */


import com.springapp.mvc.vo.Film;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;


@RestController
public class FilmsController {




    @RequestMapping(value = "/films",method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity getFilms() {
         List<Film> DUMMY_FILMS = new ArrayList<Film>();
        DUMMY_FILMS.add(new Film("12 years a slave", 2013, "Steve McQueen"));
        DUMMY_FILMS.add(new Film("Argo", 2012, "Ben Affleck"));
        DUMMY_FILMS.add(new Film("The Artist", 2011, "Michel Hazanavicius"));
        DUMMY_FILMS.add(new Film("The King's speech", 2010, "Tom Hooper"));
        DUMMY_FILMS.add(new Film("The Hurt Locker", 2009, "Kathryn Bigelow"));
        DUMMY_FILMS.add(new Film("Slumdog Millionaire", 2008, "Danny Boyle"));
        DUMMY_FILMS.add(new Film("No Country for Old Men", 2007, "Joel y Ethan Coen"));
        return new ResponseEntity(DUMMY_FILMS, HttpStatus.OK);
    }

/*    public void addFilm(@RequestBody Film film) {
        DUMMY_FILMS.add(film);
    }*/
}
