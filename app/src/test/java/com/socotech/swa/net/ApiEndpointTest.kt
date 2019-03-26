package com.socotech.swa.net

import com.socotech.swa.mvp.UnitTestSchedulerProvider
import org.junit.Before
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class ApiEndpointTest {

    lateinit var randomUserApi: RandomUserApi

    @Before
    fun onSetup() {
        randomUserApi = NetModule().api(UnitTestSchedulerProvider())
    }

    @Test
    fun testGet() {
        val observable = randomUserApi.get("us", 1, "swa_challenge", 100).test()
        observable.assertNoErrors()
    }

}