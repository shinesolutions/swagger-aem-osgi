@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqAuthImplLoginSelectorHandlerProperties(
    @field:JsonProperty("path")
    val path: ConfigNodePropertyString? = null,

    @field:JsonProperty("service.ranking")
    val serviceRanking: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("auth.loginselector.mappings")
    val authLoginselectorMappings: ConfigNodePropertyArray? = null,

    @field:JsonProperty("auth.loginselector.changepw.mappings")
    val authLoginselectorChangepwMappings: ConfigNodePropertyArray? = null,

    @field:JsonProperty("auth.loginselector.defaultloginpage")
    val authLoginselectorDefaultloginpage: ConfigNodePropertyString? = null,

    @field:JsonProperty("auth.loginselector.defaultchangepwpage")
    val authLoginselectorDefaultchangepwpage: ConfigNodePropertyString? = null,

    @field:JsonProperty("auth.loginselector.handle")
    val authLoginselectorHandle: ConfigNodePropertyArray? = null,

    @field:JsonProperty("auth.loginselector.handle.all.extensions")
    val authLoginselectorHandleAllExtensions: ConfigNodePropertyBoolean? = null,

)
