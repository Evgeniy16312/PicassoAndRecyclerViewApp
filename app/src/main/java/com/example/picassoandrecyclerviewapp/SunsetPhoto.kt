package com.example.picassoandrecyclerviewapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SunsetPhoto(val url: String) : Parcelable {

    companion object {
        fun getSunsetPhotos(): Array<SunsetPhoto> {
            return arrayOf(
                SunsetPhoto("https://goo.gl/32YN2B"),
                SunsetPhoto("https://picsum.photos/id/67/300"),
                SunsetPhoto("https://picsum.photos/id/55/300"),
                SunsetPhoto("https://picsum.photos/id/56/300"),
                SunsetPhoto("https://picsum.photos/id/77/300"),
                SunsetPhoto("https://picsum.photos/id/51/300"),
                SunsetPhoto("https://picsum.photos/id/68/300"),
                SunsetPhoto("https://picsum.photos/id/74/300"),
                SunsetPhoto("https://picsum.photos/id/89/300"),
                SunsetPhoto("https://picsum.photos/id/90/300"),
                SunsetPhoto("https://picsum.photos/id/108/300"),
                SunsetPhoto("https://goo.gl/Wqz4Ev"),
                SunsetPhoto("https://goo.gl/U7XXdF"),
                SunsetPhoto("https://goo.gl/ghVPFq"),
                SunsetPhoto("https://goo.gl/qEaCWe"),
                SunsetPhoto("https://goo.gl/vutGmM")
            )
        }
    }
}