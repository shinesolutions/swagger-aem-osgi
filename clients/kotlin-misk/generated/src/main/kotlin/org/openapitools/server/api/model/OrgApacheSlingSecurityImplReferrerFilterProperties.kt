package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingSecurityImplReferrerFilterProperties(
    val allowEmpty: ConfigNodePropertyBoolean? = null,
    val allowHosts: ConfigNodePropertyArray? = null,
    val allowHostsRegexp: ConfigNodePropertyArray? = null,
    val filterMethods: ConfigNodePropertyArray? = null,
    val excludeAgentsRegexp: ConfigNodePropertyArray? = null
)
