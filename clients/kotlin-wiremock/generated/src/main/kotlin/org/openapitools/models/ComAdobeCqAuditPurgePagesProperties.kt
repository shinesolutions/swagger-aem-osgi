@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqAuditPurgePagesProperties(
    @field:JsonProperty("auditlog.rule.name")
    val auditlogRuleName: ConfigNodePropertyString? = null,

    @field:JsonProperty("auditlog.rule.contentpath")
    val auditlogRuleContentpath: ConfigNodePropertyString? = null,

    @field:JsonProperty("auditlog.rule.minimumage")
    val auditlogRuleMinimumage: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("auditlog.rule.types")
    val auditlogRuleTypes: ConfigNodePropertyDropDown? = null,

)
