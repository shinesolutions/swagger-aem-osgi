package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties(
    val archivingEnabled: ConfigNodePropertyBoolean? = null,
    val schedulerExpression: ConfigNodePropertyString? = null,
    val archiveSinceDaysCompleted: ConfigNodePropertyInteger? = null
)
