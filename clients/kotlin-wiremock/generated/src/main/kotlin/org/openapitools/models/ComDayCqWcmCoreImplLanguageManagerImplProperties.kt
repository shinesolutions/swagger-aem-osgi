@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqWcmCoreImplLanguageManagerImplProperties(
    @field:JsonProperty("langmgr.list.path")
    val langmgrListPath: ConfigNodePropertyString? = null,

    @field:JsonProperty("langmgr.country.default")
    val langmgrCountryDefault: ConfigNodePropertyArray? = null,

)
