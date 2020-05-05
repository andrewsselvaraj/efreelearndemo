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

 
}

