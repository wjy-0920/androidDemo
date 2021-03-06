package com.jikexueyuan.news.adapter;


import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.jikexueyuan.news.R;
import com.jikexueyuan.news.model.News;
import com.jikexueyuan.news.utils.HttpUtils;

public class NewsAdapter extends BaseAdapter {
	
	private Context context;
	private List<News> newsList;
	
	public NewsAdapter(Context context, List<News> newsList){
		this.context = context;
		this.newsList = newsList;
	}

	@Override
	public int getCount() {
		return newsList.size();
	}

	@Override
	public News getItem(int position) {
		return newsList.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null){
			convertView = LayoutInflater.from(context).inflate(R.layout.news_item, null);
		}
		TextView tvTitle = (TextView) convertView.findViewById(R.id.tvTitle);
		TextView tvDesc = (TextView) convertView.findViewById(R.id.tvDesc);

		
		News news = newsList.get(position);
		tvTitle.setText(news.getTitle());
		tvDesc.setText(news.getDesc());

		
		return convertView;
	}
}
