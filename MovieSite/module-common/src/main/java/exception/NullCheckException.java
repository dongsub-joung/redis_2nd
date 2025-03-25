package exception;

import lombok.Getter;

@Getter
public class NullCheckException extends RuntimeException {
    public NullCheckException(String message) {
        super(message);
    }
}