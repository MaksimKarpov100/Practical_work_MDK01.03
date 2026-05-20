package com.example.pr04.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val Blue = Color(0xFF57A9FF)
val Green = Color(0xFF00B712)
val Gray = Color(0xFF939396)

val PrimaryColor = Color(0xFF0560FA)
val SecondaryColor = Color(0xFFEC8000)

val SuccessColor = Color(0xFF35B369)
val WarningColor = Color(0xFFEBBC2E)
val InfoColor = Color(0xFF2F80ED)
val ErrorColor = Color(0xFFED3A3A)

val TextColorDark = Color(0xFF3A3A3A)
val TextColorBlack = Color(0xFF141414)
val TextColorGray = Color(0xFFF5F5F9)
val TextColorGray2 = Color(0xFFA7A7A7)

val WhiteColor = Color(0xFFFFFFFF)
val TabColor = Color(0xFFB8C1CC)

@Immutable
data class AppColors(
    val primary: Color,
    val secondary: Color,
    val success: Color,
    val warning: Color,
    val info: Color,
    val error: Color,
    val textblack: Color,
    val textDark: Color,
    val textgrey: Color,
    val textgrey2: Color,
)

val LocalAppColors = staticCompositionLocalOf {
    AppColors(
        primary = Color.Unspecified,
        secondary = Color.Unspecified,
        success = Color.Unspecified,
        warning = Color.Unspecified,
        info = Color.Unspecified,
        error = Color.Unspecified,
        textblack = Color.Unspecified,
        textDark = Color.Unspecified,
        textgrey = Color.Unspecified,
        textgrey2 = Color.Unspecified
    )
}
