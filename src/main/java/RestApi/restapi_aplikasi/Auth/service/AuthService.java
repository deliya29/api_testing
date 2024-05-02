package RestApi.restapi_aplikasi.Auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import RestApi.restapi_aplikasi.Auth.dto.RegisterDTO;
import RestApi.restapi_aplikasi.Auth.repository.AuthRepository;
import RestApi.restapi_aplikasi.User.model.User;
import jakarta.transaction.Transactional;


@Service
@Transactional
public class AuthService {
    
   @Autowired
    private AuthRepository authRepository;

    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Value("${spring.mail.username}")
    private String sender;

    public String register(RegisterDTO dto) {
        String username = generateUsername(dto.getName());
        String password = generatePassword();
        String hashedPassword = passwordEncoder.encode(password);

        User newUser = new User();
        newUser.setName(dto.getName());
        newUser.setEmail(dto.getEmail());
        newUser.setNo_hp(dto.getNo_hp());
        newUser.setAlamat(dto.getAlamat());
        newUser.setUsername(username);
        newUser.setPassword(hashedPassword);
        newUser.setId_role(2L);  // Secara default set sebagai penyewa

        authRepository.save(newUser);

        sendEmail(dto.getEmail(), "Registration Successful", "Your username: " + username + "\nYour password: " + password);

        return "Success";
    }

    private String generateUsername(String name) {
        return name.replaceAll("\\s+", "").toLowerCase() + System.currentTimeMillis();
    }

    private String generatePassword() {
        return "P" + Long.toHexString(Double.doubleToLongBits(Math.random()));
    }

    private void sendEmail(String to, String subject, String message) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom(sender);
        mailMessage.setTo(to);
        mailMessage.setSubject(subject);
        mailMessage.setText(message);
        javaMailSender.send(mailMessage);
    }
}
