package com.socotech.swa

import com.socotech.swa.net.RandomUsers

interface FeedContract {

    interface View {
        fun onError(t: Throwable)
        fun onFetch(t: RandomUsers?)
        fun onLoadingFailure(t: String)
        fun setLoadingIndicator(t: Boolean)
    }

    interface Presenter {
        fun fetchFeed(page: Int, results: Int)
    }

}