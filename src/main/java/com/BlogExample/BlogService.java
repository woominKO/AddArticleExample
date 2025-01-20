package com.BlogExample;

public class BlogService {
    private BlogRepository blogRepository;
    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }
}
