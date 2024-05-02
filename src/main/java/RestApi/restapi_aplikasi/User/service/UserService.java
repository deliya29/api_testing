package RestApi.restapi_aplikasi.User.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import RestApi.restapi_aplikasi.User.repository.UserRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired
    public UserRepository userRepository;
    
    public Object getData(){
        return userRepository.findAll();
    }

    public void setEmail(String email) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setEmail'");
    }

}
