package com.emaster.web.db.model;

import com.ibatis.common.jdbc.exception.NestedSQLException;


public class Questions {
	
	int questionId;
	int questionNumber;
	String questionText;
	int categoryId;
	int diffId;
	String questionAnswer;
	String option1;
	String option2;
	String option3;
	String option4;
	String option5;
	String explanation;
	
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public int getQuestionNumber() {
		return questionNumber;
	}
	public void setQuestionNumber(int questionNumber) {
		this.questionNumber = questionNumber;
	}
	public String getQuestionText() {
		return questionText;
	}
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getDiffId() {
		return diffId;
	}
	public void setDiffId(int diffId) {
		this.diffId = diffId;
	}
	public String getQuestionAnswer() {
		return questionAnswer;
	}
	public void setQuestionAnswer(String questionAnswer) {
		this.questionAnswer = questionAnswer;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	public String getOption5() {
		return option5;
	}
	public void setOption5(String option5) {
		this.option5 = option5;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	
	public int add(Questions questions) throws Exception {
		try {

			com.emaster.web.util.DBUtil.smc.insert("questions.add", questions);
			return 1;
		} catch (NestedSQLException e) {
			if (e.getCause().toString().contains("Duplicate entry"))
				System.out.println("Duplicate Entry");
			else
				throw e;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	
}
