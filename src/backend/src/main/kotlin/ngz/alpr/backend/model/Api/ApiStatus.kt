package ngz.alpr.backend.model.api

import ngz.alpr.backend.interfaces.IApiResponse
import org.springframework.http.HttpStatus

data class ApiStatus(override val status: HttpStatus?, override val message: String?) : IApiResponse;
