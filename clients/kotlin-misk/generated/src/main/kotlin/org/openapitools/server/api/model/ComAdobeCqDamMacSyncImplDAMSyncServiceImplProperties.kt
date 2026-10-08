package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties(
    val comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths: ConfigNodePropertyArray? = null,
    val comAdobeCqDamMacSyncDamsyncserviceSyncRenditions: ConfigNodePropertyBoolean? = null,
    val comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs: ConfigNodePropertyInteger? = null,
    val comAdobeCqDamMacSyncDamsyncservicePlatform: ConfigNodePropertyDropDown? = null
)
