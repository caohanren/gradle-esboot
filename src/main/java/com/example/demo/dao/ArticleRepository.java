package com.example.demo.dao;

import com.example.demo.domain.ArticleDocument;
import org.springframework.stereotype.Repository;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


@Repository
public interface ArticleRepository extends ElasticsearchRepository<ArticleDocument, Integer> {

}