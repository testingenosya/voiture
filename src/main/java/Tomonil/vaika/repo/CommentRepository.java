package Tomonil.vaika.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import Tomonil.vaika.models.Comment;

public interface CommentRepository extends JpaRepository<Comment,Long> {

}
