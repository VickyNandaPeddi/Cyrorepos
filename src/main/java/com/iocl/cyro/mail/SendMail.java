package com.iocl.cyro.mail;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.sql.Blob;
import java.util.Properties;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
public class SendMail {

    public static String sendMessage(String from, String to, String subject, String msg) {

        String host = "MKHOEXHT";//or IP address

        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);
        properties.setProperty("mail.smtp.port", "25");

        Session session = Session.getDefaultInstance(properties, null);

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(subject);
            message.setContent(msg, "text/html");

            Transport.send(message);

        } catch (Exception mex) {
            System.out.println(to);
            mex.printStackTrace();
        }

        return "1";
    }

    public static String sendMessage(String from, String to, String cc, String bcc, String sub, String body) {
to="jyothsanaas@indianoilin";
        String host = "MKHOEXHT";//or IP address

        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);
        properties.setProperty("mail.smtp.port", "25");

        Session session = Session.getDefaultInstance(properties, null);

        try {
            BodyPart messageBodyPart = new MimeBodyPart();
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            if (to != null) {
                message.addRecipients(Message.RecipientType.TO, InternetAddress.parse(to.replaceAll(";", ","), true));
            }
            if (cc != null) {
                message.addRecipients(Message.RecipientType.CC, InternetAddress.parse(cc.replaceAll(";", ","), true));
            }
            if (bcc != null) {
                message.addRecipients(Message.RecipientType.BCC, InternetAddress.parse(bcc.replaceAll(";", ","), true));
            }
            message.setSubject(sub);
            messageBodyPart.setContent(body, "text/html; charset=utf-8");

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);

            // Part two is attachment

            /*

             messageBodyPart = new MimeBodyPart();

             String filename = "Letter from ED(RS) to all Dealers on Daily Pricing 09.06.2017.pdf";

 

             DataSource source = new FileDataSource(filename);

             messageBodyPart.setDataHandler(new DataHandler(source));

             messageBodyPart.setFileName(filename);

 

             multipart.addBodyPart(messageBodyPart);

 

             */
            // Send the complete message parts
            message.setContent(multipart);
            Transport.send(message);
            System.out.println("Mail sent to :- " + to + "--" + cc);
            return "1";
        } catch (Exception mex) {
            System.out.println("ERROR: Sub:- " + sub + "Sent message unsuccessfully. ");
            mex.printStackTrace();
        }
        return "0";
    }

    public static String sendMailwithAttachment(String from, String to, String cc, String bcc, String sub, String body, Blob attachment, String filename, String fileExt) {
        String host = "MKHOEXHT";//or IP address
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);
        properties.setProperty("mail.smtp.port", "25");
        Session session = Session.getDefaultInstance(properties, null);
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipients(Message.RecipientType.TO, InternetAddress.parse(to.replaceAll(";", ","), true));
            message.addRecipients(Message.RecipientType.CC, InternetAddress.parse(cc.replaceAll(";", ","), true));
            message.addRecipients(Message.RecipientType.BCC, InternetAddress.parse(bcc.replaceAll(";", ","), true));
            message.setSubject(sub);
            byte[] bytearray;
            BufferedInputStream bis = new BufferedInputStream(attachment.getBinaryStream());
            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            byte[] buffer = new byte[4096];
            int length = 0;
            while ((length = bis.read(buffer)) != -1) {
                bao.write(buffer, 0, length);

            }
            bao.close();
            bis.close();
            bytearray = bao.toByteArray();
            Multipart multipart = new MimeMultipart("related");
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setContent(body, "text/html; charset=utf-8");
            multipart.addBodyPart(messageBodyPart);
            //attchment
            MimeBodyPart iconBodyPart = new MimeBodyPart();

            iconBodyPart.setFileName(filename + "." + fileExt);
            switch (fileExt) {
                case "pdf":
                    iconBodyPart.setContent(bytearray, "application/pdf");
                    iconBodyPart.addHeader("Content-Type", "application/pdf");
                    break;
                case "png":
                    iconBodyPart.setContent(bytearray, "image/png");
                    iconBodyPart.addHeader("Content-Type", "image/png");
                    break;
                case "jpg":
                    iconBodyPart.setContent(bytearray, "image/jpg");
                    iconBodyPart.addHeader("Content-Type", "image/jpg");
                    break;
                default:
                    iconBodyPart.setContent(bytearray, "image/jpeg");
                    iconBodyPart.addHeader("Content-Type", "image/jpeg");
            }

            multipart.addBodyPart(iconBodyPart);
            message.setContent(multipart);
            Transport.send(message);
            System.out.print("Mail sent to :- " + to);
            return "1";
        } catch (Exception mex) {
            System.out.println("ERROR: Sub:- " + sub + " mail sending failed. ");
            mex.printStackTrace();
        }
        return "0";
    }
}
