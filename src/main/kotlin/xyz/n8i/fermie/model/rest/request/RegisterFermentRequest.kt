package xyz.n8i.fermie.model.rest.request

import com.fasterxml.jackson.annotation.JsonFormat
import xyz.n8i.fermie.constant.DatetimeFormatConstant
import xyz.n8i.fermie.model.misc.CreatableModel
import java.time.LocalDateTime

sealed class FermentRequest {

    data class RegisterFermentRequest (
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
        @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = DatetimeFormatConstant.DEFAULT) val startFermentedDatetime: LocalDateTime?,
        @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = DatetimeFormatConstant.DEFAULT) val endFermentedDatetime: LocalDateTime?
    ) : FermentRequest(), CreatableModel

}