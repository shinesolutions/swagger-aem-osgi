@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties(
    @field:JsonProperty("user.mapping")
    val userMapping: ConfigNodePropertyArray? = null,

    @field:JsonProperty("user.default")
    val userDefault: ConfigNodePropertyString? = null,

    @field:JsonProperty("user.enable.default.mapping")
    val userEnableDefaultMapping: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("require.validation")
    val requireValidation: ConfigNodePropertyBoolean? = null,

)
