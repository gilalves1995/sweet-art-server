package main.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.PRECONDITION_FAILED)
public class BrokenPrecondition extends RuntimeException {
    public BrokenPrecondition(String message) {
        super(message);
    }

}
