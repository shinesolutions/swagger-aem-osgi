@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties(
    @field:JsonProperty("asyncConfigs")
    val asyncConfigs: ConfigNodePropertyArray? = null,

    @field:JsonProperty("leaseTimeOutMinutes")
    val leaseTimeOutMinutes: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("failingIndexTimeoutSeconds")
    val failingIndexTimeoutSeconds: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("errorWarnIntervalSeconds")
    val errorWarnIntervalSeconds: ConfigNodePropertyInteger? = null,

)
