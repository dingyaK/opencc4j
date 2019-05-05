package com.github.houbb.opencc4j.support.convert.context.impl;

import com.github.houbb.opencc4j.support.convert.context.UnitConvertContext;

import java.util.Map;

/**
 * 默认中文单元转换上下文
 *
 * @author binbin.hou
 * @since 1.1.0
 */
public class DefaultUnitConvertContext implements UnitConvertContext {

    /**
     * 待转换的单个词/词组
     */
    private String unit;

    /**
     * 单个字符数据集
     */
    private Map<String, String> charData;

    /**
     * 单个词组数据集
     */
    private Map<String, String> phraseData;

    @Override
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public Map<String, String> getCharData() {
        return charData;
    }

    public void setCharData(Map<String, String> charData) {
        this.charData = charData;
    }

    @Override
    public Map<String, String> getPhraseData() {
        return phraseData;
    }

    public void setPhraseData(Map<String, String> phraseData) {
        this.phraseData = phraseData;
    }
}
