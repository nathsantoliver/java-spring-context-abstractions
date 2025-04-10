package repositories;

import model.Comment;
import org.springframework.stereotype.Repository;

// define this object as a component having the responsibility of repository
@Repository
public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }

}
