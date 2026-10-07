package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties(
    val linkExpiredPrefix: ConfigNodePropertyString? = null,
    val linkExpiredRemove: ConfigNodePropertyBoolean? = null,
    val linkExpiredSuffix: ConfigNodePropertyString? = null,
    val linkInvalidPrefix: ConfigNodePropertyString? = null,
    val linkInvalidRemove: ConfigNodePropertyBoolean? = null,
    val linkInvalidSuffix: ConfigNodePropertyString? = null,
    val linkPredatedPrefix: ConfigNodePropertyString? = null,
    val linkPredatedRemove: ConfigNodePropertyBoolean? = null,
    val linkPredatedSuffix: ConfigNodePropertyString? = null,
    val linkWcmmodes: ConfigNodePropertyArray? = null
)
