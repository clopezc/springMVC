package com.springapp.mvc.com.springapp.mvc.vo;

import com.sun.istack.internal.NotNull;


/**
 * Created by Alejandro on 28-08-2017.
 */
public class Film {


        private String title;

        @NotNull
        private Integer year;

        private String director;

        private Film() {

        }

        public Film(String title, Integer year, String director) {
            this.title = title;
            this.year = year;
            this.director = director;
        }

        public String getTitle() {
            return title;
        }

        public Integer getYear() {
            return year;
        }

        public String getDirector() {
            return director;
        }
    }


