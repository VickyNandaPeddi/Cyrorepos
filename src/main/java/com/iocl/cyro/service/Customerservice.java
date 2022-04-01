package com.iocl.cyro.service;

import com.iocl.cyro.dao.Customerdao;
import com.iocl.cyro.mail.*;
import com.iocl.cyro.model.TrnCustQueries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.transaction.Transactional;
import java.util.List;
import java.util.ArrayList;
@Service
@Transactional

public class Customerservice {

	@Autowired
	public Customerdao customerdao;
	@Autowired
	private JavaMailSender mailSender;

	public TrnCustQueries saveCustomer(TrnCustQueries customer) {
//		customer.setCreatedOn(LocalDate.now());
//		customer customer2 = customer.save(customer);
		
		customerdao.save(customer);
		String body="Dear Customer,<br><br>Thank you for submitting your query.We will revert back.<br><br>Regards,<br>CRYOBG-IOCL.";
//		SendMail.sendMessage("cryobg@indianoil.in",customer.getEmailId() , "", "", "CRYOBG QUERY",body );
//		String emailid = customer2.getEmailId();
//		String sendEmailToRegisteredCustomer = sendEmailToRegisteredCustomer(emailid);
//		System.out.println("send email" + sendEmailToRegisteredCustomer);
		MailApiCall mailapi = new MailApiCall();
		  Mail mail = new Mail();
		 mail.setFrom("retaildashboard@indianoil.in");
         mail.setApplicationName("CRYOBG");
         mail.setBody(body);
         mail.setSubject("CRYOBG QUERY");
         List<MailToCC> toList = new ArrayList<MailToCC>();
         MailToCC email = new MailToCC();
         email.setRecipientMailId(customer.getEmailId());
           //Change
//           drsm1.setRecipientMailId("jyothsanaas@indianoil.in");
           toList.add(email);
         mail.setTo(toList);
         mailapi.sendMail(mail);
		return customer;
	}

	public List<TrnCustQueries> findAllCustomers() {
		return customerdao.findAll();
	}

	
}