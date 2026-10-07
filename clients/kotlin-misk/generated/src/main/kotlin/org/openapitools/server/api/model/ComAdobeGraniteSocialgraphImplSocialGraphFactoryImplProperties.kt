package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties(
    val group2memberRelationshipOutgoing: ConfigNodePropertyString? = null,
    val group2memberExcludedOutgoing: ConfigNodePropertyArray? = null,
    val group2memberRelationshipIncoming: ConfigNodePropertyString? = null,
    val group2memberExcludedIncoming: ConfigNodePropertyArray? = null
)
