package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties(
    val jasperCompilerTargetVM: ConfigNodePropertyString? = null,
    val jasperCompilerSourceVM: ConfigNodePropertyString? = null,
    val jasperClassdebuginfo: ConfigNodePropertyBoolean? = null,
    val jasperEnablePooling: ConfigNodePropertyBoolean? = null,
    val jasperIeClassId: ConfigNodePropertyString? = null,
    val jasperGenStringAsCharArray: ConfigNodePropertyBoolean? = null,
    val jasperKeepgenerated: ConfigNodePropertyBoolean? = null,
    val jasperMappedfile: ConfigNodePropertyBoolean? = null,
    val jasperTrimSpaces: ConfigNodePropertyBoolean? = null,
    val jasperDisplaySourceFragments: ConfigNodePropertyBoolean? = null,
    val defaultIsSession: ConfigNodePropertyBoolean? = null
)
