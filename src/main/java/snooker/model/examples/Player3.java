package snooker.model.examples;

import lombok.Builder;

import java.net.URI;
import java.net.URL;

@Builder
public class Player3 {

    private final Integer ID;
    private final String FirstName;
    private final String MiddleName;
    private final String LastName;
    private final String Nationality;
    private final String Sex;
    private final java.net.URL BioPage;
    private final String Born;
    private final URI URL;
    private final URL Photo;
    private final String FirstSeasonAsPro;

}
