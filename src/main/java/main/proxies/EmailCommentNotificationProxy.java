package main.proxies;

import main.model.Comment;
import org.springframework.stereotype.Component;

// instruct Spring to instantiate the class and add an instance as a bean in its context
@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment.getText());
    }

}
