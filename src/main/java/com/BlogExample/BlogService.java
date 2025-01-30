package com.BlogExample;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {
    private final BlogRepository blogRepository;
    public Article save(AddArticleRequest request){

        return blogRepository.save(request.toEntity());
    }


}
