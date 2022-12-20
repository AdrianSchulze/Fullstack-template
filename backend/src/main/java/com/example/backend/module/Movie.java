package com.example.backend.module;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movie {
    String title;
    String url;
    int year;
}
