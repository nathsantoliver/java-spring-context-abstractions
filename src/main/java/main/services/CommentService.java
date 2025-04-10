package main.services;

import main.model.Comment;
import main.proxies.CommentNotificationProxy;
import main.repositories.CommentRepository;

public class CommentService {
    // we define the two dependencies as attributes of the class
    private final CommentRepository commentRepository;

    // we provide the dependencies when the object is built through the parameters of the constructor
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    // we implement the use case that delegates the "store comment" and
    // "send notification" responsibilities to the dependencies
    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }

}
