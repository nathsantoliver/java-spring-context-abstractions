package main;

import main.model.Comment;
import main.proxies.EmailCommentNotificationProxy;
import main.repositories.DBCommentRepository;
import main.services.CommentService;

public class Main {
    public static void main(String[] args) {
        // 1. creates the instance for the dependencies
        var commentRepository = new DBCommentRepository();
        var commentNotificationProxy = new EmailCommentNotificationProxy();

        // 2. creates the instance of the service class and providing the dependencies
        var commentService = new CommentService(commentRepository, commentNotificationProxy);

        // 3. creates an instance of comment to send as a parameter to the publish comment use case
        var comment = new Comment();
        comment.setAuthor("Laurentiu");

        // 4. calls the publish comment use case
        comment.setText("Demo comment");

        commentService.publishComment(comment);


    }
}
