package Tomonil.vaika.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import Tomonil.vaika.models.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
