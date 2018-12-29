package com.example.enes.cinemaapp.movie.presenter;

import com.example.enes.cinemaapp.data.model.Movie;
import com.example.enes.cinemaapp.movie.contract.DetailContract;
import com.example.enes.cinemaapp.service.Service;
import javax.inject.Inject;


import io.reactivex.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

import static com.example.enes.cinemaapp.utils.Constants.CREDITS;

public class DetailPresenter extends BasePresenter<DetailContract.CastView> implements DetailContract.CastPresenter {

    Service mService;

    @Inject
    public DetailPresenter(Service service) {
        this.mService=service;
    }

    @Override
    public void requestMovieData(int movieId) {
        getDetailList(this,movieId);
    }

    @Override
    public void onGetCastData(Movie movie) {
        mView.setToView(movie);
    }

    @Override
    public void getDetailList(final DetailContract.CastPresenter castPresenter, int movieId) {

      /*  mCompositeDisposable.add( mService.getMovieCredits(movieId,CREDITS).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(movie -> castPresenter.onGetCastData(movie)));*/
    }
}
