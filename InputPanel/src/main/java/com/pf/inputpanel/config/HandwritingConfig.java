package com.pf.inputpanel.config;

import android.graphics.Color;

/**
 * 笔迹的配置
 */
public class HandwritingConfig {

    private int penWidth = 10;//画笔宽度
    private int penColor = Color.BLACK; //画笔颜色

    public int getPenWidth() {
        return penWidth;
    }

    public void setPenWidth(int penWidth) {
        this.penWidth = penWidth;
    }

    public int getPenColor() {
        return penColor;
    }

    public void setPenColor(int penColor) {
        this.penColor = penColor;
    }
}
