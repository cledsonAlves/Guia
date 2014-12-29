package com.br.objetos;



import android.os.Parcel;
import android.os.Parcelable;

public class Post implements Parcelable {
	private String urlImage;
	private String title;
	
	
	public Post(){
		urlImage = "";
		title = "";
	}
	public Post(String urlImage, String title){
		this.urlImage = urlImage;
		this.title = title;
	}
	public Post(Parcel parcel){
		this.urlImage = parcel.readString();
		this.title = parcel.readString();
	}
	
	
	public String getUrlImage() {
		return urlImage;
	}
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(urlImage);
		dest.writeString(title);
	}
	
	public static final Parcelable.Creator<Post> CREATOR = new Parcelable.Creator<Post>(){

		@Override
		public Post createFromParcel(Parcel source) {
			return new Post(source);
		}

		@Override
		public Post[] newArray(int size) {
			return new Post[size];
		}
	};
}
