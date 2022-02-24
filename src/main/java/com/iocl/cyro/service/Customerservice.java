package com.iocl.cyro.service;

import com.iocl.cyro.dao.Customerdao;
import com.iocl.cyro.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional

public class Customerservice {

	@Autowired
	public Customerdao customerdao;
	@Autowired
	private JavaMailSender mailSender;

	public Customer saveCustomer(Customer customer) {
		Customer customer2 = customerdao.save(customer);

		String emailid = customer2.getEmailid();
		String sendEmailToRegisteredCustomer = sendEmailToRegisteredCustomer(emailid);
		System.out.println("send email" + sendEmailToRegisteredCustomer);
		return customer2;
	}

	public List<Customer> findAllCustomers() {
		return customerdao.findAll();
	}

	public String sendEmailToRegisteredCustomer(String to) {
		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);

		try {
			helper.setTo(to);
			helper.setText("Saved Sucessfully");
			helper.setSubject("Mail From Iocl");
		} catch (MessagingException e) {
			e.printStackTrace();
			return "Error while sending mail ..";
		}
		mailSender.send(message);
		return "Mail Sent Success!";
	}
}