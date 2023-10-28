package xyz.n8i.fermie.service.impl

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import xyz.n8i.fermie.constant.enums.ResponseStatusCode
import xyz.n8i.fermie.model.dto.FermentDto
import xyz.n8i.fermie.model.entity.data.FermentEntity
import xyz.n8i.fermie.model.misc.DeletableModel
import xyz.n8i.fermie.model.misc.ReadableModel
import xyz.n8i.fermie.model.misc.UpdatableModel
import xyz.n8i.fermie.model.rest.request.FermentRequest
import xyz.n8i.fermie.model.rest.response.BaseResponse
import xyz.n8i.fermie.repository.jpa.data.FermentRepository
import xyz.n8i.fermie.service.FermentCrudService
import xyz.n8i.fermie.utils.extension.toDto
import java.time.LocalDateTime

@Service
class RestfulFermentCrudServiceImpl(private val fermentRepository: FermentRepository) :
    FermentCrudService<FermentRequest.RegisterFermentRequest, ReadableModel, UpdatableModel, DeletableModel, BaseResponse<FermentDto>> {

    @Transactional
    override fun register(registerData: FermentRequest.RegisterFermentRequest): BaseResponse<FermentDto> {
        return try {
            val entity = FermentEntity(
                fermCategory = registerData.category,
                fermFermentOwnerId = registerData.fermentOwnerId,
                fermTitle = registerData.title,
                fermDescription = registerData.description,
                fermNote = registerData.note,
                fermImageUrl = registerData.imageUrl,
                fermGeneration = registerData.generation,
                fermParentGenerationId = registerData.parentGenerationId,
                fermStatus = registerData.status,
                fermIsFavorite = registerData.isFavorite,
                fermStartFermentedDatetime = registerData.startFermentedDatetime,
                fermEndFermentedDatetime = registerData.endFermentedDatetime,
                fermCreateDatetime = LocalDateTime.now()
            )
            val result = this.fermentRepository.save(entity)
            BaseResponse(status = ResponseStatusCode.S000, result = result.toDto())
        } catch (e: Exception) {
            BaseResponse(status = ResponseStatusCode.E999, message = e.message)
        }
    }

}