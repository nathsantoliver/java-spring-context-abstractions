package main.services;

import main.model.Comment;
import main.proxies.CommentNotificationProxy;
import main.repositories.CommentRepository;
import org.springframework.stereotype.Component;

@Component  // Spring creates a bean of this class and adds it to its context.
public class CommentService {
    // we define the two dependencies as attributes of the class.
    private final CommentRepository commentRepository;

    // we provide the dependencies when the object is built through the parameters of the constructor.
    private final CommentNotificationProxy commentNotificationProxy;

    // we just use @Autowired if the class had more than one constructor.
    // Spring uses this constructor to create the bean and  injects references
    // from its context in the parameters when creating the instance.
    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    // we implement the use case that delegates the "store comment" and
    // "send notification" responsibilities to the dependencies.
    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }

}
