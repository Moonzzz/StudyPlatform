package com.aldrich.service;

import com.aldrich.model.WordPojo;

import java.util.List;
import java.util.Map;

/**
 * @author aldrich
 * @date 2018/12/26 19:08
 */
public interface WordPojoService {

    /**
     * 依据名称查询单词
     * @param name
     * @return list
     * */
    List<WordPojo> getWordPojo(String name);

    /**
     * 获取所有单词信息
     * @return list
     * */
    List<WordPojo> getWordPojos();


    /**
     * 获取所有单词记录
     * @return int
     * */
    int getWordTotal();

    /**
     * 获取分页单词信息
     * @param map
     * @return list
     * */
    List<WordPojo>  getLimitWords(Map map);
}
