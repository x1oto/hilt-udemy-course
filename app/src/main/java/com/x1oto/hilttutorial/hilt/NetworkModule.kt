package com.x1oto.hilttutorial.hilt

import com.x1oto.hilttutorial.MainActivity
import com.x1oto.hilttutorial.network.MyAppNetworkAdapter
import com.x1oto.hilttutorial.network.NetworkAdapter
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class NetworkModule {
    @Binds
    abstract fun bindNetworkAdapterImpl(networkAdapterImpl: MyAppNetworkAdapter): NetworkAdapter
}