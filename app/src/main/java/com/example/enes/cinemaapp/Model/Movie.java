package com.example.enes.cinemaapp.Model;

import android.net.Uri;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Movie {

        @SerializedName("id")
        private Integer id;
        @SerializedName("title")
        private String title;
        @SerializedName("overview")
        private String overView;
        @SerializedName("release_date")
        private String releaseDate;
        @SerializedName("vote_count")
        private Integer voteCount;
        @SerializedName("poster_path")
        private String imagePath;
        @SerializedName("adult")
        private Boolean adult;
        @SerializedName("video")
        private Boolean video;
        @SerializedName("genre_ids")
        private List<Integer>genreIds=new ArrayList<Integer>();
        @SerializedName("vote_average")
        private Double voteAverage;
        @SerializedName("popularity")
        private Double popularity;
        @SerializedName("original_language")
        private String originalLanguage;
        @SerializedName("original_title")
        private String originalTitle;
        @SerializedName("backdrop_path")
        private String backdropPath;


    public Movie(Integer id, String title, String overView, String releaseDate, Integer voteCount,
                 String imagePath, Boolean adult, Boolean video, List<Integer> genreIds, Double voteAverage,
                 Double popularity, String originalLanguage, String originalTitle, String backdropPath) {
        this.id = id;
        this.title = title;
        this.overView = overView;
        this.releaseDate = releaseDate;
        this.voteCount = voteCount;
        this.imagePath = imagePath;
        this.adult = adult;
        this.video = video;
        this.genreIds = genreIds;
        this.voteAverage = voteAverage;
        this.popularity = popularity;
        this.originalLanguage = originalLanguage;
        this.originalTitle = originalTitle;
        this.backdropPath = backdropPath;
    }



    public Boolean getAdult() {
        return adult;
    }

    public void setAdult(Boolean adult) {
        this.adult = adult;
    }

    public Boolean getVideo() {
        return video;
    }

    public void setVideo(Boolean video) {
        this.video = video;
    }

    public List<Integer> getGenreIds() {
        return genreIds;
    }

    public void setGenreIds(List<Integer> genreIds) {
        this.genreIds = genreIds;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }

    public Double getPopularity() {
        return popularity;
    }

    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverView() {
        return overView;
    }

    public void setOverView(String overView) {
        this.overView = overView;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }

    public String getImagePath() {
        return "https://image.tmdb.org/t/p/w185"+imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }


}