package com.emaster.web.services;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.emaster.web.db.model.Questions;

@Path("/question")
public class QuestionService  {
	
	@POST
	@Path("/add")
	public Response addUser(
		@FormParam("question") String question,
		@FormParam("questionAnswer") String questionAnswer) {
 
	    Questions questions = new Questions();
		
		questions.setQuestionId(1);
		questions.setQuestionNumber(1);
		questions.setDiffId(1);
		questions.setCategoryId(1);
	    questions.setQuestionText(question);
		questions.setQuestionAnswer(questionAnswer);
		
		try {
			questions.add(questions);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Response.status(200)
			.entity("Add Question is called, Question : " + question + ", Answer : " + questionAnswer)
			.build();
 
	}
 

}
