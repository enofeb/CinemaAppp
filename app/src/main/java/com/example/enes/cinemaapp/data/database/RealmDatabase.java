package com.example.enes.cinemaapp.data.database;

import android.content.Context;

import com.example.enes.cinemaapp.data.model.Movie;

import java.util.List;

import javax.inject.Singleton;

import rx.Observable;
import io.realm.Realm;
import io.realm.RealmConfiguration;

@Singleton
public class RealmDatabase implements IDatabase {

    private Context context;
    private RealmConfiguration realmConfiguration;

    public RealmDatabase(){}

    public RealmDatabase(Context context){
        this.context=context;
        Realm.init(this.context);
        this.realmConfiguration=new RealmConfiguration.Builder()
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(realmConfiguration);
    }

    @Override
    public void saveMovie(Movie movie) {
        final Realm realm=Realm.getDefaultInstance();
        realm.executeTransaction(realm1 -> {
            final Movie realMovie=realm.createObject(Movie.class,movie.getRealId());
            realMovie.setId(movie.getId());
            realMovie.setTitle(movie.getTitle());
            realMovie.setOverView(movie.getOverView());
            realMovie.setReleaseDate(movie.getReleaseDate());
            realMovie.setVoteCount(movie.getVoteCount());
            realMovie.setImagePath(movie.getImagePath());
            realMovie.setAdult(movie.getAdult());
            realMovie.setVideo(movie.getVideo());
            realMovie.setGenreIds(movie.getGenreIds());
            realMovie.setVoteAverage(movie.getVoteAverage());
            realMovie.setPopularity(movie.getPopularity());
            realMovie.setOriginalLanguage(movie.getOriginalLanguage());
            realMovie.setOriginalTitle(movie.getTitle());
            realMovie.setBackdropPath(movie.getBackdropPath());
            realMovie.setCredits(movie.getCasting());
        });
        realm.close();
    }

    @Override
    public List<Movie> fetchMovies() {
        final Realm realm=Realm.getDefaultInstance();
        List<Movie> allMovies=realm.copyFromRealm(realm.where(Movie.class).findAll());
        realm.close();
        return allMovies;
    }

    @Override
    public Observable<Movie> fetchMoviesObservable() {
        return Observable.from(fetchMovies());
    }
}
