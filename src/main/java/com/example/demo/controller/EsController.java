package com.example.demo.controller;

import com.example.demo.Service.ArticleService;
import com.example.demo.common.PageUtils;
import com.example.demo.domain.ArticleDocument;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 文章搜索增删查改
 * @author ly-caohr
 *
 */
@RestController
@RequestMapping("/es/Article")
public class EsController {

    @Resource
    private ElasticsearchTemplate elasticsearchTemplate;

    @Resource
    private ArticleService articleService;

    /**
     * 创建索引和映射
     *
     */
    @RequestMapping("/createIndex")
    public void createIndex(){
        System.out.println("进来了。。。");
        elasticsearchTemplate.createIndex(ArticleDocument.class);
        elasticsearchTemplate.putMapping(ArticleDocument.class);
    }

    /**
     * 测试保存文档
     *
     */
    @RequestMapping("/saveArticle")
    public void saveArticle(){
        System.out.println("进来了。。。");
        ArticleDocument articleDocument = new ArticleDocument();
        articleDocument.setId(100);
        articleDocument.setTitle("测试SpringData ElasticSearch");
        articleDocument.setContent("Spring Data ElasticSearch 基于 spring data API " +
                "简化elasticSearch操作，将原始操作elasticSearch的客户端API " +
                "进行封装Spring Data为Elasticsearch Elasticsearch项目提供集成搜索引擎");
        articleService.save(articleDocument);
    }


    /**
     * 搜索
     * http://localhost:9000/es/Article/queryByKeyword?keyword=Data
     * @param keyword:关健字是会搜索到可分词字段Field，比如title与content
     * @return
     */
    @RequestMapping("/queryByKeyword")
    public List<ArticleDocument> query(String keyword){
        return articleService.query(keyword,ArticleDocument.class);
    }



    /**
     * 搜索，命中关键字高亮
     * http://localhost:9000/es/Article/queryHitPage?keyword=封装&indexName=blog2&fields=title,content&pageNo=1&pageSize=1
     * @param pageNo    当前页
     * @param pageSize  每页显示的数据条数
     * @param keyword   关键字
     * @param indexName 索引库名称
     * @param fields    搜索字段名称，多个以“，”分割
     * @return
     */
    @RequestMapping("/queryHitPage")
    public PageUtils queryHitByPage(Integer pageNo,
                                    Integer pageSize,
                                    String keyword,
                                    String indexName,
                                    String fields){
        String[] fieldNames = {};
        if(fields.contains(",")){
            fieldNames = fields.split(",");
        } else{
            fieldNames[0] = fields;
        }
        return articleService.queryHitByPage(pageNo,pageSize,keyword,indexName,fieldNames);
    }


    //布尔组合（bool

    //范围查询(range)




}
