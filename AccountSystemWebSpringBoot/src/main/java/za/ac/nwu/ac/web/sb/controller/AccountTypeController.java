package za.ac.nwu.ac.web.sb.controller;

/*
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import za.ac.nwu.ac.domain.service.GeneralResponse;

@RestController
public class AccountTypeController{
    @GetMapping("/Ping")
    public GeneralResponse<String>ping(@RequestParam(value="echo", defaultValue="pong") String echo)
    {

        return new GeneralResponse<String>(successful:true, echo);
    }
     @GetMapping("/ping")
@ApiOperation(value = "Echo the Ping.", notes = "This echo the ping back to the client")
@ApiResponses(value = { @ApiResponse(code = 200, message = "The Ping was received and echoed", response = GeneralResponse.class),
@ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
@ApiResponse(code = 404, message = "Not found", response = GeneralResponse.class),
@ApiResponse(code = 500, message = "Internal Server Error", response= GeneralResponse.class)})
public ResponseEntity<String> ping(@RequestParam(value = "value that will be echoed", defaultValue = "pong")String echo)
 {
 return new ResponseEntity<>(echo, HttpStatus.OK);
}
 };*/
