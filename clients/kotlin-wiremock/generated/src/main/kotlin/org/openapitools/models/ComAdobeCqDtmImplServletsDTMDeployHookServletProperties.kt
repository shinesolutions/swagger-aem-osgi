@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqDtmImplServletsDTMDeployHookServletProperties(
    @field:JsonProperty("dtm.staging.ip.whitelist")
    val dtmStagingIpWhitelist: ConfigNodePropertyArray? = null,

    @field:JsonProperty("dtm.production.ip.whitelist")
    val dtmProductionIpWhitelist: ConfigNodePropertyArray? = null,

)
