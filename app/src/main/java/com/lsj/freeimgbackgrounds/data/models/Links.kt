package com.lsj.freeimgbackgrounds.data.models

import com.google.gson.annotations.SerializedName

data class Links(
    @SerializedName("download")
    val download: String,
    @SerializedName("downloadLocation")
    val download_location: String,
    @SerializedName("html")
    val html: String,
    @SerializedName("self")
    val self: String
)