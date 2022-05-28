package urfu.lesson6;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class DefaultControllerAdvice
{
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleException(Exception exception)
    {
        var apiError = new ApiError(exception.getMessage());
        return new ResponseEntity<>(apiError, HttpStatus.BAD_GATEWAY);
    }
}
