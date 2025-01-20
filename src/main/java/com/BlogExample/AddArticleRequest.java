package com.BlogExample;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddArticleRequest {
 private Long id;
 private String title;
 private String content;
}
