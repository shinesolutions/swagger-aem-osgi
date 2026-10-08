package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties(
    val numberOfDays: ConfigNodePropertyInteger? = null,
    val ageOfFile: ConfigNodePropertyInteger? = null
)
