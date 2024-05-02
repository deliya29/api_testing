package RestApi.restapi_aplikasi.Auth.dto;

import lombok.Data;

@Data
public class RegisterDTO {
    
    private String name;
    private String email;
    private String no_hp;
    private String alamat;
    private String username;
    private String password;
}
