@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties(
    @field:JsonProperty("java.classdebuginfo")
    val javaClassdebuginfo: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("java.javaEncoding")
    val javaJavaEncoding: ConfigNodePropertyString? = null,

    @field:JsonProperty("java.compilerSourceVM")
    val javaCompilerSourceVM: ConfigNodePropertyString? = null,

    @field:JsonProperty("java.compilerTargetVM")
    val javaCompilerTargetVM: ConfigNodePropertyString? = null,

)
