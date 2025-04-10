package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import proxies.CommentNotificationProxy;
import proxies.EmailCommentNotificationProxy;
import repositories.CommentRepository;
import repositories.DBCommentRepository;
import services.CommentService;

@Configuration  // we don't need to use the @ComponentScan because we don't use stereotype annotations.
public class ProjectConfiguration {

    @Bean   // we create a bean for each of the two dependencies.
    public CommentRepository commentRepository() {
        return new DBCommentRepository();
    }

    @Bean   // we create a bean for each of the two dependencies.
    public CommentNotificationProxy commentNotificationProxy() {
        return new EmailCommentNotificationProxy();
    }

    // we use parameters of the @Bean method (which are now defined with the interface type)
    // to instruct Spring to provide references for beans from its context, compatible with
    // the type of the parameters.
    @Bean
    public CommentService commentService(CommentRepository commentRepository,
                                         CommentNotificationProxy commentNotificationProxy) {
        return new CommentService(commentRepository, commentNotificationProxy);
    }

}
