package com.iocl.cyro.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iocl.cyro.model.ApiResponse;
import com.iocl.cyro.model.TrnOrderDetails;
import com.iocl.cyro.model.MstEmployee;
import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

@RestController
@CrossOrigin(origins = { "http://localhost:4200", "https://uat.indianoil.co.in", "https://spandan.indianoil.co.in" })
@RequestMapping("/auth")
public class AuthController {

	
	@PostMapping("/validateUser")
	public ResponseEntity<ApiResponse> 
	validateUser(@RequestBody MstEmployee mstEmployee,HttpServletResponse response) {
		try {
		System.out.print("emp_code "+mstEmployee.getEmpCode());
		System.out.println("pass "+mstEmployee.getPassword());
		boolean check=AdAuthentication(mstEmployee.getEmpCode(), mstEmployee.getPassword());
		System.out.println(check);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(
				new ApiResponse(true, "Login "+check));
		}catch(Exception ex) {
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(
					new ApiResponse(true, "Login exception"));
		}

		
	}
	
	public boolean AdAuthentication(String user, String pass) throws Exception {
        Hashtable env = null;
        DirContext ctx = null;
        try {
            env = new Hashtable();
            env.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.ldap.LdapCtxFactory");
            //env.put(Context.PROVIDER_URL, "LDAP://dcmkho04:389 LDAP://dcmkho1:389 LDAP://dcmkho2:389 ");            
//            env.put(Context.PROVIDER_URL, "LDAP://dcmkho:389");            
            env.put(Context.PROVIDER_URL, "LDAP://dcmkho03.ds.indianoil.in:389");            
            env.put(Context.SECURITY_AUTHENTICATION, "DIGEST-MD5");            
            env.put(Context.SECURITY_PRINCIPAL, user);            
            env.put(Context.SECURITY_CREDENTIALS, pass);
            ctx = new InitialDirContext(env);
            ctx.close();
        } catch (NamingException ne) {
            System.out.println(ne);
            return false;
        } finally {
            env = null;
            ctx = null;
        }
        
        return true;
    }
}
