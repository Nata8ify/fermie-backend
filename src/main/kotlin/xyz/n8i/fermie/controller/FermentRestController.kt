package xyz.n8i.fermie.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import xyz.n8i.fermie.model.rest.request.FermentRequest
import xyz.n8i.fermie.service.impl.RestfulFermentCrudServiceImpl

@RestController
@RequestMapping(value = ["/ferment"])
class FermentRestController(private val restfulFermentCrudServiceImpl: RestfulFermentCrudServiceImpl) {

    @PostMapping("/register")
    fun register(@RequestBody request: FermentRequest.RegisterFermentRequest) = restfulFermentCrudServiceImpl.register(request)


}