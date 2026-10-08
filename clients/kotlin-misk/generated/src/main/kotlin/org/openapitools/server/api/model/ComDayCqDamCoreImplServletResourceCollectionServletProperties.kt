package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqDamCoreImplServletResourceCollectionServletProperties(
    val slingServletResourceTypes: ConfigNodePropertyArray? = null,
    val slingServletMethods: ConfigNodePropertyString? = null,
    val slingServletSelectors: ConfigNodePropertyString? = null,
    val downloadConfig: ConfigNodePropertyString? = null,
    val viewSelector: ConfigNodePropertyString? = null,
    val sendEmail: ConfigNodePropertyBoolean? = null
)
