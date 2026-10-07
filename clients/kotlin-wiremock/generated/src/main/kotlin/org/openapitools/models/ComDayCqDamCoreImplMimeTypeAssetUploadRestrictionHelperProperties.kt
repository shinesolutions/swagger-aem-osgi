@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties(
    @field:JsonProperty("cq.dam.allow.all.mime")
    val cqDamAllowAllMime: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("cq.dam.allowed.asset.mimes")
    val cqDamAllowedAssetMimes: ConfigNodePropertyArray? = null,

)
