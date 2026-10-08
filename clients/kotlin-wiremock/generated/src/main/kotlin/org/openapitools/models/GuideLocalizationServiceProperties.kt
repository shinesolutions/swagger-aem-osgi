@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GuideLocalizationServiceProperties(
    @field:JsonProperty("supportedLocales")
    val supportedLocales: ConfigNodePropertyArray? = null,

    @field:JsonProperty("Localizable Properties")
    val localizableProperties: ConfigNodePropertyArray? = null,

)
