package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties(
    val serviceRanking: ConfigNodePropertyInteger? = null,
    val typeCollections: ConfigNodePropertyString? = null,
    val typeNoncollections: ConfigNodePropertyString? = null,
    val typeContent: ConfigNodePropertyString? = null
)
