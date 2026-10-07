@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties(
    @field:JsonProperty("numberOfDays")
    val numberOfDays: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("ageOfFile")
    val ageOfFile: ConfigNodePropertyInteger? = null,

)
