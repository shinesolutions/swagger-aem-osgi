@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties(
    @field:JsonProperty("accountName")
    val accountName: ConfigNodePropertyString? = null,

    @field:JsonProperty("containerName")
    val containerName: ConfigNodePropertyString? = null,

    @field:JsonProperty("accessKey")
    val accessKey: ConfigNodePropertyString? = null,

    @field:JsonProperty("rootPath")
    val rootPath: ConfigNodePropertyString? = null,

    @field:JsonProperty("connectionURL")
    val connectionURL: ConfigNodePropertyString? = null,

)
