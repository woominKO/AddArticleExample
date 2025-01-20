package com.BlogExample;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class BlogApiController {
    private final BlogRepository blogRepository;

    public BlogApiController(BlogRepository blogRepository){
        this.blogRepository= blogRepository;
    }

    @PostMapping("/api/articles")
    public ResponseEntity<Article> add(@RequestBody List<AddArticleRequest> request){

            return ResponseEntity.status(HttpStatus.OK)
                    .
        }

    }

}
