package ch.puzzle.openshift.gotquestions;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/question")
public class QuestionController {

    @GET
    public String test() {
        return "test";
    }
}
