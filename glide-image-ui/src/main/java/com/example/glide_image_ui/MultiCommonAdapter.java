package com.example.glide_image_ui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * @version : 1.0
 * @autho : dongyiming
 * @data : 2017/6/7 0:51
 */
public class MultiCommonAdapter extends RecyclerView.Adapter<BaseViewHolder> {


    private Context mContext;
    private ICommonRecyclerListener iCommonoRecyclerListener;

    public MultiCommonAdapter(Context mContext, ICommonRecyclerListener iCommonRecyclerListener) {

        this.mContext = mContext;
        this.iCommonoRecyclerListener = iCommonRecyclerListener;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        int layoutId = iCommonoRecyclerListener.getLayoutId();
        return BaseViewHolder.build(mContext, layoutId, parent, null);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {

        iCommonoRecyclerListener.convert(holder, position);
    }

    @Override
    public int getItemCount() {

        return 20;
    }

}
