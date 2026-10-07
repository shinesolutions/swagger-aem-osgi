@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqSecurityACLSetupProperties(
    @field:JsonProperty("cq.aclsetup.rules")
    val cqAclsetupRules: ConfigNodePropertyArray? = null,

)
