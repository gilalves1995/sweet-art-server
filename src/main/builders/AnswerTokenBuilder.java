package main.builders;

import main.model.UserToken;

public class AnswerTokenBuilder {

    private AnswerRequestBuilder answer;
    private UserToken token;

    public AnswerTokenBuilder() {}

    public AnswerTokenBuilder(AnswerRequestBuilder answer, UserToken token) {

        this.answer = answer;
        this.token = token;
    }

    public AnswerRequestBuilder getAnswer() {
        return answer;
    }

    public void setAnswer(AnswerRequestBuilder answer) {
        this.answer = answer;
    }

    public UserToken getToken() {
        return token;
    }

    public void setToken(UserToken token) {
        this.token = token;
    }
}
