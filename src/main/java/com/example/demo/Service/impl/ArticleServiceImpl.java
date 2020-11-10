package com.example.demo.Service.impl;

import com.example.demo.Service.ArticleService;
import com.example.demo.dao.ArticleRepository;
import com.example.demo.domain.ArticleDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 文章搜索实现类
 */
@Service
public class ArticleServiceImpl extends BaseSearchServiceImpl<ArticleDocument> implements ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public void save(ArticleDocument articleDocument) {

        articleRepository.save(articleDocument);
    }

}
