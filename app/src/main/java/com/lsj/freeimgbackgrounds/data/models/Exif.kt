package com.lsj.freeimgbackgrounds.data.models

import com.google.gson.annotations.SerializedName

data class Exif(
    @SerializedName("aperture")
    val aperture: String,
    @SerializedName("exposureTime")
    val exposure_time: String,
    @SerializedName("focal_length")
    val focalLength: String,
    @SerializedName("iso")
    val iso: Int,
    @SerializedName("make")
    val make: String,
    @SerializedName("model")
    val model: String
)