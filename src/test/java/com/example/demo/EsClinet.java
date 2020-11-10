//package com.example.demo;
//
//import com.example.demo.Service.ArticleService;
//import com.example.demo.domain.ArticleDocument;
//import org.elasticsearch.action.admin.indices.create.CreateIndexRequestBuilder;
//import org.elasticsearch.action.admin.indices.create.CreateIndexResponse;
//import org.elasticsearch.common.settings.Settings;
//import org.elasticsearch.common.transport.InetSocketTransportAddress;
//import org.elasticsearch.transport.client.PreBuiltTransportClient;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
//
//import javax.annotation.Resource;
//import java.net.InetAddress;
//
///**
// * es客户端测试
// */
//@SpringBootTest
//public class EsClinet {
//
//
//
//
//    /**
//     * 目标:创建一个叫blog的index(索引)
//     * 步骤：
//     * 1.连接ElasticSearch前置准备:确定连接地址,确定连接的集群名称。
//     * 2.创建ElasticSearch连接客户端,客户端需要使用到配置信息。
//     * 3.客户端创建索引的请求对象。
//     * 4.请求对象执行发送请求操作,请求完成会获取响应对象。
//     * 5.关闭客户端。
//     */
//    @Test
//    public void createIndex() throws Exception {
//        //* 1.连接ElasticSearch前置准备:
//        // 确定连接地址,
//        InetSocketTransportAddress address = new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9301);
//        // 确定连接的集群名称
//        Settings settings = Settings.builder().put("cluster.name", "lanyou-elastic").build();
//        //* 2.创建ElasticSearch连接客户端,客户端需要使用到配置信息
//        PreBuiltTransportClient client = new PreBuiltTransportClient(settings);
//        client.addTransportAddress(address);
//        //* 3.客户端创建创建索引的请求对象
//        CreateIndexRequestBuilder indexRequestBuilder = client.admin().indices().prepareCreate("blog");
//        //* 4.请求对象执行发送请求操作,请求完成会获取响应对象
//        CreateIndexResponse indexResponse = indexRequestBuilder.get();
//        System.out.println(indexResponse.isAcknowledged());
//        //* 5.关闭客户端
//        client.close();
//    }
//
//
//
//
//
//
//
//}
