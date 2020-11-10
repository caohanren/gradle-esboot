package com.example.demo.Service;

import com.example.demo.domain.ArticleDocument;

public interface ArticleService extends BaseSearchService<ArticleDocument> {
    void save(ArticleDocument articleDocument);
}
