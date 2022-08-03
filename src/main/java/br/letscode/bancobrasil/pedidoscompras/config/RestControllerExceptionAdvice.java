package br.letscode.bancobrasil.pedidoscompras.config;

import br.letscode.bancobrasil.pedidoscompras.exceptions.ValidacaoException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class RestControllerExceptionAdvice {

    @ExceptionHandler({MethodArgumentNotValidException.class})
    public ResponseEntity<List<ErrorMessage>> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
        List<ErrorMessage> errorList = ex.getBindingResult()
                .getAllErrors()
                .stream()
                .map(error -> {
                    return new ErrorMessage( ((FieldError)error).getField(), error.getDefaultMessage() );
                })
                .collect(Collectors.toList());
        return ResponseEntity.badRequest().body(errorList);
    }

    @ExceptionHandler({ValidacaoException.class, EmptyResultDataAccessException.class})
    public ResponseEntity<ErrorMessage> handleValidationException(RuntimeException ex) {
        return ResponseEntity.badRequest().body(new ErrorMessage("Validation", ex.getMessage()));
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    class ErrorMessage{
        private String field;
        private String message;
    }

}
