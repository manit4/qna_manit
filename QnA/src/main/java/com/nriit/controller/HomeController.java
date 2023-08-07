package com.nriit.controller;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import com.nriit.repository.UserRepository;
import com.nriit.to.User;
import com.nriit.to.User2;

@Controller
public class HomeController {
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/")
	public String homePage() {
		
		return "index";
	}
	
	@GetMapping("/getRegistrationPage")
	public String registrationPage( ) {
		
		return "registration_page";
	}
	
//	@PostMapping("/registerMe")
//	public String register(String uname, String password, String name, String email)  {
//		System.out.println("inside register()..."+uname+", "+password+", "+name+", "+email);
//		
//		UserRepository userRepository = new UserRepository();
//		userRepository.saveUser(uname, password, name, email);
//		
//		return "index";
//	}
	
//	@PostMapping("/registerMe")
//	public String register(String uname, String password, String name, String email)  {
//		System.out.println("inside register()..."+uname+", "+password+", "+name+", "+email);
//		
//		UserRepository userRepository = new UserRepository();
//		
//		User user = new User(uname, password, name, email);
//		
//		userRepository.saveUser(user);
//		
//		return "index";
//	}
	
	@PostMapping("/registerMe")
	public String register(String uname, String password, String name, String email, String role)  {
		System.out.println("inside register()..."+uname+", "+password+", "+name+", "+email+", "+role);
		
		User user = new User(uname, password, name, email, role);
		
		userRepository.saveUser(user);
		
		return "index";
	}
	
	@GetMapping("/uploadImage")
	public String upload() {
		
		return "upload_image";
	}
	
//	@PostMapping("/users/save")
//    public RedirectView saveUser(User2 user,
//            @RequestParam("image") MultipartFile multipartFile) throws IOException {
//         
//        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
//        user.setImagePath(fileName);
//         
//        User savedUser = repo.save(user);
// 
//        String uploadDir = "user-photos/" + savedUser.getId();
// 
//        saveFile(uploadDir, fileName, multipartFile);
//         
//        return new RedirectView("/users", true);
//    }
//	
//	public static void saveFile(String uploadDir, String fileName,
//            MultipartFile multipartFile) throws IOException {
//        Path uploadPath = Paths.get(uploadDir);
//         
//        if (!Files.exists(uploadPath)) {
//            Files.createDirectories(uploadPath);
//        }
//         
//        try (InputStream inputStream = multipartFile.getInputStream()) {
//            Path filePath = uploadPath.resolve(fileName);
//            Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException ioe) {        
//            throw new IOException("Could not save image file: " + fileName, ioe);
//        }      
//    }
	
	
}
