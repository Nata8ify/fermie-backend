package xyz.n8i.fermie.service

import xyz.n8i.fermie.model.dto.FermentDto
import xyz.n8i.fermie.model.misc.*

interface FermentCrudService<C: CreatableModel, R: ReadableModel, U: UpdatableModel, D: DeletableModel, RE: ResponseModel > {

    fun register(registerData: C): RE

}