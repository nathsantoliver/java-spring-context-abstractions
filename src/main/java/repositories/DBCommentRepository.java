package repositories;

import model.Comment;
import org.springframework.stereotype.Component;

// instruct Spring to instantiate the class and add an instance as a bean in its context
@Component
public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }

}
