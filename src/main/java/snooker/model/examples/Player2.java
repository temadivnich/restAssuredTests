package snooker.model.examples;

import lombok.*;
import lombok.extern.log4j.Log4j2;

import java.net.URI;
import java.net.URL;

@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
@Log4j2
public class Player2 {

    @Getter
    @Setter
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
