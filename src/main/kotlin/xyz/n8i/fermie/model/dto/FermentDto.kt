package xyz.n8i.fermie.model.dto

import java.time.LocalDateTime

data class FermentDto(
    val id: Long?,
    val category: Long,
    val fermentOwnerId: Long,
    val title: String,
    val description: String?,
    val note: String?,
    val imageUrl: String,
    val generation: Int,
    val parentGenerationId: Long,
    val status: String,
    val isFavorite: Boolean,
    val startFermentedDatetime: LocalDateTime?,
    val endFermentedDatetime: LocalDateTime?,
    val createDatetime: LocalDateTime,
    val updateDatetime: LocalDateTime?
)