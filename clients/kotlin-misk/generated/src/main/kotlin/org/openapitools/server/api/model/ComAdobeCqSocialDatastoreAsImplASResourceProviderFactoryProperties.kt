package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties(
    val versionId: ConfigNodePropertyString? = null,
    val cacheOn: ConfigNodePropertyBoolean? = null,
    val concurrencyLevel: ConfigNodePropertyInteger? = null,
    val cacheStartSize: ConfigNodePropertyInteger? = null,
    val cacheTtl: ConfigNodePropertyInteger? = null,
    val cacheSize: ConfigNodePropertyInteger? = null,
    val timeLimit: ConfigNodePropertyInteger? = null
)
