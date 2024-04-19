package com.example.githubcicdaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class GithubCicdActionApplication {
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to sadesign !";
    }

    //    echo "# githubActions" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/Vo-Hoang-Minh-Sang/githubActions.git
//    git push -u origin main
    public static void main(String[] args) {
        SpringApplication.run(GithubCicdActionApplication.class, args);
    }

}
