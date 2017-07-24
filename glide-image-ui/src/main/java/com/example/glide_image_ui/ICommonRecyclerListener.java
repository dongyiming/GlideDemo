package com.example.glide_image_ui;

/**
 * @version : 1.0
 * @Description : 普通抽取的多样式adapter接口
 * @autho : dongyiming
 * @data : 2017/6/7 0:53
 */
public interface ICommonRecyclerListener {

    /**
     * 返回类型对应的布局
     *
     * @return
     */
    public int getLayoutId();

    /**
     * holder数据处理
     *
     * @param holder
     * @param position
     */
    public void convert(BaseViewHolder holder, int position);

}
