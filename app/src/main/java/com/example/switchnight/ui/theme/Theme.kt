package com.example.switchnight.ui.theme
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import com.example.switchnight.ui.theme.backgroundDark
import com.example.switchnight.ui.theme.backgroundDarkHighContrast
import com.example.switchnight.ui.theme.backgroundDarkMediumContrast
import com.example.switchnight.ui.theme.backgroundLight
import com.example.switchnight.ui.theme.backgroundLightHighContrast
import com.example.switchnight.ui.theme.backgroundLightMediumContrast
import com.example.switchnight.ui.theme.errorContainerDark
import com.example.switchnight.ui.theme.errorContainerDarkHighContrast
import com.example.switchnight.ui.theme.errorContainerDarkMediumContrast
import com.example.switchnight.ui.theme.errorContainerLight
import com.example.switchnight.ui.theme.errorContainerLightHighContrast
import com.example.switchnight.ui.theme.errorContainerLightMediumContrast
import com.example.switchnight.ui.theme.errorDark
import com.example.switchnight.ui.theme.errorDarkHighContrast
import com.example.switchnight.ui.theme.errorDarkMediumContrast
import com.example.switchnight.ui.theme.errorLight
import com.example.switchnight.ui.theme.errorLightHighContrast
import com.example.switchnight.ui.theme.errorLightMediumContrast
import com.example.switchnight.ui.theme.inverseOnSurfaceDark
import com.example.switchnight.ui.theme.inverseOnSurfaceDarkHighContrast
import com.example.switchnight.ui.theme.inverseOnSurfaceDarkMediumContrast
import com.example.switchnight.ui.theme.inverseOnSurfaceLight
import com.example.switchnight.ui.theme.inverseOnSurfaceLightHighContrast
import com.example.switchnight.ui.theme.inverseOnSurfaceLightMediumContrast
import com.example.switchnight.ui.theme.inversePrimaryDark
import com.example.switchnight.ui.theme.inversePrimaryDarkHighContrast
import com.example.switchnight.ui.theme.inversePrimaryDarkMediumContrast
import com.example.switchnight.ui.theme.inversePrimaryLight
import com.example.switchnight.ui.theme.inversePrimaryLightHighContrast
import com.example.switchnight.ui.theme.inversePrimaryLightMediumContrast
import com.example.switchnight.ui.theme.inverseSurfaceDark
import com.example.switchnight.ui.theme.inverseSurfaceDarkHighContrast
import com.example.switchnight.ui.theme.inverseSurfaceDarkMediumContrast
import com.example.switchnight.ui.theme.inverseSurfaceLight
import com.example.switchnight.ui.theme.inverseSurfaceLightHighContrast
import com.example.switchnight.ui.theme.inverseSurfaceLightMediumContrast
import com.example.switchnight.ui.theme.onBackgroundDark
import com.example.switchnight.ui.theme.onBackgroundDarkHighContrast
import com.example.switchnight.ui.theme.onBackgroundDarkMediumContrast
import com.example.switchnight.ui.theme.onBackgroundLight
import com.example.switchnight.ui.theme.onBackgroundLightHighContrast
import com.example.switchnight.ui.theme.onBackgroundLightMediumContrast
import com.example.switchnight.ui.theme.onErrorContainerDark
import com.example.switchnight.ui.theme.onErrorContainerDarkHighContrast
import com.example.switchnight.ui.theme.onErrorContainerDarkMediumContrast
import com.example.switchnight.ui.theme.onErrorContainerLight
import com.example.switchnight.ui.theme.onErrorContainerLightHighContrast
import com.example.switchnight.ui.theme.onErrorContainerLightMediumContrast
import com.example.switchnight.ui.theme.onErrorDark
import com.example.switchnight.ui.theme.onErrorDarkHighContrast
import com.example.switchnight.ui.theme.onErrorDarkMediumContrast
import com.example.switchnight.ui.theme.onErrorLight
import com.example.switchnight.ui.theme.onErrorLightHighContrast
import com.example.switchnight.ui.theme.onErrorLightMediumContrast
import com.example.switchnight.ui.theme.onPrimaryContainerDark
import com.example.switchnight.ui.theme.onPrimaryContainerDarkHighContrast
import com.example.switchnight.ui.theme.onPrimaryContainerDarkMediumContrast
import com.example.switchnight.ui.theme.onPrimaryContainerLight
import com.example.switchnight.ui.theme.onPrimaryContainerLightHighContrast
import com.example.switchnight.ui.theme.onPrimaryContainerLightMediumContrast
import com.example.switchnight.ui.theme.onPrimaryDark
import com.example.switchnight.ui.theme.onPrimaryDarkHighContrast
import com.example.switchnight.ui.theme.onPrimaryDarkMediumContrast
import com.example.switchnight.ui.theme.onPrimaryLight
import com.example.switchnight.ui.theme.onPrimaryLightHighContrast
import com.example.switchnight.ui.theme.onPrimaryLightMediumContrast
import com.example.switchnight.ui.theme.onSecondaryContainerDark
import com.example.switchnight.ui.theme.onSecondaryContainerDarkHighContrast
import com.example.switchnight.ui.theme.onSecondaryContainerDarkMediumContrast
import com.example.switchnight.ui.theme.onSecondaryContainerLight
import com.example.switchnight.ui.theme.onSecondaryContainerLightHighContrast
import com.example.switchnight.ui.theme.onSecondaryContainerLightMediumContrast
import com.example.switchnight.ui.theme.onSecondaryDark
import com.example.switchnight.ui.theme.onSecondaryDarkHighContrast
import com.example.switchnight.ui.theme.onSecondaryDarkMediumContrast
import com.example.switchnight.ui.theme.onSecondaryLight
import com.example.switchnight.ui.theme.onSecondaryLightHighContrast
import com.example.switchnight.ui.theme.onSecondaryLightMediumContrast
import com.example.switchnight.ui.theme.onSurfaceDark
import com.example.switchnight.ui.theme.onSurfaceDarkHighContrast
import com.example.switchnight.ui.theme.onSurfaceDarkMediumContrast
import com.example.switchnight.ui.theme.onSurfaceLight
import com.example.switchnight.ui.theme.onSurfaceLightHighContrast
import com.example.switchnight.ui.theme.onSurfaceLightMediumContrast
import com.example.switchnight.ui.theme.onSurfaceVariantDark
import com.example.switchnight.ui.theme.onSurfaceVariantDarkHighContrast
import com.example.switchnight.ui.theme.onSurfaceVariantDarkMediumContrast
import com.example.switchnight.ui.theme.onSurfaceVariantLight
import com.example.switchnight.ui.theme.onSurfaceVariantLightHighContrast
import com.example.switchnight.ui.theme.onSurfaceVariantLightMediumContrast
import com.example.switchnight.ui.theme.onTertiaryContainerDark
import com.example.switchnight.ui.theme.onTertiaryContainerDarkHighContrast
import com.example.switchnight.ui.theme.onTertiaryContainerDarkMediumContrast
import com.example.switchnight.ui.theme.onTertiaryContainerLight
import com.example.switchnight.ui.theme.onTertiaryContainerLightHighContrast
import com.example.switchnight.ui.theme.onTertiaryContainerLightMediumContrast
import com.example.switchnight.ui.theme.onTertiaryDark
import com.example.switchnight.ui.theme.onTertiaryDarkHighContrast
import com.example.switchnight.ui.theme.onTertiaryDarkMediumContrast
import com.example.switchnight.ui.theme.onTertiaryLight
import com.example.switchnight.ui.theme.onTertiaryLightHighContrast
import com.example.switchnight.ui.theme.onTertiaryLightMediumContrast
import com.example.switchnight.ui.theme.outlineDark
import com.example.switchnight.ui.theme.outlineDarkHighContrast
import com.example.switchnight.ui.theme.outlineDarkMediumContrast
import com.example.switchnight.ui.theme.outlineLight
import com.example.switchnight.ui.theme.outlineLightHighContrast
import com.example.switchnight.ui.theme.outlineLightMediumContrast
import com.example.switchnight.ui.theme.outlineVariantDark
import com.example.switchnight.ui.theme.outlineVariantDarkHighContrast
import com.example.switchnight.ui.theme.outlineVariantDarkMediumContrast
import com.example.switchnight.ui.theme.outlineVariantLight
import com.example.switchnight.ui.theme.outlineVariantLightHighContrast
import com.example.switchnight.ui.theme.outlineVariantLightMediumContrast
import com.example.switchnight.ui.theme.primaryContainerDark
import com.example.switchnight.ui.theme.primaryContainerDarkHighContrast
import com.example.switchnight.ui.theme.primaryContainerDarkMediumContrast
import com.example.switchnight.ui.theme.primaryContainerLight
import com.example.switchnight.ui.theme.primaryContainerLightHighContrast
import com.example.switchnight.ui.theme.primaryContainerLightMediumContrast
import com.example.switchnight.ui.theme.primaryDark
import com.example.switchnight.ui.theme.primaryDarkHighContrast
import com.example.switchnight.ui.theme.primaryDarkMediumContrast
import com.example.switchnight.ui.theme.primaryLight
import com.example.switchnight.ui.theme.primaryLightHighContrast
import com.example.switchnight.ui.theme.primaryLightMediumContrast
import com.example.switchnight.ui.theme.scrimDark
import com.example.switchnight.ui.theme.scrimDarkHighContrast
import com.example.switchnight.ui.theme.scrimDarkMediumContrast
import com.example.switchnight.ui.theme.scrimLight
import com.example.switchnight.ui.theme.scrimLightHighContrast
import com.example.switchnight.ui.theme.scrimLightMediumContrast
import com.example.switchnight.ui.theme.secondaryContainerDark
import com.example.switchnight.ui.theme.secondaryContainerDarkHighContrast
import com.example.switchnight.ui.theme.secondaryContainerDarkMediumContrast
import com.example.switchnight.ui.theme.secondaryContainerLight
import com.example.switchnight.ui.theme.secondaryContainerLightHighContrast
import com.example.switchnight.ui.theme.secondaryContainerLightMediumContrast
import com.example.switchnight.ui.theme.secondaryDark
import com.example.switchnight.ui.theme.secondaryDarkHighContrast
import com.example.switchnight.ui.theme.secondaryDarkMediumContrast
import com.example.switchnight.ui.theme.secondaryLight
import com.example.switchnight.ui.theme.secondaryLightHighContrast
import com.example.switchnight.ui.theme.secondaryLightMediumContrast
import com.example.switchnight.ui.theme.surfaceBrightDark
import com.example.switchnight.ui.theme.surfaceBrightDarkHighContrast
import com.example.switchnight.ui.theme.surfaceBrightDarkMediumContrast
import com.example.switchnight.ui.theme.surfaceBrightLight
import com.example.switchnight.ui.theme.surfaceBrightLightHighContrast
import com.example.switchnight.ui.theme.surfaceBrightLightMediumContrast
import com.example.switchnight.ui.theme.surfaceContainerDark
import com.example.switchnight.ui.theme.surfaceContainerDarkHighContrast
import com.example.switchnight.ui.theme.surfaceContainerDarkMediumContrast
import com.example.switchnight.ui.theme.surfaceContainerHighDark
import com.example.switchnight.ui.theme.surfaceContainerHighDarkHighContrast
import com.example.switchnight.ui.theme.surfaceContainerHighDarkMediumContrast
import com.example.switchnight.ui.theme.surfaceContainerHighLight
import com.example.switchnight.ui.theme.surfaceContainerHighLightHighContrast
import com.example.switchnight.ui.theme.surfaceContainerHighLightMediumContrast
import com.example.switchnight.ui.theme.surfaceContainerHighestDark
import com.example.switchnight.ui.theme.surfaceContainerHighestDarkHighContrast
import com.example.switchnight.ui.theme.surfaceContainerHighestDarkMediumContrast
import com.example.switchnight.ui.theme.surfaceContainerHighestLight
import com.example.switchnight.ui.theme.surfaceContainerHighestLightHighContrast
import com.example.switchnight.ui.theme.surfaceContainerHighestLightMediumContrast
import com.example.switchnight.ui.theme.surfaceContainerLight
import com.example.switchnight.ui.theme.surfaceContainerLightHighContrast
import com.example.switchnight.ui.theme.surfaceContainerLightMediumContrast
import com.example.switchnight.ui.theme.surfaceContainerLowDark
import com.example.switchnight.ui.theme.surfaceContainerLowDarkHighContrast
import com.example.switchnight.ui.theme.surfaceContainerLowDarkMediumContrast
import com.example.switchnight.ui.theme.surfaceContainerLowLight
import com.example.switchnight.ui.theme.surfaceContainerLowLightHighContrast
import com.example.switchnight.ui.theme.surfaceContainerLowLightMediumContrast
import com.example.switchnight.ui.theme.surfaceContainerLowestDark
import com.example.switchnight.ui.theme.surfaceContainerLowestDarkHighContrast
import com.example.switchnight.ui.theme.surfaceContainerLowestDarkMediumContrast
import com.example.switchnight.ui.theme.surfaceContainerLowestLight
import com.example.switchnight.ui.theme.surfaceContainerLowestLightHighContrast
import com.example.switchnight.ui.theme.surfaceContainerLowestLightMediumContrast
import com.example.switchnight.ui.theme.surfaceDark
import com.example.switchnight.ui.theme.surfaceDarkHighContrast
import com.example.switchnight.ui.theme.surfaceDarkMediumContrast
import com.example.switchnight.ui.theme.surfaceDimDark
import com.example.switchnight.ui.theme.surfaceDimDarkHighContrast
import com.example.switchnight.ui.theme.surfaceDimDarkMediumContrast
import com.example.switchnight.ui.theme.surfaceDimLight
import com.example.switchnight.ui.theme.surfaceDimLightHighContrast
import com.example.switchnight.ui.theme.surfaceDimLightMediumContrast
import com.example.switchnight.ui.theme.surfaceLight
import com.example.switchnight.ui.theme.surfaceLightHighContrast
import com.example.switchnight.ui.theme.surfaceLightMediumContrast
import com.example.switchnight.ui.theme.surfaceVariantDark
import com.example.switchnight.ui.theme.surfaceVariantDarkHighContrast
import com.example.switchnight.ui.theme.surfaceVariantDarkMediumContrast
import com.example.switchnight.ui.theme.surfaceVariantLight
import com.example.switchnight.ui.theme.surfaceVariantLightHighContrast
import com.example.switchnight.ui.theme.surfaceVariantLightMediumContrast
import com.example.switchnight.ui.theme.tertiaryContainerDark
import com.example.switchnight.ui.theme.tertiaryContainerDarkHighContrast
import com.example.switchnight.ui.theme.tertiaryContainerDarkMediumContrast
import com.example.switchnight.ui.theme.tertiaryContainerLight
import com.example.switchnight.ui.theme.tertiaryContainerLightHighContrast
import com.example.switchnight.ui.theme.tertiaryContainerLightMediumContrast
import com.example.switchnight.ui.theme.tertiaryDark
import com.example.switchnight.ui.theme.tertiaryDarkHighContrast
import com.example.switchnight.ui.theme.tertiaryDarkMediumContrast
import com.example.switchnight.ui.theme.tertiaryLight
import com.example.switchnight.ui.theme.tertiaryLightHighContrast
import com.example.switchnight.ui.theme.tertiaryLightMediumContrast

private val lightScheme = lightColorScheme(
    primary = primaryLight,
    onPrimary = onPrimaryLight,
    primaryContainer = primaryContainerLight,
    onPrimaryContainer = onPrimaryContainerLight,
    secondary = secondaryLight,
    onSecondary = onSecondaryLight,
    secondaryContainer = secondaryContainerLight,
    onSecondaryContainer = onSecondaryContainerLight,
    tertiary = tertiaryLight,
    onTertiary = onTertiaryLight,
    tertiaryContainer = tertiaryContainerLight,
    onTertiaryContainer = onTertiaryContainerLight,
    error = errorLight,
    onError = onErrorLight,
    errorContainer = errorContainerLight,
    onErrorContainer = onErrorContainerLight,
    background = backgroundLight,
    onBackground = onBackgroundLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight,
    surfaceVariant = surfaceVariantLight,
    onSurfaceVariant = onSurfaceVariantLight,
    outline = outlineLight,
    outlineVariant = outlineVariantLight,
    scrim = scrimLight,
    inverseSurface = inverseSurfaceLight,
    inverseOnSurface = inverseOnSurfaceLight,
    inversePrimary = inversePrimaryLight,
    surfaceDim = surfaceDimLight,
    surfaceBright = surfaceBrightLight,
    surfaceContainerLowest = surfaceContainerLowestLight,
    surfaceContainerLow = surfaceContainerLowLight,
    surfaceContainer = surfaceContainerLight,
    surfaceContainerHigh = surfaceContainerHighLight,
    surfaceContainerHighest = surfaceContainerHighestLight,
)

private val darkScheme = darkColorScheme(
    primary = primaryDark,
    onPrimary = onPrimaryDark,
    primaryContainer = primaryContainerDark,
    onPrimaryContainer = onPrimaryContainerDark,
    secondary = secondaryDark,
    onSecondary = onSecondaryDark,
    secondaryContainer = secondaryContainerDark,
    onSecondaryContainer = onSecondaryContainerDark,
    tertiary = tertiaryDark,
    onTertiary = onTertiaryDark,
    tertiaryContainer = tertiaryContainerDark,
    onTertiaryContainer = onTertiaryContainerDark,
    error = errorDark,
    onError = onErrorDark,
    errorContainer = errorContainerDark,
    onErrorContainer = onErrorContainerDark,
    background = backgroundDark,
    onBackground = onBackgroundDark,
    surface = surfaceDark,
    onSurface = onSurfaceDark,
    surfaceVariant = surfaceVariantDark,
    onSurfaceVariant = onSurfaceVariantDark,
    outline = outlineDark,
    outlineVariant = outlineVariantDark,
    scrim = scrimDark,
    inverseSurface = inverseSurfaceDark,
    inverseOnSurface = inverseOnSurfaceDark,
    inversePrimary = inversePrimaryDark,
    surfaceDim = surfaceDimDark,
    surfaceBright = surfaceBrightDark,
    surfaceContainerLowest = surfaceContainerLowestDark,
    surfaceContainerLow = surfaceContainerLowDark,
    surfaceContainer = surfaceContainerDark,
    surfaceContainerHigh = surfaceContainerHighDark,
    surfaceContainerHighest = surfaceContainerHighestDark,
)

private val mediumContrastLightColorScheme = lightColorScheme(
    primary = primaryLightMediumContrast,
    onPrimary = onPrimaryLightMediumContrast,
    primaryContainer = primaryContainerLightMediumContrast,
    onPrimaryContainer = onPrimaryContainerLightMediumContrast,
    secondary = secondaryLightMediumContrast,
    onSecondary = onSecondaryLightMediumContrast,
    secondaryContainer = secondaryContainerLightMediumContrast,
    onSecondaryContainer = onSecondaryContainerLightMediumContrast,
    tertiary = tertiaryLightMediumContrast,
    onTertiary = onTertiaryLightMediumContrast,
    tertiaryContainer = tertiaryContainerLightMediumContrast,
    onTertiaryContainer = onTertiaryContainerLightMediumContrast,
    error = errorLightMediumContrast,
    onError = onErrorLightMediumContrast,
    errorContainer = errorContainerLightMediumContrast,
    onErrorContainer = onErrorContainerLightMediumContrast,
    background = backgroundLightMediumContrast,
    onBackground = onBackgroundLightMediumContrast,
    surface = surfaceLightMediumContrast,
    onSurface = onSurfaceLightMediumContrast,
    surfaceVariant = surfaceVariantLightMediumContrast,
    onSurfaceVariant = onSurfaceVariantLightMediumContrast,
    outline = outlineLightMediumContrast,
    outlineVariant = outlineVariantLightMediumContrast,
    scrim = scrimLightMediumContrast,
    inverseSurface = inverseSurfaceLightMediumContrast,
    inverseOnSurface = inverseOnSurfaceLightMediumContrast,
    inversePrimary = inversePrimaryLightMediumContrast,
    surfaceDim = surfaceDimLightMediumContrast,
    surfaceBright = surfaceBrightLightMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestLightMediumContrast,
    surfaceContainerLow = surfaceContainerLowLightMediumContrast,
    surfaceContainer = surfaceContainerLightMediumContrast,
    surfaceContainerHigh = surfaceContainerHighLightMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestLightMediumContrast,
)

private val highContrastLightColorScheme = lightColorScheme(
    primary = primaryLightHighContrast,
    onPrimary = onPrimaryLightHighContrast,
    primaryContainer = primaryContainerLightHighContrast,
    onPrimaryContainer = onPrimaryContainerLightHighContrast,
    secondary = secondaryLightHighContrast,
    onSecondary = onSecondaryLightHighContrast,
    secondaryContainer = secondaryContainerLightHighContrast,
    onSecondaryContainer = onSecondaryContainerLightHighContrast,
    tertiary = tertiaryLightHighContrast,
    onTertiary = onTertiaryLightHighContrast,
    tertiaryContainer = tertiaryContainerLightHighContrast,
    onTertiaryContainer = onTertiaryContainerLightHighContrast,
    error = errorLightHighContrast,
    onError = onErrorLightHighContrast,
    errorContainer = errorContainerLightHighContrast,
    onErrorContainer = onErrorContainerLightHighContrast,
    background = backgroundLightHighContrast,
    onBackground = onBackgroundLightHighContrast,
    surface = surfaceLightHighContrast,
    onSurface = onSurfaceLightHighContrast,
    surfaceVariant = surfaceVariantLightHighContrast,
    onSurfaceVariant = onSurfaceVariantLightHighContrast,
    outline = outlineLightHighContrast,
    outlineVariant = outlineVariantLightHighContrast,
    scrim = scrimLightHighContrast,
    inverseSurface = inverseSurfaceLightHighContrast,
    inverseOnSurface = inverseOnSurfaceLightHighContrast,
    inversePrimary = inversePrimaryLightHighContrast,
    surfaceDim = surfaceDimLightHighContrast,
    surfaceBright = surfaceBrightLightHighContrast,
    surfaceContainerLowest = surfaceContainerLowestLightHighContrast,
    surfaceContainerLow = surfaceContainerLowLightHighContrast,
    surfaceContainer = surfaceContainerLightHighContrast,
    surfaceContainerHigh = surfaceContainerHighLightHighContrast,
    surfaceContainerHighest = surfaceContainerHighestLightHighContrast,
)

private val mediumContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkMediumContrast,
    onPrimary = onPrimaryDarkMediumContrast,
    primaryContainer = primaryContainerDarkMediumContrast,
    onPrimaryContainer = onPrimaryContainerDarkMediumContrast,
    secondary = secondaryDarkMediumContrast,
    onSecondary = onSecondaryDarkMediumContrast,
    secondaryContainer = secondaryContainerDarkMediumContrast,
    onSecondaryContainer = onSecondaryContainerDarkMediumContrast,
    tertiary = tertiaryDarkMediumContrast,
    onTertiary = onTertiaryDarkMediumContrast,
    tertiaryContainer = tertiaryContainerDarkMediumContrast,
    onTertiaryContainer = onTertiaryContainerDarkMediumContrast,
    error = errorDarkMediumContrast,
    onError = onErrorDarkMediumContrast,
    errorContainer = errorContainerDarkMediumContrast,
    onErrorContainer = onErrorContainerDarkMediumContrast,
    background = backgroundDarkMediumContrast,
    onBackground = onBackgroundDarkMediumContrast,
    surface = surfaceDarkMediumContrast,
    onSurface = onSurfaceDarkMediumContrast,
    surfaceVariant = surfaceVariantDarkMediumContrast,
    onSurfaceVariant = onSurfaceVariantDarkMediumContrast,
    outline = outlineDarkMediumContrast,
    outlineVariant = outlineVariantDarkMediumContrast,
    scrim = scrimDarkMediumContrast,
    inverseSurface = inverseSurfaceDarkMediumContrast,
    inverseOnSurface = inverseOnSurfaceDarkMediumContrast,
    inversePrimary = inversePrimaryDarkMediumContrast,
    surfaceDim = surfaceDimDarkMediumContrast,
    surfaceBright = surfaceBrightDarkMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkMediumContrast,
    surfaceContainerLow = surfaceContainerLowDarkMediumContrast,
    surfaceContainer = surfaceContainerDarkMediumContrast,
    surfaceContainerHigh = surfaceContainerHighDarkMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkMediumContrast,
)

private val highContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkHighContrast,
    onPrimary = onPrimaryDarkHighContrast,
    primaryContainer = primaryContainerDarkHighContrast,
    onPrimaryContainer = onPrimaryContainerDarkHighContrast,
    secondary = secondaryDarkHighContrast,
    onSecondary = onSecondaryDarkHighContrast,
    secondaryContainer = secondaryContainerDarkHighContrast,
    onSecondaryContainer = onSecondaryContainerDarkHighContrast,
    tertiary = tertiaryDarkHighContrast,
    onTertiary = onTertiaryDarkHighContrast,
    tertiaryContainer = tertiaryContainerDarkHighContrast,
    onTertiaryContainer = onTertiaryContainerDarkHighContrast,
    error = errorDarkHighContrast,
    onError = onErrorDarkHighContrast,
    errorContainer = errorContainerDarkHighContrast,
    onErrorContainer = onErrorContainerDarkHighContrast,
    background = backgroundDarkHighContrast,
    onBackground = onBackgroundDarkHighContrast,
    surface = surfaceDarkHighContrast,
    onSurface = onSurfaceDarkHighContrast,
    surfaceVariant = surfaceVariantDarkHighContrast,
    onSurfaceVariant = onSurfaceVariantDarkHighContrast,
    outline = outlineDarkHighContrast,
    outlineVariant = outlineVariantDarkHighContrast,
    scrim = scrimDarkHighContrast,
    inverseSurface = inverseSurfaceDarkHighContrast,
    inverseOnSurface = inverseOnSurfaceDarkHighContrast,
    inversePrimary = inversePrimaryDarkHighContrast,
    surfaceDim = surfaceDimDarkHighContrast,
    surfaceBright = surfaceBrightDarkHighContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkHighContrast,
    surfaceContainerLow = surfaceContainerLowDarkHighContrast,
    surfaceContainer = surfaceContainerDarkHighContrast,
    surfaceContainerHigh = surfaceContainerHighDarkHighContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkHighContrast,
)

@Immutable
data class ColorFamily(
    val color: Color,
    val onColor: Color,
    val colorContainer: Color,
    val onColorContainer: Color
)

val unspecified_scheme = ColorFamily(
    Color.Unspecified, Color.Unspecified, Color.Unspecified, Color.Unspecified
)

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable() () -> Unit
) {
  val colorScheme = when {
      dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
          val context = LocalContext.current
          if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
      }
      
      darkTheme -> darkScheme
      else -> lightScheme
  }

  MaterialTheme(
    colorScheme = colorScheme,
    typography = AppTypography,
    content = content
  )
}

