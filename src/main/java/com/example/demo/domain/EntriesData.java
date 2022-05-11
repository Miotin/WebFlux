package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class EntriesData {
    @JsonProperty("Cors")
    private String cors;

    @JsonProperty("Link")
    private String link;
}
