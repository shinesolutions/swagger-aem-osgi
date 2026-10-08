@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties(
    @field:JsonProperty("preserve.hierarchy.nodes")
    val preserveHierarchyNodes: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("ignore.versioning")
    val ignoreVersioning: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("import.acl")
    val importAcl: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("save.threshold")
    val saveThreshold: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("preserve.user.paths")
    val preserveUserPaths: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("preserve.uuid")
    val preserveUuid: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("preserve.uuid.nodetypes")
    val preserveUuidNodetypes: ConfigNodePropertyArray? = null,

    @field:JsonProperty("preserve.uuid.subtrees")
    val preserveUuidSubtrees: ConfigNodePropertyArray? = null,

    @field:JsonProperty("auto.commit")
    val autoCommit: ConfigNodePropertyBoolean? = null,

)
