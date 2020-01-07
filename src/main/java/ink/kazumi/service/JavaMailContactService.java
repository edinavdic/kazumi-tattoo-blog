package ink.kazumi.service;

public class JavaMailContactService implements ContactService {

    private static JavaMailContactService service;

    private JavaMailContactService() {}

    public static synchronized JavaMailContactService getInstance(){
        if(service == null)
            service = new JavaMailContactService();
        return service;
    }

    @Override
    public void sendEmail() {

    }
}
