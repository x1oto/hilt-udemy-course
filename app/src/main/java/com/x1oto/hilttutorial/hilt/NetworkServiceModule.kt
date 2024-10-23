package com.x1oto.hilttutorial.hilt

import com.x1oto.hilttutorial.network.CallInterceptorImpl
import com.x1oto.hilttutorial.network.NetworkService
import com.x1oto.hilttutorial.network.ResponseInterceptorImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped

@Module
@InstallIn(ActivityComponent::class)
class NetworkServiceModule {
//    @Provides
//    fun provideNetworkService(): NetworkService {
//        return NetworkService.Builder()
//            .host("google.com")
//            .protocol("https")
//            .build()
//    }

    @ActivityScoped
    @CallInterceptor
    @Provides
    fun provideCallNetworkService(): NetworkService {
        return NetworkService.Builder()
            .host("google.com")
            .protocol("HTTPS")
            .interceptor(CallInterceptorImpl())
            .build()
    }

    @ActivityScoped
    @ResponseInterceptor
    @Provides
    fun provideResponseNetworkService(): NetworkService {
        return NetworkService.Builder()
            .host("google.com")
            .protocol("HTTPS")
            .interceptor(ResponseInterceptorImpl())
            .build()
    }
}