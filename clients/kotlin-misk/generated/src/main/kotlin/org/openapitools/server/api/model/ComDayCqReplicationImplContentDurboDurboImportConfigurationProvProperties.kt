package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties(
    val preserveHierarchyNodes: ConfigNodePropertyBoolean? = null,
    val ignoreVersioning: ConfigNodePropertyBoolean? = null,
    val importAcl: ConfigNodePropertyBoolean? = null,
    val saveThreshold: ConfigNodePropertyInteger? = null,
    val preserveUserPaths: ConfigNodePropertyBoolean? = null,
    val preserveUuid: ConfigNodePropertyBoolean? = null,
    val preserveUuidNodetypes: ConfigNodePropertyArray? = null,
    val preserveUuidSubtrees: ConfigNodePropertyArray? = null,
    val autoCommit: ConfigNodePropertyBoolean? = null
)
