package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteRepositoryServiceUserConfigurationProperties(
    val serviceRanking: ConfigNodePropertyInteger? = null,
    val serviceusersSimpleSubjectPopulation: ConfigNodePropertyBoolean? = null,
    val serviceusersList: ConfigNodePropertyArray? = null
)
