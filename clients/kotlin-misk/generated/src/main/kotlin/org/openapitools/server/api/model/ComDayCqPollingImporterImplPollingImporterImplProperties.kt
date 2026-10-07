package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqPollingImporterImplPollingImporterImplProperties(
    val importerMinInterval: ConfigNodePropertyInteger? = null,
    val importerUser: ConfigNodePropertyString? = null,
    val excludePaths: ConfigNodePropertyArray? = null,
    val includePaths: ConfigNodePropertyArray? = null
)
