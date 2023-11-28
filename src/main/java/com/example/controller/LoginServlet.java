package com.example.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;

@WebServlet(value = "/login")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String username = req.getParameter("username");
		
		String password = req.getParameter("password");
		
		// 預設用戶：username=user,password=123($2a$10$k0t0dIE4M4etzejry03pDeNsDJ3gaT4ZWxdf6uB/ZcP/nR.w8kzvS)
		boolean isPasswordMatch = BCrypt.checkpw(password, "$2a$10$k0t0dIE4M4etzejry03pDeNsDJ3gaT4ZWxdf6uB/ZcP/nR.w8kzvS");
		if("user".equals(username) && isPasswordMatch) {
			
			// 設定 Http Session 資料
			HttpSession session = req.getSession();
			session.setAttribute("isLogin", true);
			session.setAttribute("username", username);
			
			resp.sendRedirect("./");
			return;
		}
		
		// 處理驗證沒有過的時候，要怎麼處理
		req.setAttribute("error", "帳號或密碼輸入錯誤!");
		RequestDispatcher rd = req.getRequestDispatcher("./login.jsp");
		rd.forward(req, resp);
		
	}

}

