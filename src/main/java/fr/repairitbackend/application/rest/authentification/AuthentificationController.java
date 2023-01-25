package fr.repairitbackend.application.rest.authentification;


import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("api/authentification")
public class AuthentificationController {


    @GetMapping(
        path="api/authentification/{login}",
            produces = APPLICATION_JSON_VALUE
    )
    @ApiOperation(
            value = "Récuperation du login de l'utilisateur",
            consumes = APPLICATION_JSON_VALUE,
            produces = APPLICATION_JSON_VALUE

    )
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "le login est bien recuperé")
            }

    )
    public ResponseEntity<Void> afficherAuthentification(
            @PathVariable(name= "login") String login
    ) {
        return  ResponseEntity.ok().build();
    }
}
