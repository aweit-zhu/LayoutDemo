package com.example.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet( value = "/download")
public class DownloadServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String filename = req.getParameter("filename"); //123.xlsx
		
		resp.setContentType("APPLICATION/OCTET-STREAM");
		resp.setHeader("Content-Disposition", "attachment; filename=\""+filenameEncode(filename)+"\"");
		
		String filePath = "C:\\Users\\NTPU\\Desktop\\" + filename;
		Path source = Paths.get(filePath);
		
		try (OutputStream output = resp.getOutputStream()){
			Files.copy(source, output);
		}
	}

	public static String filenameEncode(String name) {
	    try {
	        return java.net.URLEncoder.encode(name, "UTF-8").replace("+", "%20");
	    } catch (java.io.UnsupportedEncodingException e) {
	        e.printStackTrace();
	        return name;
	    }
	}
}
