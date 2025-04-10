package services;

import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import proxies.CommentNotificationProxy;
import repositories.CommentRepository;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(
        basePackages = {"proxies", "services", "repositories"}
)
public class CommentService {
    

}
