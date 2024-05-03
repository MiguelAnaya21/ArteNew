package com.example.arte.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Obras(
    @StringRes val textoTitulo: Int,
    @StringRes val textoPorId: Int,
    @DrawableRes val imagenPorId: Int,
)