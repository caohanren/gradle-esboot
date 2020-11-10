package com.example.demo.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 * @Document 文档对象 （索引信息、文档类型 ）
 */
@Data
@Document(indexName="blog2",type="article")
public class ArticleDocument implements Serializable {

    /**
     * @Id 文档主键 唯一标识
     * @Field 每个文档的字段配置（类型、是否分词、是否存储、分词器 ）
     *
     */
    @Id
    @Field(store=true, index = false,type = FieldType.Integer)
    private Integer id;

    /**
     * @Field 每个文档的字段配置（是否分词、分词器、是否存储、类型 ）
     *
     */
    @Field(index=true,analyzer="ik_smart",store=true,searchAnalyzer="ik_smart",type = FieldType.Text)
    private String title;

    @Field(index=true,analyzer="ik_smart",store=true,searchAnalyzer="ik_smart",type = FieldType.Text)
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
