package com.BlogExample;

public class BlogService {
    private BlogRepository blogRepository;
    public void save(Article article){
        blogRepository.save(article);
    }
}
