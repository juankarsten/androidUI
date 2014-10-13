package com.example.androidlistview.adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.example.androidlistview.R;
import com.example.androidlistview.app.AppController;
import com.example.androidlistview.model.Movie;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MovieListAdapter extends BaseAdapter{

	private List<Movie> movies;
	private Activity activity;
	private LayoutInflater layoutInflater;
	private ImageLoader imageLoader;
	
	public MovieListAdapter(Activity activity,
			List<Movie> movies) {
		this.activity = activity;
		this.movies = movies;
		imageLoader = AppController.getInstance().getImageLoader();
	}
	
	@Override
	public int getCount() {
		return movies.size();
	}

	@Override
	public Object getItem(int position) {
		return movies.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if(layoutInflater==null){
			layoutInflater = (LayoutInflater) activity
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		}
		if(convertView==null){
			convertView = layoutInflater
					.inflate(R.layout.activity_movie_list_item, null);
		}
		if (imageLoader == null){
			imageLoader = AppController.getInstance().getImageLoader();
		}
            
		NetworkImageView image = (NetworkImageView)convertView
				.findViewById(R.id.thumbnail);
		TextView title = (TextView)convertView
				.findViewById(R.id.title);
		TextView rating = (TextView)convertView
				.findViewById(R.id.rating);
		TextView genre = (TextView)convertView
				.findViewById(R.id.genre);
		TextView year = (TextView)convertView
				.findViewById(R.id.year);
		
		Movie m = movies.get(position);
		image.setImageUrl(m.getThumbnailUrl(), imageLoader);
		title.setText(m.getTitle());
		rating.setText("Rating: "+ m.getRating());
		genre.setText(m.getGenres().toString());
		year.setText(""+m.getYear());
		
		return convertView;
	}

}
