package com.BlogExample;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddArticleRequest {
 private Long id;
 private String title;
 private String content;
 public Article toEntity(){
   return  Article.builder()
           .title(title)
           .content(content)
           .build();

 }
}
