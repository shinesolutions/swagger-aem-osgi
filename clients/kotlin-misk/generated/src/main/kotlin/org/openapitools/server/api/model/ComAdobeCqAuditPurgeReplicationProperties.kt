package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqAuditPurgeReplicationProperties(
    val auditlogRuleName: ConfigNodePropertyString? = null,
    val auditlogRuleContentpath: ConfigNodePropertyString? = null,
    val auditlogRuleMinimumage: ConfigNodePropertyInteger? = null,
    val auditlogRuleTypes: ConfigNodePropertyDropDown? = null
)
