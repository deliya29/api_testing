package RestApi.restapi_aplikasi.User.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import RestApi.restapi_aplikasi.User.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
    
}
