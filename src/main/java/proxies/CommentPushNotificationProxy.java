package proxies;

import model.Comment;

public class CommentPushNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending push notification for comment: " +
                comment.getText());
    }

}
