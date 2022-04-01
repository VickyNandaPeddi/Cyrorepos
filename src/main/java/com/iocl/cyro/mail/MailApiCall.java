package com.iocl.cyro.mail;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.iocl.cyro.mail.AttachmentMailRequest;
import com.iocl.cyro.mail.Mail;
import com.iocl.cyro.mail.WSOutput;
import org.apache.http.HttpHeaders;

/**
 *
 * @author t_sayalee
 */
public class MailApiCall {

    public static WSOutput sendMail(Mail mail) {

        WSOutput ws_output = new WSOutput();

        String WS_URL = "", outputString = "";

//        String link = getAppLink();

        try {

            Gson gson1 = new GsonBuilder().serializeNulls().create();

            String input = gson1.toJson(mail);

            StringEntity inputString;

            WS_URL = "https://webapp.indianoil.co.in/common-mail-api/transmit-mail/simple";

            inputString = new StringEntity(input);

            DefaultHttpClient httpClient = new DefaultHttpClient();

            HttpPost postRequest = new HttpPost(WS_URL);

            String auth = "RDBCOMMONMAIL:MAIL#231";

            byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(StandardCharsets.ISO_8859_1));

            String authHeader = "Basic " + new String(encodedAuth);

            postRequest.setHeader(HttpHeaders.AUTHORIZATION, authHeader);

            inputString.setContentType("application/json");

            postRequest.setEntity(inputString);

            HttpResponse response1 = httpClient.execute(postRequest);

            BufferedReader br = new BufferedReader(new InputStreamReader((response1.getEntity().getContent())));

            String output;

            System.out.println("Output from Server .... \n");

            while ((output = br.readLine()) != null) {

                outputString = output;

            }

            System.out.println("output:" + outputString);

            httpClient.getConnectionManager().shutdown();

            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").create();

            try {

                ws_output = gson.fromJson(outputString, WSOutput.class); // converts JSON object to WSOuput Bean

                // Class
                ws_output.setMailCalled("Y");

            } catch (Exception e) {

                System.out.println("Error in converting output:" + e.getMessage());

                ws_output.setMailCalled("N");

                ws_output.setMessage(e.getMessage());

            }

        } catch (Exception e1) {

            // TODO Auto-generated catch block
            e1.printStackTrace();

            ws_output.setMailCalled("N");

            ws_output.setMessage(e1.getMessage());

        }

        return ws_output;

    }
    
     public static WSOutput sendAttachmentMail(AttachmentMailRequest mail) {

        WSOutput ws_output = new WSOutput();

        String WS_URL = "", outputString = "";

//        String link = getAppLink();

        try {

            Gson gson1 = new GsonBuilder().serializeNulls().create();

            String input = gson1.toJson(mail);

            StringEntity inputString;

            WS_URL = "https://webapp.indianoil.co.in/common-mail-api/transmit-mail/attachment";

            inputString = new StringEntity(input);

            DefaultHttpClient httpClient = new DefaultHttpClient();

            HttpPost postRequest = new HttpPost(WS_URL);

            String auth = "RDBCOMMONMAIL:MAIL#231";

            byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(StandardCharsets.ISO_8859_1));

            String authHeader = "Basic " + new String(encodedAuth);

            postRequest.setHeader(HttpHeaders.AUTHORIZATION, authHeader);

            inputString.setContentType("application/json");

            postRequest.setEntity(inputString);

            HttpResponse response1 = httpClient.execute(postRequest);

            BufferedReader br = new BufferedReader(new InputStreamReader((response1.getEntity().getContent())));

            String output;

            System.out.println("Output from Server .... \n");

            while ((output = br.readLine()) != null) {

                outputString = output;

            }

            System.out.println("output:" + outputString);

            httpClient.getConnectionManager().shutdown();

            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").create();

            try {

                ws_output = gson.fromJson(outputString, WSOutput.class); // converts JSON object to WSOuput Bean

                // Class
                ws_output.setMailCalled("Y");

            } catch (Exception e) {

                System.out.println("Error in converting output:" + e.getMessage());

                ws_output.setMailCalled("N");

                ws_output.setMessage(e.getMessage());

            }

        } catch (Exception e1) {

            // TODO Auto-generated catch block
            e1.printStackTrace();

            ws_output.setMailCalled("N");

            ws_output.setMessage(e1.getMessage());

        }

        return ws_output;

    }
    
    
}
