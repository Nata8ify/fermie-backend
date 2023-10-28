package xyz.n8i.fermie.utils.extension

import xyz.n8i.fermie.model.dto.FermentDto
import xyz.n8i.fermie.model.entity.data.FermentEntity

/**
 * Convert ferment entity model to dto model
 * */
fun FermentEntity.toDto(): FermentDto {
    return FermentDto(
        id = this@toDto.fermId,
        category = this@toDto.fermCategory,
        fermentOwnerId = this@toDto.fermFermentOwnerId,
        title = this@toDto.fermTitle,
        description = this@toDto.fermDescription,
        note = this@toDto.fermNote,
        imageUrl = this@toDto.fermImageUrl,
        generation = this@toDto.fermGeneration,
        parentGenerationId = this@toDto.fermParentGenerationId,
        status = this@toDto.fermStatus,
        isFavorite = this@toDto.fermIsFavorite,
        startFermentedDatetime = this@toDto.fermStartFermentedDatetime,
        endFermentedDatetime = this@toDto.fermEndFermentedDatetime,
        createDatetime = this@toDto.fermCreateDatetime,
        updateDatetime = this@toDto.fermUpdateDatetime,
    )
}