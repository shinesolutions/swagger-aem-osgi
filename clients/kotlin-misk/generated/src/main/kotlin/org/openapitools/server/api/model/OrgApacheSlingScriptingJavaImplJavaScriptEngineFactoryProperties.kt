package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties(
    val javaClassdebuginfo: ConfigNodePropertyBoolean? = null,
    val javaJavaEncoding: ConfigNodePropertyString? = null,
    val javaCompilerSourceVM: ConfigNodePropertyString? = null,
    val javaCompilerTargetVM: ConfigNodePropertyString? = null
)
