@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteRepositoryServiceUserConfigurationProperties(
    @field:JsonProperty("service.ranking")
    val serviceRanking: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("serviceusers.simpleSubjectPopulation")
    val serviceusersSimpleSubjectPopulation: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("serviceusers.list")
    val serviceusersList: ConfigNodePropertyArray? = null,

)
