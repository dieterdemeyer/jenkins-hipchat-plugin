package jenkins.plugins.hipchat;

import org.junit.Test;

public class StandardHipChatServiceTest {

    @Test
    public void publishShouldNotRethrowExceptions() {
        StandardHipChatService service = new StandardHipChatService("token", "room", "from");
        service.setHost("hostvaluethatwillcausepublishtofail");
        service.publish("message");
    }
}
