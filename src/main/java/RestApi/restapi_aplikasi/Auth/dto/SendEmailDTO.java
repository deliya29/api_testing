package RestApi.restapi_aplikasi.Auth.dto;

// Importing required classes
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
 
// Annotations
@Data
@AllArgsConstructor
@NoArgsConstructor
 
// Class
public class SendEmailDTO {
 
    // Class data members
    private String recipient;
    private String msgBody;
    private String subject;
    private String attachment;
}
