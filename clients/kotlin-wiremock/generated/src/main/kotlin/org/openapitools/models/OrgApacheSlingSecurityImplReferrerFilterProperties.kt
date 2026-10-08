@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingSecurityImplReferrerFilterProperties(
    @field:JsonProperty("allow.empty")
    val allowEmpty: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("allow.hosts")
    val allowHosts: ConfigNodePropertyArray? = null,

    @field:JsonProperty("allow.hosts.regexp")
    val allowHostsRegexp: ConfigNodePropertyArray? = null,

    @field:JsonProperty("filter.methods")
    val filterMethods: ConfigNodePropertyArray? = null,

    @field:JsonProperty("exclude.agents.regexp")
    val excludeAgentsRegexp: ConfigNodePropertyArray? = null,

)
