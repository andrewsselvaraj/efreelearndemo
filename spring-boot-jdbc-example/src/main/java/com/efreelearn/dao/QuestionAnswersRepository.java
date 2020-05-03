package com.efreelearn.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
 
import org.springframework.stereotype.Repository;

 

import com.efreelearn.model.Answer;
import com.efreelearn.model.Question;
import com.efreelearn.model.QuestionAnswers;
 

@Repository
public class QuestionAnswersRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
   // public final static RowMapper<Question> questionMapper = ParameterizedBeanPropertyRowMapper.newInstance(Question.class);
   // public final static RowMapper<Answer> answerMapper = ParameterizedBeanPropertyRowMapper.newInstance(Answer.class);
    public List<Question> findAllQuestionwithAnswersBK(String pk_SubjectId,String fk_SchoolId) {
    	
    	String sql = "SELECT q.QuestionName,q.pk_questionid,a.answer,a.correct_answer FROM question_info q , answer_info a ";
    	sql = sql + " where q.fk_SchoolId= a.fk_SchoolId and q.fk_SubjectId=a.fk_SubjectId and q.pk_questionid=a.fk_questionid ";
    	sql = sql + " and q.fk_SubjectId='" +pk_SubjectId+"' and q.fk_SchoolId='"+fk_SchoolId;
    	//jdbcTemplate.execute(sql);
        return jdbcTemplate.query(sql,
                new ResultSetExtractor<List<Question>>() {
                    public List<Question> extractData(ResultSet rs) throws SQLException, DataAccessException {
                        List<Question> questions = new ArrayList<Question>();
                        Long questionId = null;
                        Question currentQuestion = null;
                        int questionIdx = 0;
                        int answerIdx = 0;
                        while (rs.next()) {
                            // first row or when order changes
                            if (currentQuestion == null || !questionId.equals(rs.getLong("pk_questionid"))) {
                            	questionId = rs.getLong("pk_questionid");
                            	//currentQuestion = questionMapper.mapRow(rs, questionIdx++);
                            	currentQuestion.setQuestionName(rs.getString("QuestionName"));
                            	currentQuestion.setPk_questionid(""+rs.getLong("pk_questionid"));
                            	
                            	answerIdx = 0;
                            	questions.add(currentQuestion);
                            }
                            else
                            {
                           // currentQuestion.addItem(answerMapper.mapRow(rs, answerIdx++));
                            }
                            
                        }
                        return questions;
                    }

                });
    }
    
    public List<QuestionAnswers> findAllQuestionwithAnswerforAll(String pk_SubjectId,String fk_SchoolId) {
    	
    	String sql = "SELECT q.QuestionName,q.answer_type,q.media_type,q.pk_questionid,a.pk_answerid,a.answer,a.answer,a.correct_answer FROM question_info q , answer_info a ";
    	sql = sql + " where q.fk_SchoolId= a.fk_SchoolId and q.fk_SubjectId=a.fk_SubjectId and q.pk_questionid=a.fk_questionid order by q.pk_questionid";
    	//sql = sql + " and q.fk_SubjectId='" +pk_SubjectId+"' and q.fk_SchoolId='"+fk_SchoolId;
    	//sql = sql + " and q.fk_SubjectId='" +pk_SubjectId+"' and q.fk_SchoolId='"+fk_SchoolId;
    	//jdbcTemplate.execute(sql);
        return jdbcTemplate.query(sql,
                new ResultSetExtractor<List<QuestionAnswers>>() {
                    public List<QuestionAnswers> extractData(ResultSet rs) throws SQLException, DataAccessException {
                    	List<QuestionAnswers> lstQA= new ArrayList<QuestionAnswers>();
                    	 QuestionAnswers questionAnswers=  new QuestionAnswers();
                    	
                    	Question question = new Question();
                    	//Answer answer = new Answer();
                    	
                    	
                    	
                        List<Answer> answerLst = new ArrayList<Answer>();
                        String questionId = "";
        
                        int questionIdx = 0;
                        int answerIdx = 0;
                        int q=-1;
                        int a=-1;
                        while (rs.next()) {
                        	

                        	
                            // first row or when order changes
                            if (question == null || !questionId.equals(rs.getString("pk_questionid"))) {
                            	question = new Question();
                            	answerLst = new ArrayList<Answer>();
                            	 System.out.println("question no"+q);
                            	questionId = rs.getString("pk_questionid");
                            	//currentQuestion = questionMapper.mapRow(rs, questionIdx++);
                            	question.setPk_questionid(""+rs.getString("pk_questionid"));
                            	question.setQuestionName(rs.getString("QuestionName"));
                            	question.setAnswer_type(rs.getString("answer_type"));
                            	question.setMedia_type(rs.getString("media_type"));
                            	
                            	
                            	//qaList.setQuestion(question);
                              	 

                            	
                            	a = 0;
                            	
                            	
                             	questionAnswers = new QuestionAnswers();                             
                            	questionAnswers.setQuestion(question);
                            	questionAnswers.setAnswers(answerLst);
                            	if(q!=-1)
                            	{
                            		System.out.println(""+ q+""+rs.getString("QuestionName"));
                            	lstQA.add(q, questionAnswers);
                            	//questionAnswers.setAnswers(null);
                            	}
                            	q=q+1;

                            }
                            else
                            {
                            	a= a+1;
                            	 System.out.println("answer no"+a);
                            	 Answer answer = new Answer();
                            	answer.setFk_questionid(""+questionId);
                            	answer.setPk_answerid(rs.getString("pk_answerid"));
                            	answer.setAnswer(rs.getString("answer"));
                            	answer.setCorrect_answer(rs.getString("correct_answer"));
                            	answerLst.add(answer);
                            	//qaList.setAnswers(answerLst);

                            }
                            //lstQA.add(questionAnswers);
                            
               
                        }
                        
                        return lstQA;
                    }

                });
     
    }

  
    public List<QuestionAnswers> findAllQuestionwithAnswers(String pk_SubjectId,String fk_SchoolId) {
    	
    	List<QuestionAnswers> lstQA= new ArrayList<QuestionAnswers>();
    	QuestionAnswers qaList= new QuestionAnswers();
    	QuestionAnswers qaList2= new QuestionAnswers();
    	Question question = new Question();
    	question.setPk_questionid("1");
    	question.setQuestionName("which is capital of delhi");

    	Answer a1 = new Answer();
    	Answer a2 = new Answer();
    	Answer a3 = new Answer();
    	Answer a4 = new Answer();
      	a1.setFk_questionid("1");
    	a1.setAnswer("chennai");
    	a1.setCorrect_answer("Y");
      	a1.setFk_questionid("1");
      	
    	a2.setAnswer("mumbai");
    	a2.setCorrect_answer("N");
      	a2.setFk_questionid("1");
      	
    	a3.setAnswer("bngalore");
    	a3.setCorrect_answer("N");
      	a3.setFk_questionid("1");
      	
      	
      	a4.setAnswer("bngalore");
    	a4.setCorrect_answer("N");
      	a4.setFk_questionid("1");
      	
      	//----
    	Question question2 = new Question();
      	question2.setPk_questionid("2");
    	question2.setQuestionName("which is capital of paskitan");

    	Answer b1 = new Answer();
    	Answer b2 = new Answer();
    	Answer b3 = new Answer();
    	Answer b4 = new Answer();
      	b1.setFk_questionid("2");
    	b1.setAnswer("islabath");
    	b1.setCorrect_answer("Y");    	
      	b1.setFk_questionid("2"); 
      	
    	b2.setAnswer("karchi");
    	b2.setCorrect_answer("N");
      	b2.setFk_questionid("2");
      	
    	b3.setAnswer("dont");
    	b3.setCorrect_answer("N");
      	b3.setFk_questionid("2");
      	
      	
      	b4.setAnswer("bngalore");
    	b4.setCorrect_answer("N");
      	b4.setFk_questionid("2");
      	//--------------
    	List<Answer> answers = new ArrayList<Answer>();
    	answers.add(a1);
    	answers.add(a2);
    	answers.add(a3);    	
    	answers.add(a4);
    	qaList.setAnswers(answers);
    	qaList.setQuestion(question);
    	
    	List<Answer> answers2 = new ArrayList<Answer>();
    	answers2.add(b1);
    	answers2.add(b2);
    	answers2.add(b3);    	
    	answers2.add(b4);
    	qaList2.setAnswers(answers2);
    	qaList2.setQuestion(question2);
    	
    	
    	lstQA.add(qaList);
    	lstQA.add(qaList2);
    	
    	return lstQA;
    	
    	
    } 
    public static void main(String args[])
    {
    	QuestionAnswersRepository q = new QuestionAnswersRepository();
    	List<QuestionAnswers> a= q.findAllQuestionwithAnswers("pk_SubjectId", "fk_SchoolId");
    	a.forEach(System.out::println);
    }
}

