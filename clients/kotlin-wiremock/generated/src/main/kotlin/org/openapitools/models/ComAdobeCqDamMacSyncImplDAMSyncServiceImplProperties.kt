@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties(
    @field:JsonProperty("com.adobe.cq.dam.mac.sync.damsyncservice.registered_paths")
    val comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths: ConfigNodePropertyArray? = null,

    @field:JsonProperty("com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions")
    val comAdobeCqDamMacSyncDamsyncserviceSyncRenditions: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("com.adobe.cq.dam.mac.sync.damsyncservice.replicate.thread.wait.ms")
    val comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("com.adobe.cq.dam.mac.sync.damsyncservice.platform")
    val comAdobeCqDamMacSyncDamsyncservicePlatform: ConfigNodePropertyDropDown? = null,

)
