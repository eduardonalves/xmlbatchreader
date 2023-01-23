package com.ccee.app;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.transform.Source;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionException;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.oxm.Unmarshaller;
import org.springframework.oxm.XmlMappingException;

import com.ccee.app.model.AgenteXml;
import com.ccee.app.model.AgenteXml;

@SpringBootApplication
public class CceeappApplication {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws XmlMappingException, IOException {
		
		 /*try {

	        File file = new File("exemplo_01.xml");
	        JAXBContext jaxbContext = JAXBContext.newInstance(Agentes.class);

	        Unmarshaller jaxbUnmarshaller = (Unmarshaller) jaxbContext.createUnmarshaller();
	        Agentes que= (Agentes) jaxbUnmarshaller.unmarshal((Source) file);

	        System.out.println("Books:");
	        List<Agente> list= que.getAgentes();
	        
	        for(Agente bk:list)
	            System.out.println(bk.getId()+" "+bk.getCodigo()+"  "+bk.getData());

	    } catch (JAXBException e) {
	        e.printStackTrace();
	    }*/
		/*
		  ApplicationContext applicationContext = null;
        try {
        	JobParametersBuilder builder = new JobParametersBuilder();
        	builder.addDate("date", new Date());
            applicationContext = new ClassPathXmlApplicationContext("./spring-batch-context.xml");
            JobLauncher jobLauncher = (JobLauncher) applicationContext.getBean("jobLauncher");
            Job job = (Job) applicationContext.getBean("gtnContractJob");
            JobExecution execution = jobLauncher.run(job,  builder.toJobParameters());
            System.out.println("Exit status:"+execution.getStatus());
        } catch (Exception e) {
            e.printStackTrace();
        }*/

		ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring-batch-context.xml");
		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
        Job job = (Job) context.getBean("gtnContractJob");
        System.out.println("Begin Job! ");
        try {
        	JobParametersBuilder builder = new JobParametersBuilder();
        	builder.addDate("date", new Date());
        	
            JobExecution execution = jobLauncher.run(job, builder.toJobParameters());
            System.out.println("Job Exit Status : "+ execution.getStatus());

        } catch (JobExecutionException e) {
            System.out.println("Job ExamResult failed");
            e.printStackTrace();
        }/**/


		//SpringApplication.run(CceeappApplication.class, args);
	}

}
