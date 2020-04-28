package com.pluralsight.bridge;

import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class Movie {
    private String classification;
    private String runtime;
    private String title;
    private String year;
}
