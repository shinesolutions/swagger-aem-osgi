@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqCommonsImplExternalizerImplProperties(
    @field:JsonProperty("externalizer.domains")
    val externalizerDomains: ConfigNodePropertyArray? = null,

    @field:JsonProperty("externalizer.host")
    val externalizerHost: ConfigNodePropertyString? = null,

    @field:JsonProperty("externalizer.contextpath")
    val externalizerContextpath: ConfigNodePropertyString? = null,

    @field:JsonProperty("externalizer.encodedpath")
    val externalizerEncodedpath: ConfigNodePropertyBoolean? = null,

)
