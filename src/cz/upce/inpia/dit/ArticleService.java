package cz.upce.inpia.dit;

public class ArticleService {
    private EmailService emailService;

    public ArticleService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void publishArticle() {
        // publish article

        emailService.sendEmail("pavel.jetensky@upce.cz", "New article was published");
    }
}
