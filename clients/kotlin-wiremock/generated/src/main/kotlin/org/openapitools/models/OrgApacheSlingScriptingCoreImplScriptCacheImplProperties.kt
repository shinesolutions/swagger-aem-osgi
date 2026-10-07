@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingScriptingCoreImplScriptCacheImplProperties(
    @field:JsonProperty("org.apache.sling.scripting.cache.size")
    val orgApacheSlingScriptingCacheSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("org.apache.sling.scripting.cache.additional_extensions")
    val orgApacheSlingScriptingCacheAdditionalExtensions: ConfigNodePropertyArray? = null,

)
