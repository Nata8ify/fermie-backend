package xyz.n8i.fermie.model.rest.response

import xyz.n8i.fermie.constant.CommonConstant
import xyz.n8i.fermie.constant.enums.ResponseStatusCode
import xyz.n8i.fermie.model.misc.ResponseModel

class BaseResponse<T>(
    val status: ResponseStatusCode,
    val message: String? = CommonConstant.EMPTY,
    val result: T? = null
) : ResponseModel