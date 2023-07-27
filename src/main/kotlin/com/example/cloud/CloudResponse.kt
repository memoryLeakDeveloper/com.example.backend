package com.example.cloud

sealed interface CloudResponse<T> {

    class Success<T>(val result: T) : CloudResponse<T>

    class Error<Nothing>(val exception: Throwable?) : CloudResponse<Nothing>
}

fun <R> CloudResponse<R>.getResult(
    success: (CloudResponse.Success<R>) -> Unit,
    failure: (CloudResponse.Error<Nothing>) -> Unit,
) = when (this) {
    is CloudResponse.Success -> success(this)
    else -> failure(CloudResponse.Error((this as CloudResponse.Error).exception))
}