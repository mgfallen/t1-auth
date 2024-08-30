package t1.holding.auth_example.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Data
public class LoginRequest {

    @NotBlank
    private String username;

    @NotBlank
    private String password;
}
